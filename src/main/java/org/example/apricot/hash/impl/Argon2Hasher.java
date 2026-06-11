package org.example.apricot.hash.impl;

import org.example.apricot.hash.Hasher;
import org.jspecify.annotations.NonNull;
import org.springframework.security.crypto.argon2.Argon2PasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class Argon2Hasher implements Hasher {


    private static final PasswordEncoder ENCODER = Argon2PasswordEncoder.defaultsForSpringSecurity_v5_8();

    @Override
    public String hash(@NonNull String input) {
        return ENCODER.encode(input);
    }

    @Override
    public boolean matches(@NonNull String input, @NonNull String encodedInput) {
        return ENCODER.matches(input, encodedInput);
    }


}
