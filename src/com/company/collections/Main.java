package com.company.collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Collection<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        // below is the eg which demonstrates several common methods in both Array List and LinkedList having their
        // own implementation
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(4);
        list3.add(6);
        list3.add(7);
        list3.remove(2);
        System.out.println(list3);
        LinkedList<Integer> list4 = new LinkedList<>();
        list4.add(4);
        list4.add(6);
        list4.add(7);
        list4.remove(0);
        System.out.println(list4);

        // vector is almost same as that of ArrayList only difference is that
        // vector is asynchronous whereas ArrayList is synchronous
        // ArrayList is fast compared to vectors

        List<Integer> list5 = new Vector<>();
        list5.add(3);
        list5.add(24);
        list5.add(18);
        list5.add(7);
        list5.remove(2);
        System.out.println(list5);

    }
}
