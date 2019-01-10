package com.github.pokeriface.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class SafeComposite extends SafeComponent {

    private List<SafeComponent> children = new ArrayList<>();

    public void add(SafeComponent component) {
        this.children.add(component);
    }

    public void remove(SafeComponent component) {
        this.children.remove(component);
    }

    public List<SafeComponent> getChildren() {
        return this.children;
    }
}
