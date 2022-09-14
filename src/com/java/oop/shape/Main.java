package com.java.oop.shape;

public class Main {
    public static void main(String[] args) {
        Shape ss = new Shape(10,20,"sqr");
        ss.setLength(50);

        System.out.println(ss.getLength());
        ss.disply();
        ss.area();
    }
}
