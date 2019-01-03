package com.github.pokeriface.pattern.strategy;

public class StrategyContext {

    private IStrategy strategy;

    public StrategyContext(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void operate() {
        this.strategy.operate();
    }
}
