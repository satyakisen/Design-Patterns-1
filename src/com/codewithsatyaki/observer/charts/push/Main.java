package com.codewithsatyaki.observer.charts.push;

public class Main {
    public static void main(String[] args) {
        var source = new DataSource();
        var sheet1 = new SpreadSheet();
        var sheet2 = new SpreadSheet();
        var chart = new Charts();

        source.addObserver(sheet1);
        source.addObserver(sheet2);
        source.addObserver(chart);

        source.setValue(1);
    }
}
