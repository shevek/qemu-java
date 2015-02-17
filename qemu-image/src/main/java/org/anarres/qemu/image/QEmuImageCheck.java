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
public class QEmuImageCheck {

    @JsonProperty("filename")
    public File filename;
    @JsonProperty("format")
    public QEmuImageFormat format;
    @JsonProperty("image-end-offset")
    public long imageEndOffset;
    @JsonProperty("total-clusters")
    public int totalClusters;
    @JsonProperty("check-errors")
    public int checkErrors;
}
