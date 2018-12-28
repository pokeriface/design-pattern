package com.github.pokeriface.pattern.prototype;

import org.junit.Assert;
import org.junit.Test;


public class PrototypeTest {

    @Test
    public void testClone() {
        Entity e = new Entity("123");
        Prototype t1 = new Prototype("12211", e);
        Prototype t2 = t1.clone();
        Assert.assertEquals(t1, t2);
        Assert.assertNotSame(t1, t2);
    }
}