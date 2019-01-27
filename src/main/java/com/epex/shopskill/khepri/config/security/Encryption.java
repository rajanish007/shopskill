package com.epex.shopskill.khepri.config.security;

import java.nio.charset.MalformedInputException;
import java.util.Base64;

public abstract class Encryption {

    public static String encode(String passwd) throws MalformedInputException {
        if (passwd != null && passwd.length() > 0) {
            return Base64.getEncoder().encode(passwd.getBytes()).toString();
        }
        throw new MalformedInputException(0);
    }

    public static String decode(String encodedPasswd) throws MalformedInputException {
        if (encodedPasswd != null && encodedPasswd.length() > 0) {
            return Base64.getDecoder().decode(encodedPasswd.getBytes()).toString();
        }
        throw new MalformedInputException(0);
    }

}
