package com.innezadanka.kolekcjaList;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListMethod newArrList = new ListMethod();
        List<Object> thisList = newArrList.getExampleArrList();
        thisList.add("1");
        thisList.add("2");
        thisList.add("3");
        thisList.add("4");
        thisList.add("5");
        System.out.println(thisList.contains("1"));
        System.out.println(thisList.size());
    }
}
