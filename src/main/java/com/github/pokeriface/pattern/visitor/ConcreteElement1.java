package com.github.pokeriface.pattern.visitor;


public class ConcreteElement1 implements IElement {

    public String getBasicInfo() {
        return "Concrete Element: E1";
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
