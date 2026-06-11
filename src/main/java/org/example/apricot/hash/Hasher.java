package org.example.apricot.hash;

import org.example.apricot.plugin.Plugin;
import org.jspecify.annotations.NonNull;

public interface Hasher {

    Hasher INSTANCE = (Hasher) Plugin.getInstance(Hasher.class);

    String hash(@NonNull String input);

    boolean matches(@NonNull String input, @NonNull String encodedInput);
}
