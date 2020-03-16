package com.codewithsatyaki.strategy.ImageStore;

public class PngCompressor implements Compressor {

    @Override
    public void compress() {
        System.out.println("Compressing in PNG");
    }
}
