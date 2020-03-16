package com.codewithsatyaki.strategy.ImageStore;

public class BNWFilter implements Filter{
    @Override
    public void apply() {
        System.out.println("Applying Black and white filter");
    }
}
