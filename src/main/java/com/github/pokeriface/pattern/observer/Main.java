package com.github.pokeriface.pattern.observer;

public class Main {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        Observer observer = new Observer1();
        subject.attach(observer);
        observer = new Observer2();
        subject.attach(observer);
        subject.doSomething();
    }
}
