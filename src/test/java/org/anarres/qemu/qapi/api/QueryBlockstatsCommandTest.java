/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.qapi.api;

import com.codahale.metrics.ConsoleReporter;
import com.codahale.metrics.JmxReporter;
import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.Slf4jReporter;
import com.codahale.metrics.graphite.Graphite;
import com.codahale.metrics.graphite.GraphiteReporter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.anarres.qemu.qapi.common.QApiConnection;
import org.junit.Test;

/**
 *
 * @author shevek
 */
public class QueryBlockstatsCommandTest {

    private final MetricRegistry registry = new MetricRegistry();
    private final JmxReporter jmxReporter = JmxReporter.forRegistry(registry).build();
    private final Graphite graphite = new Graphite(new java.net.InetSocketAddress("graphite.nebula.com", 2003));
    // private final GraphiteReporter graphiteReporter = GraphiteReporter.forRegistry(registry).prefixedWith("shevek.qemu").build(graphite);
    private final Slf4jReporter logReporter = Slf4jReporter.forRegistry(registry).build();

    private static class History {

        private final BlockDeviceStats stats;
        private final long time;

        public History(BlockDeviceStats stats, long time) {
            this.stats = stats;
            this.time = time;
        }
    }

    @Test
    public void testStats() throws Exception {
        jmxReporter.start();

        QApiConnection connection = new QApiConnection("localhost", 4444);
        Map<java.lang.String, History> history = new HashMap<java.lang.String, History>();
        for (;;) {
            List<BlockStats> result = connection.call(new QueryBlockstatsCommand());
            long now = System.currentTimeMillis();
            for (BlockStats stats : result) {
                BlockDeviceStats deviceStats = stats.stats;
                if (deviceStats == null)
                    continue;
                History previousStats = history.get(stats.device);
                if (previousStats != null) {
                    for (java.lang.String name : deviceStats.getFieldNames()) {
                        Long prev = (Long) previousStats.stats.getFieldByName(name);
                        Long curr = (Long) deviceStats.getFieldByName(name);
                        if (prev == null || curr == null)
                            continue;
                        double rate = (curr - prev) / (double) (now - previousStats.time);
                        registry.meter(stats.device + "." + name + ".meter").mark(curr - prev);
                        registry.histogram(stats.device + "." + name + ".rate").update((long) rate);
                    }
                }
                history.put(stats.device, new History(deviceStats, now));
                // graphiteReporter.report();
                logReporter.report();
            }
            Thread.sleep(2000);
        }
    }
}