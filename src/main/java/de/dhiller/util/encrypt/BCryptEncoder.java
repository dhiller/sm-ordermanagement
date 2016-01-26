package de.dhiller.util.encrypt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptEncoder {

    private static final Logger log = LoggerFactory.getLogger(BCryptEncoder.class);

    public static void main(String[] args) {
        log.info(new BCryptPasswordEncoder().encode(args[0]));
    }

}
