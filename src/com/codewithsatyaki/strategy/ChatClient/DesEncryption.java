package com.codewithsatyaki.strategy.ChatClient;

public class DesEncryption implements Encryption {
    @Override
    public String apply(String message) {
        System.out.println("Encrypting message using DES");
        return "DES(" + message + ")";
    }
}
