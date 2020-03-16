package com.codewithsatyaki.strategy.ImageStore;

public class JpegCompressor implements Compressor {
    @Override
    public void compress() {
        System.out.println("Compressing in JPEG");
    }
}
