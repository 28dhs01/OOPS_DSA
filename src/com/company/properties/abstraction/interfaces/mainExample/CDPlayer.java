package com.company.properties.abstraction.interfaces.mainExample;

public class CDPlayer implements MusicSystem {
    @Override
    public void start() {
        System.out.println("music system started");
    }

    @Override
    public void stop() {

        System.out.println("music system stopped");
    }
}
