package com.github.pokeriface.pattern.strategy;

public enum Calculator {
    ADD("+") {
        public long exec(int a, int b) {
            return a + b;
        }
    },

    SUB("-") {
        public long exec(int a, int b) {
            return a - b;
        }
    };

    private String symbol = "";

    private Calculator(String symbol) {
        this.symbol = symbol;
    }

    public abstract long exec(int a, int b);
}
