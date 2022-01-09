package com.company.generics.MainExample;

import java.util.ArrayList;
import java.util.Arrays;

public class WildCards<T extends Number> {
    private Object[]data;
    private int DEFAULT_SIZE = 10 ;
    private int size = 0 ;

    public WildCards() {
        this.data = new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if(this.isFull()){
            resize();
        }
        data[size] = num ;
        size++ ;
    }
    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        Object []temp = new Object[2 * data.length];
        for (int i = 0; i <data.length ; i++) {
            temp[i] = data[i];
        }
        data = temp ;
    }
    public T remove(){

        T removed = (T)(data[size-1]);
        data[size-1] = 0 ;
        size = size-1 ;
        return removed;
    }
    public T get(int index){
        T value = (T)(data[index]);
        return value ;
    }
    public void set( int index, int value ){
        data[index] = value ;
    }



    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", DEFAULT_SIZE=" + DEFAULT_SIZE +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        list.add(8);
//        list.add(77);
//        list.add(2);
//        list.add(889);
//        list.contains(77);
//        list.size();
//        list.remove(2);
//        list.indexOf(8);
//        list.set(2,7);
//        list.get(4);

        WildCards list = new WildCards();
//        list.add(7);
//        list.add(4);
//        list.add(2);
//        list.add(6);
//        System.out.println(list.toString());
//        System.out.println(list.remove());
//        System.out.println(list.toString());
//        list.add(5);
//        System.out.println(list.toString());
//        System.out.println(list.get(0));
//        list.set(8,10);
//        System.out.println(list.toString());

//        for (int i = 0; i < 15; i++) {
//            list.add(i*2);
//        }
//        System.out.println(list.toString());
       // list.add("dhruv"); // throws compile time error // to resolve use generics

        // helps to work with different dataTypes
        // generics provide type safety
        // also it provides you to which type of datatype you can add
        ArrayList<Integer> list2 = new ArrayList<>();
//        list2.add("Dhruv");

        // for wildcards take the eg of Integers and Floats both extending to Number class
        WildCards<Number> list3 = new WildCards<>();
        for (int i = 0; i < 15; i++) {
            list3.add(10.0);
        }
        System.out.println(list3.toString());
    }
}
