package com.java.oop.shape;

public class Shape {
    private int length;
    private int width;
    private String name;

    public Shape() {
    }

    public Shape(int length, int width, String name) {
        this.length = length;
        this.width = width;
        this.name = name;
    }

    public void disply() {
        System.out.println(length + " " + width +" " + name);
    }
    public void area(){
        System.out.println("Area=" + (length*width));
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
