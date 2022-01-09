package com.company.properties.inheritance;

public class BoxColor extends BoxWeight{
    String color ;
    BoxColor(){
        super();
        this.color = "white";
    }

    public BoxColor(double l, int w, int h, int weight, String color) {
        super(l, w, h, weight);
        this.color = color;
    }
}
