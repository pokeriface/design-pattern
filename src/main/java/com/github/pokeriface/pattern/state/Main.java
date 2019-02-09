package com.github.pokeriface.pattern.state;

public class Main {

    public static void main(String[] args) {
        Context context = new Context();
        context.setCurrentState(Context.STATE2);

        context.handle1();
        context.handle2();
    }
}
