package com.codewithsatyaki.observer.charts.push;

import java.util.ArrayList;
import java.util.List;

public class Subject<T> {
    List<Observer<T>> observers = new ArrayList<>();

    public void addObserver(Observer<T> observer){
        observers.add(observer);
    }

    public void removeObserver(Observer<T> observer){
        observers.remove(observer);
    }

    public void notifyObserver(T value){
        for (Observer<T> observer: observers)
            observer.update(value);
    }
}
