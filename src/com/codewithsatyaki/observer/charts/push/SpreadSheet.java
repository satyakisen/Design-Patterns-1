package com.codewithsatyaki.observer.charts.push;

public class SpreadSheet implements Observer<Integer> {

    @Override
    public void update(Integer value) {
        System.out.println("SpreadSheet got notified: " + value);
    }
}
