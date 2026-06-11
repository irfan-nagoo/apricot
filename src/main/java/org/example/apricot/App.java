package org.example.apricot;


import org.example.apricot.encode.EncoderDecoder;
import org.example.apricot.hash.Hasher;

import java.util.logging.Logger;

public class App {

    private static final Logger LOGGER = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {

        var passwordHash = Hasher.INSTANCE.hash("sample_password");
        LOGGER.info("Hashed string: " + passwordHash);
        LOGGER.info("Matches: " + Hasher.INSTANCE.matches("sample_password", passwordHash));

        var encodedInput = EncoderDecoder.INSTANCE.encode("sample string");
        LOGGER.info("Encoded string: " + encodedInput);
        LOGGER.info("Decoded string: " + EncoderDecoder.INSTANCE.decode(encodedInput));
    }
}
