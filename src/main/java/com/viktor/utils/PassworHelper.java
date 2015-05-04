package com.viktor.utils;

import org.springframework.security.crypto.password.PasswordEncoder;

import javax.inject.Named;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Named
public class PassworHelper implements PasswordEncoder{


    private MessageDigest messageDigest;

    public PassworHelper() {
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    public String encode(CharSequence rawPassword) {
        if (messageDigest == null) {
            return rawPassword.toString();
        }

        messageDigest.update(rawPassword.toString().getBytes());
        byte byteData[] = messageDigest.digest();
        StringBuilder hexString = new StringBuilder();
        for (int i = 0; i < byteData.length; i++) {
            String hex = Integer.toHexString(0xff & byteData[i]);
            if (hex.length() ==1) hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
    }

    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return encode(rawPassword).equals(encodedPassword);
    }
}
