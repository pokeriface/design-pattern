package com.github.pokeriface.pattern.mediator;

public abstract class Mediator {

    /**
     * Mediator should be concrete object NOT interface.
     */
    private ConcreteColleague c1;
    private MaterialColleague c2;

    public ConcreteColleague getC1() {
        return this.c1;
    }

    public void setC1(ConcreteColleague c1) {
        this.c1 = c1;
    }

    public MaterialColleague getC2() {
        return this.c2;
    }

    public void setC2(MaterialColleague c2) {
        this.c2 = c2;
    }

    /**
     * Abstract method implement specific product logic.
     */
    public abstract void doSomething();
}
