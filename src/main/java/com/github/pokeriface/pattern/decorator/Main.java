package com.github.pokeriface.pattern.decorator;

public class Main {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        Decorator decorator1 = new ConcreteDecorator1(component);
        Decorator decorator2 = new ConcreteDecorator2(decorator1);
        decorator2.operate();

    }
}
