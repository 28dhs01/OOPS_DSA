package com.company.properties.abstraction.interfaces.mainExample;

public class PowerEngine implements Engine {
    @Override
    public void start() {
        System.out.println("I start engine like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("I stop engine like a normal car");

    }

    @Override
    public void accelerate() {
        System.out.println("I accelerate like a normal car");

    }
}
