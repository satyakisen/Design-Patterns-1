package com.codewithsatyaki.observer.charts.pull;

public class Charts implements Observer {
    private DataSource dataSource;

    public Charts(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Charts got notified: " + dataSource.getValue());
    }
}
