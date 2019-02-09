package com.github.pokeriface.pattern.visitor;

public interface IElement {

    public void accept(IVisitor visitor);
}
