package com.github.pokeriface.pattern.prototype;

public class Entity {
    private String str;

    public Entity(String s1) {
        this.str = s1;
    }

    @Override
    public boolean equals(Object that) {
        boolean ret = false;
        if (that instanceof Entity) {
            Entity e = (Entity) that;
            return this.str.equals(e.str);
        }
        return ret;
    }
}
