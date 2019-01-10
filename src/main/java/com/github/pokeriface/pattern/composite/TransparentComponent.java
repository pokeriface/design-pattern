package com.github.pokeriface.pattern.composite;

import java.util.List;

public abstract class TransparentComponent {

    public void doSomething() {
        //todo.
    }


    public abstract void add(TransparentComponent component);

    public abstract void remove(TransparentComponent component);

    public abstract List<TransparentComponent> getChildren();
}
