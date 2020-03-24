package com.codewithsatyaki.observer.stock;

import java.util.ArrayList;
import java.util.List;

public class StatusBar implements Observer{
    private List<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
        stock.addObserver(this);
    }

    public void show() {
        for (var stock : stocks)
            System.out.println(stock);
    }

    @Override
    public void updatePrice() {
        System.out.println("Got notified");
    }
}
