package com.github.pokeriface.pattern.visitor;

public class ShowVisitor implements IShowVisitor {

    private String info = "";

    @Override
    public void report() {
        System.out.println(this.info);
    }

    @Override
    public void visit(ConcreteElement1 e) {
        this.info = this.info + e.getBasicInfo() + "\t\n";
    }

    @Override
    public void visit(ConcreteElement2 e) {
        this.info = this.info + e.getDetails() + "\t\n";
    }
}
