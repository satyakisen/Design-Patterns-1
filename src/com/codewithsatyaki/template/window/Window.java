package com.codewithsatyaki.template.window;

public class Window {

    public void close() {
        onClosing();
        System.out.println("Closing the window");
        onClosed();
    }

    protected void onClosing() {}
    protected  void onClosed() {}
}
