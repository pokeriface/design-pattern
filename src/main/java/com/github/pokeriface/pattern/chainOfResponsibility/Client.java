package com.github.pokeriface.pattern.chainOfResponsibility;

public class Client {

    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        handler1.setNext(new ConcreteHandler2());

        Response response = handler1.handleMessage(new Request());
    }
}
