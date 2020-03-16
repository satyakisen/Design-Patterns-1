package com.codewithsatyaki.template.window;

public class ChatWindow extends Window{
    @Override
    protected void onClosed() {
        System.out.println("Disconnecting from server");
    }
}
