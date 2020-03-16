package com.codewithsatyaki;

import com.codewithsatyaki.strategy.ChatClient.AesEncryption;
import com.codewithsatyaki.strategy.ChatClient.ChatClient;
import com.codewithsatyaki.strategy.ImageStore.HighContrastFilter;
import com.codewithsatyaki.strategy.ImageStore.ImageStore;
import com.codewithsatyaki.strategy.ImageStore.JpegCompressor;
import com.codewithsatyaki.template.window.ChatWindow;

public class Main {
    public static void main(String[] args) {
        var client = new ChatClient();
        client.send("Hello World", new AesEncryption());

        var imagestore = new ImageStore();
        imagestore.store("a", new JpegCompressor(), new HighContrastFilter());

        var chatWindow = new ChatWindow();
        chatWindow.close();
    }
}
