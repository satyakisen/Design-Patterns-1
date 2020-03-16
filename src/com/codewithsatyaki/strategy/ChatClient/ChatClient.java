package com.codewithsatyaki.strategy.ChatClient;

public class ChatClient {
    public void send(String message, Encryption encryption){
        String encryptedString = encryption.apply(message);
        System.out.println("Sending the encrypted message: " + encryptedString);
    }
}
