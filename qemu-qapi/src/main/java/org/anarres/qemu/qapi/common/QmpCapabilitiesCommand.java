/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.qapi.common;

/**
 *
 * @author shevek
 */
public class QmpCapabilitiesCommand extends QApiCommand<Void, QmpCapabilitiesCommand.Response> {

    public static class Response extends QApiResponse<Void> {
    }

    public QmpCapabilitiesCommand() {
        super("qmp_capabilities", Response.class, null);
    }
}
