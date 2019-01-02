package com.github.pokeriface.pattern.decorator;

public class ConcreteDecorator1 extends Decorator {
    public ConcreteDecorator1(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        this.method();
        super.operate();
    }

    public void method() {

    }
}
