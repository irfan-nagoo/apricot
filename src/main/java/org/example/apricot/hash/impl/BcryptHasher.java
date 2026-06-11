package org.example.apricot.hash.impl;

import org.example.apricot.hash.Hasher;
import org.jspecify.annotations.NonNull;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class BcryptHasher implements Hasher {

    private static final PasswordEncoder ENCODER = new BCryptPasswordEncoder(14);

    @Override
    public String hash(@NonNull String input) {
        return ENCODER.encode(input);
    }

    @Override
    public boolean matches(@NonNull String input, @NonNull String encodedInput) {
        return ENCODER.matches(input, encodedInput);
    }
}
