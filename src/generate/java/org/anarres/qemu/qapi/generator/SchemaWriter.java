/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.qapi.generator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.generator.model.QApiElementDescriptor;
import org.apache.velocity.Template;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.context.Context;
import org.apache.velocity.runtime.log.CommonsLogLogChute;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;
import org.apache.velocity.tools.ToolManager;

/**
 *
 * @author shevek
 */
public class SchemaWriter {

    @Nonnull
    private static VelocityEngine newVelocityEngine() {
        VelocityEngine engine = new VelocityEngine();
        engine
                .setProperty(VelocityEngine.RUNTIME_LOG_LOGSYSTEM_CLASS, CommonsLogLogChute.class
                .getName());
        // engine.setProperty(VelocityEngine.RUNTIME_LOG_LOGSYSTEM_CLASS, SystemLogChute.class.getName());
        engine.setProperty(VelocityEngine.RESOURCE_LOADER,
                "classpath");
        engine.setProperty(
                "classpath.resource.loader.class", ClasspathResourceLoader.class
                .getName());
        // engine.setProperty(VelocityEngine.FILE_RESOURCE_LOADER_CACHE, "true");
        // engine.setProperty(VelocityEngine.FILE_RESOURCE_LOADER_PATH, "velocity/");
        engine.init();
        return engine;
    }
    private final ToolManager toolManager = new ToolManager(true);
    private final VelocityEngine engine = newVelocityEngine();
    private final File outputDir;
    private final SchemaModel model;
    private final String packageName;

    public SchemaWriter(File outputDir, SchemaModel model, String packageName) {
        this.outputDir = outputDir;
        this.model = model;
        this.packageName = packageName;
    }

    public void run() throws IOException {
        File outputPackageDir = new File(outputDir, packageName.replace('.', '/'));
        outputPackageDir.mkdirs();;
        for (QApiElementDescriptor element : model.elements.values()) {
            Context context = toolManager.createContext();
            Template template = engine.getTemplate("/velocity/" + element.getTemplateName() + ".vm");
            context.put("packageName", packageName);
            context.put("element", element);
            File outputFile = new File(outputPackageDir, element.getClassName() + ".java");
            FileWriter writer = new FileWriter(outputFile);
            template.merge(context, writer);
            writer.close();
        }
    }
}
