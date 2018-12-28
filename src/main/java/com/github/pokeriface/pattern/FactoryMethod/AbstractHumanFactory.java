package com.github.pokeriface.pattern.FactoryMethod;

public abstract class AbstractHumanFactory {

    public abstract <T extends Human> T createHuman(Class<T> c);
}
