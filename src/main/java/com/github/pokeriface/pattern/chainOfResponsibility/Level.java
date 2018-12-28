package com.github.pokeriface.pattern.chainOfResponsibility;

public enum  Level {
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    private int id;

    private Level(int id) {
        this.id = id;
    }
}
