package com.company.properties.abstraction.interfaces.mainExample;

public class NiceCar {
    private Engine engine ;
    CDPlayer mediaPlayer;

    public NiceCar(Engine engine, CDPlayer mediaPlayer) {
        this.engine = engine;
        this.mediaPlayer = mediaPlayer;
    }
    public NiceCar(){
        this.engine = new PowerEngine();
        this.mediaPlayer = new CDPlayer();
    }
    public void startEngine(){
        engine.start();
    }
    public void stopEngine(){
        engine.stop();
    }
    public void startMusic(){
        mediaPlayer.start();
    }
    public void stopMusic(){
        mediaPlayer.stop();
    }
    public void upgradeEngine(Engine engine){
        this.engine = engine ;
    }
}

