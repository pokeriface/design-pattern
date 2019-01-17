package com.github.pokeriface.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject extends Subject implements Observable {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : this.observers)
            observer.action();
    }

    @Override
    public void doSomething() {
        //...
        notifyObservers();
    }
}
