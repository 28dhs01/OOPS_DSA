package com.company.properties.abstraction.interfaces.mainExample;

public class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("I start engine like a Electric car");
    }

    @Override
    public void stop() {
        System.out.println("I stop engine like a Electric car");

    }

    @Override
    public void accelerate() {
        System.out.println("I accelerate like a Electric car");

    }
}
