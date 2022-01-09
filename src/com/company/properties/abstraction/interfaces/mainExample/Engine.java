package com.company.properties.abstraction.interfaces.mainExample;

public interface Engine {
    // interface contains by default abstract methods
    // and by default properties are static and final

    static final int PRICE = 75000;
    void start();
    void stop();
    void accelerate();
}
