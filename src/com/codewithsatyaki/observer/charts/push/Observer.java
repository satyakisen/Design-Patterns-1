package com.codewithsatyaki.observer.charts.push;

public interface Observer<T> {
    void update(T value);
}
