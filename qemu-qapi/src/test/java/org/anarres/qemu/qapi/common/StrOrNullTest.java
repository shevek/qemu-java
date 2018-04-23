package org.anarres.qemu.qapi.common;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.anarres.qemu.qapi.api.StrOrNull;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Tests to ensure the serialization of null Optionals is handled correctly.
 *
 * Since "null" is used to omit fields, do a basic test and demonstration of the handling of
 * empty Optionals.
 */
public class StrOrNullTest {
    private static final String TEST_STRING = "My test string.";

    private static final ObjectMapper CONFIGURED_MAPPER = QApiTestUtils.getConfiguredObjectMapper();

    @Test
    public void testStringSerialization() throws JsonProcessingException {
        final StrOrNull s = new StrOrNull();
        s.s = TEST_STRING;

        String output = CONFIGURED_MAPPER.writeValueAsString(s);

        Assert.assertEquals("\"" + TEST_STRING + "\"", output);
    }

    @Test
    public void testNullSerializationWritesTheNull() throws JsonProcessingException {
        final StrOrNull s = new StrOrNull();
        s.n = Optional.empty();

        final String out = CONFIGURED_MAPPER.writeValueAsString(s);

        /*
         * The empty Optional must be explicitly serialized as "null" and not omitted per the QAPI.
         */
        final String NULL_STR = "null";
        Assert.assertEquals(NULL_STR, out);
    }

    @Test
    @Ignore("Test is informational: demonstrate the result of not configuring ObjectMapper.")
    public void testNullSerializationWithBrokenMapper() throws JsonProcessingException {
        final ObjectMapper UNCONFIGURED_MAPPER = new ObjectMapper();
        final StrOrNull s = new StrOrNull();
        s.n = Optional.empty();

        final String out = UNCONFIGURED_MAPPER.writeValueAsString(s);

        Assert.assertEquals("{\"present\":false}", out);
    }
}
