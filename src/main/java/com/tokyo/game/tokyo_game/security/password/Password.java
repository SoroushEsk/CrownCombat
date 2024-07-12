package com.tokyo.game.tokyo_game.security.password;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class Password {
    private String encryptedPassword;

    public Password(String plainTextPassword, boolean isQery) {
        if(!isQery){
            this.encryptedPassword = encrypt(plainTextPassword);
        }else {
            this.encryptedPassword = encryptedPassword;
        }

    }

    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    private String encrypt(String plainText) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(plainText.getBytes());
            return Base64.getEncoder().encodeToString(hash);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error in encryption", e);
        }
    }
    public String hash(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(input.getBytes());
            return Base64.getEncoder().encodeToString(hash);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error in hashing", e);
        }
    }
    public  boolean isPasswordCorrect(String inputPassword, String storedHash) {
        String hashedInput = hash(inputPassword);
        return hashedInput.equals(storedHash);
    }
}
