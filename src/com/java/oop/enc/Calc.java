package com.java.oop.enc;

public class Calc {
    private int x;
    private int y;

    public Calc() {
    }

    public Calc(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void add() {
        System.out.println("Add = " + (x + y));

    }

    public void sub() {
        System.out.println("Sub = " + (x - y));
    }
}
