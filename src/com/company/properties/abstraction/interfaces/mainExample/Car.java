package com.company.properties.abstraction.interfaces.mainExample;

public class Car implements Engine, Brake, MusicSystem {
    @Override
    public void start() {
        System.out.println("I start engine like a normal engine");
    }

    @Override
    public void stop() {
        System.out.println("I stop engine like a normal engine");

    }

    @Override
    public void accelerate() {
        System.out.println("I accelerate like a normal engine");
    }

    @Override
    public void applyBrake() {
        System.out.println("brakes are applied");
    }

    public void changeEngine(){
        System.out.println("engine is changed");
    }
}
