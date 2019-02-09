package com.github.pokeriface.pattern.visitor;

public class Main {

    public static void main(String[] args) {
        ConcreteElement1 e1 = new ConcreteElement1();
        ConcreteElement2 e2 = new ConcreteElement2();

        ShowVisitor visitor = new ShowVisitor();
        e1.accept(visitor);
        e2.accept(visitor);
        visitor.report();
    }
}
