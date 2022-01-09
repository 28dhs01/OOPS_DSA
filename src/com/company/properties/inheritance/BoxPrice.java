package com.company.properties.inheritance;

public class BoxPrice extends BoxWeight{
    int price ;

    public BoxPrice() {
        this.price = -1 ;
    }

    public BoxPrice(int price) {
        this.price = price;
    }

    public BoxPrice(double l, int w, int h, int weight, int price) {
        super(l, w, h, weight);
        this.price = price;
    }
    public BoxPrice(int side , int weight , int price){
        super(side,weight);
        this.price = price ;
    }
}
