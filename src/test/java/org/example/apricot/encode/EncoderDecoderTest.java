package org.example.apricot.encode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EncoderDecoderTest {


    @Test
    public void testEncode_HappyPath() {
        var encodedString = EncoderDecoder.INSTANCE.encode("sample_string");
        assertEquals("sample_string", EncoderDecoder.INSTANCE.decode(encodedString));
    }

}