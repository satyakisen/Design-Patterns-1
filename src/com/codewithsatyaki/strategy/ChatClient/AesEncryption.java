package com.codewithsatyaki.strategy.ChatClient;

public class AesEncryption implements Encryption {
    @Override
    public String apply(String message) {
        System.out.println("Encrypting message using AES");
        return "AES(" + message + ")";
    }
}
