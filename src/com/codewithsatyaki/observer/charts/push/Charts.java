package com.codewithsatyaki.observer.charts.push;

public class Charts implements Observer<Integer> {
    @Override
    public void update(Integer value) {
        System.out.println("Charts got notified: " + value);
    }
}
