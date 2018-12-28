package com.github.pokeriface.pattern.chainOfResponsibility;

public class ConcreteHandler2 extends Handler {
    protected Level getLevel() {
        return Level.MEDIUM;
    }

    protected Response echo(Request request) {
        return null;
    }
}
