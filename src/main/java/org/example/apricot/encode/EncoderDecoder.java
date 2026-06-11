package org.example.apricot.encode;

import org.example.apricot.plugin.Plugin;
import org.jspecify.annotations.NonNull;

public interface EncoderDecoder {

    EncoderDecoder INSTANCE = (EncoderDecoder) Plugin.getInstance(EncoderDecoder.class);

    String encode(@NonNull String input);

    String decode(@NonNull String input);
}

