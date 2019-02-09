package com.github.pokeriface.pattern.visitor;

public class ConcreteElement2 implements IElement {

    public String getDetails() {
        return "Concrete element details: E2";
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
