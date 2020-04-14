package com.kodilla.collections.adv.immutable.special;

public class ImmutableSpecialCases {
    public static void main(String[] args) {
        Integer a = 1160;
        Integer b = 1160;
        System.out.println(a == b);
        System.out.println(a.equals(b));
        // od -128 do 127  w zapisie bitowym 1 z przodu oznacza - / 0 z przodu oznacza +
        System.out.println("-----------");
        String x = "this is String";
        String y = "this is String";
        System.out.println(x == y);
        System.out.println(x.equals(y));
        System.out.println("------------");
        Integer c = 100;
        Integer d = 100;
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println(c == d);
        c = c + 50;
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println(c == d);
    }
}
