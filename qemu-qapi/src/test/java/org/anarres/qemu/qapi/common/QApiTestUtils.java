/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.qapi.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 *
 * @author shevek
 */
public class QApiTestUtils {

    @Nonnull
    public static String toJson(@CheckForNull Object o) throws IOException {
        return getConfiguredObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(o);
    }

    @Nonnull
    public static <T> T fromJson(@Nonnull String text, @Nonnull Class<T> type) throws IOException {
        return getConfiguredObjectMapper().readValue(text, type);
    }

    public static ObjectMapper getConfiguredObjectMapper() {
        return new ObjectMapper().findAndRegisterModules();
    }
}
