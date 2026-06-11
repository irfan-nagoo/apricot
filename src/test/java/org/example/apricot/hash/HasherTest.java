package org.example.apricot.hash;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HasherTest {

    @Test
    public void testEncode_HappyPath() {

        var encodedPassword = Hasher.INSTANCE.hash("sample_password");
        assertTrue(Hasher.INSTANCE.matches("sample_password", encodedPassword));
    }
}
