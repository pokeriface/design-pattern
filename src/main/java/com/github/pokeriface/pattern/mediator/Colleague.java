package com.github.pokeriface.pattern.mediator;

public abstract class Colleague {
    private Mediator m1;

    public Colleague(Mediator m1) {
        this.m1 = m1;
    }
}
