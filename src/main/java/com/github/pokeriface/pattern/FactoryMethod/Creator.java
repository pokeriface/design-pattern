package com.github.pokeriface.pattern.FactoryMethod;

public abstract class Creator {
    public abstract <T extends Product> T create(Class<T> c);
}
