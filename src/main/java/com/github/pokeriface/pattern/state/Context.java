package com.github.pokeriface.pattern.state;

public class Context {

    public final static State STATE1 = new ConcreteState1();
    public final static State STATE2 = new ConcreteState2();

    private State currentState;

    public void setCurrentState(State state) {
        this.currentState = state;
        this.currentState.setContext(this);
    }

    public State getCurrentState() {
        return this.currentState;
    }

    public void handle1() {
        this.currentState.handle1();
    }

    public void handle2() {
        this.currentState.handle2();
    }
}
