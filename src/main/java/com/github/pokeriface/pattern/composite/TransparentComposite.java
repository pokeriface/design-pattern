package com.github.pokeriface.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class TransparentComposite extends TransparentComponent {

    private List<TransparentComponent> children = new ArrayList<>();
    @Override
    public void add(TransparentComponent component) {
        this.children.add(component);
    }

    @Override
    public void remove(TransparentComponent component) {
        this.children.remove(component);
    }

    @Override
    public List<TransparentComponent> getChildren() {
        return this.children;
    }
}
