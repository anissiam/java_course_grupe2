package com.java.oop;

public class WrapperCalsses {
    public static void main(String[] args) {
        int x = 10;

        System.out.println(x);

        Integer y = 10;
        System.out.println(y);
        System.out.println(y.floatValue());
        System.out.println(y.longValue());
        System.out.println(Integer.max(10, 50));
        System.out.println(Integer.min(10, 50));
        Integer z = new Integer("10");
        System.out.println(z);

        Integer ww = 10;
        System.out.println();
        Integer xx = Integer.valueOf(10); //bject
        int yy = Integer.parseInt("10");  // priv

    }
}
