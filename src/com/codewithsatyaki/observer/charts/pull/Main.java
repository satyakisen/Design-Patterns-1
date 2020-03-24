package com.codewithsatyaki.observer.charts.pull;

public class Main {
    public static void main(String[] args) {
        var source = new DataSource();
        var sheet1 = new SpreadSheet(source);
        var sheet2 = new SpreadSheet(source);
        var chart = new Charts(source);

        source.addObserver(sheet1);
        source.addObserver(sheet2);
        source.addObserver(chart);

        source.setValue(1);
    }
}
