package com.codewithsatyaki.mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {
    List<Observer> observers = new ArrayList<>();

    public void addEventHandlers(Observer observer) {
        observers.add(observer);
    }

    public void notifyEventHandlers(){
        for (Observer observer: observers)
            observer.update();
    }
}
