package org.example.apricot.encode;

import org.jspecify.annotations.NonNull;

public class EncoderDecoderStub implements EncoderDecoder {

    @Override
    public String encode(@NonNull String input) {
        return "encoded_input";
    }

    @Override
    public String decode(@NonNull String input) {
        return "sample_string";
    }
}
