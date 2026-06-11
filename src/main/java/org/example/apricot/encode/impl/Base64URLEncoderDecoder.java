package org.example.apricot.encode.impl;

import org.example.apricot.encode.EncoderDecoder;
import org.jspecify.annotations.NonNull;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64URLEncoderDecoder implements EncoderDecoder {

    @Override
    public String encode(@NonNull String input) {
        return Base64.getUrlEncoder().encodeToString(input.getBytes(StandardCharsets.UTF_8));
    }

    @Override
    public String decode(@NonNull String input) {
        return new String(Base64.getUrlDecoder().decode(input));
    }
}
