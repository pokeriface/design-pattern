package com.github.pokeriface.pattern.composite;

import java.util.List;

public class TransparentLeaf extends TransparentComponent {
    @Override
    public void add(TransparentComponent component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(TransparentComponent component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<TransparentComponent> getChildren() {
        throw new UnsupportedOperationException();
    }
}
