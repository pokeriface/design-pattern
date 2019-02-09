package com.github.pokeriface.pattern.state;

public abstract class State {

    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    abstract public void handle1();

    abstract public void handle2();
}
