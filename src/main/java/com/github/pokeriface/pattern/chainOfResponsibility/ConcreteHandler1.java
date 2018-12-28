package com.github.pokeriface.pattern.chainOfResponsibility;

public class ConcreteHandler1 extends Handler {
    protected Level getLevel() {
        return Level.LOW;
    }

    protected Response echo(Request request) {
        return null;
    }
}
