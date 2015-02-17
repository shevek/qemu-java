/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.image;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.File;

/**
 *
 * @author shevek
 */
public class QEmuImageInfo {

    public static class FormatSpecific {
    }

    public static class Qcow2FormatSpecific {

        @JsonProperty("lazy-refcounts")
        public boolean lazyRefcounts;
    }

    @JsonProperty("filename")
    public File file;
    @JsonProperty("format")
    public QEmuImageFormat format;
    @JsonProperty("virtual-size")
    public long virtualSize;
    @JsonProperty("actual-size")
    public long actualSize;
    @JsonProperty("dirty-flag")
    public boolean dirty;

    /** qcow2 and vdi. */
    @JsonProperty("cluster-size")
    public int clusterSize;
    /** qcow2 only?. */
    @JsonProperty("full-backing-filename")
    public String backingFilenameFull;
    @JsonProperty("backing-filename")
    public String backingFilename;

}
