package com.codewithsatyaki.strategy.ImageStore;

public class ImageStore {
    public void store(String filename, Compressor compressor, Filter filter){
        compressor.compress();
        filter.apply();
        System.out.println(filename + " stored");
    }
}
