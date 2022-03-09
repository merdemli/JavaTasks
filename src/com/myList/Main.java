package com.myList;

public class Main {

    public static void main(String[] args) {

        MyList<String > cities = new MyList<String>();

        System.out.println(cities.size());

        cities.add("İzmir");
        System.out.println(cities.size() +" 1 elemanlı; İzmir eklendi");

        cities.add("İstanbul");

        System.out.println(cities.size()+ " 2 Elemanlı; İstanbul eklendi");

        System.out.println(cities.getItems());
    }
}
