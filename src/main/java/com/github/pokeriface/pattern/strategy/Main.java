package com.github.pokeriface.pattern.strategy;

public class Main {

    public static void main(String[] args) {

        //Strategy just a simple encapsulate. But the difference from proxy pattern is the context is not inherit from the interface which the child class inherit it.
        IStrategy strategy = new ConcreteStrategy();
        StrategyContext context = new StrategyContext(strategy);

        context.operate();
    }
}
