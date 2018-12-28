package com.github.pokeriface.pattern.prototype;

public class Entity {
    private String sss;

    public Entity(String s1) {
        this.sss= s1;
    }

    @Override
    public boolean equals(Object that) {
        boolean ret = false;
        if (that instanceof Entity) {
            Entity e = (Entity) that;
            return this.sss.equals(e.sss);
        }
        return ret;
    }
}
