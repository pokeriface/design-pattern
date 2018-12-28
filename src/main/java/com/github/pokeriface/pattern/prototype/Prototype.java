package com.github.pokeriface.pattern.prototype;


public class Prototype implements Cloneable {
    private String s;
    private Entity e;

    public Prototype(String s, Entity e) {
        this.s = s;
        this.e = e;
    }

    @Override
    public Prototype clone() {
        Prototype type = null;
        try {
            type = (Prototype) super.clone();
            System.out.println("clone: " + type.s);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return type;
    }

    @Override
    public boolean equals(Object that) {
        boolean ret = false;
        if (that instanceof Prototype) {
            Prototype t = (Prototype) that;
            return this.s.equals(t.s) && this.e.equals(t.e);
        }
        return ret;
    }
}
