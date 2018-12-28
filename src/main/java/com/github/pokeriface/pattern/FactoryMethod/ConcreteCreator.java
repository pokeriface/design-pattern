package com.github.pokeriface.pattern.FactoryMethod;

public class ConcreteCreator extends Creator{

    public <T extends Product> T create(Class<T> c) {
        Product ret = null;
        try {
            ret = (Product) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {

        }
        return (T) ret;
    }
}
