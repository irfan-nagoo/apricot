package org.example.apricot.hash;

import org.jspecify.annotations.NonNull;

public class HasherStub implements Hasher {

    @Override
    public String hash(@NonNull String input) {
        return "hashed_input";
    }

    @Override
    public boolean matches(@NonNull String input, @NonNull String encodedInput) {
        return "hashed_input".equalsIgnoreCase(encodedInput);
    }
}
