package com.java.oop.calc;

public class Calc {
    int x;
    int y;

    public Calc(){
        System.out.println("HIIIIIIIIIIIIIIII");
    }

    public Calc(int xx, int yy){
        x = xx;
        y = yy;
    }
    public Calc(String xx, String yy){
        System.out.println(xx + " " + yy);
    }
    public Calc(String xx, int yy){
        System.out.println(xx + " " + yy);
    }

    public void add() {
        System.out.println(x + y);
    }

    public void sub() {
        System.out.println(x - y);
    }
}
