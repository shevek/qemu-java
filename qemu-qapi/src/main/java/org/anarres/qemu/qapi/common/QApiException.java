/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.qapi.common;

/**
 *
 * @author shevek
 */
public class QApiException extends Exception {

    public QApiException() {
    }

    public QApiException(String message) {
        super(message);
    }

    public QApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public QApiException(Throwable cause) {
        super(cause);
    }
}