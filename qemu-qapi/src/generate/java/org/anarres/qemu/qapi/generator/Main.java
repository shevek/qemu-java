/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.qapi.generator;

import java.io.File;
import java.net.URL;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.OptionSpec;

/**
 *
 * @author shevek
 */
public class Main {

    public static void main(String[] args) throws Exception {
        OptionParser parser = new OptionParser();
        OptionSpec<URL> inputOption = parser.accepts("input", "Location of qapi-schema.json")
                .withRequiredArg().ofType(URL.class).describedAs("qapi-schema.json")
                .defaultsTo(new URL("https://raw.githubusercontent.com/qemu/qemu/master/qapi/qapi-schema.json"));
        OptionSpec<String> packageOption = parser.accepts("package", "Output package name.")
                .withRequiredArg().describedAs("com.mypackage")
                .defaultsTo("org.anarres.qemu.qapi.api");
        OptionSpec<File> outputOption = parser.accepts("output", "Output directory name.")
                .withRequiredArg().ofType(File.class).describedAs("dir")
                .defaultsTo(new File("src/main/java"));
        OptionSpec<?> helpOption = parser.accepts("help", "Prints help.").forHelp();
        OptionSet options = parser.parse(args);

        if (options.has(helpOption)) {
            parser.printHelpOn(System.err);
            System.exit(1);
        }

        URL inputFile = options.valueOf(inputOption);
        File outputDir = options.valueOf(outputOption);
        String outputPackage = options.valueOf(packageOption);

        SchemaParser schemaParser = new SchemaParser(inputFile);
        SchemaModel schemaModel = schemaParser.parse();
        SchemaWriter schemaWriter = new SchemaWriter(outputDir, schemaModel, outputPackage);
        schemaWriter.run();
    }
}
