package com.java.oop.poly.Add;


public class Main {
    public static void main(String[] args) {
        /*Calc calc = new Calc();
        calc.add(10, 50);*/

        Poly obj = new Poly();
        obj.poly(new Calc(), 10, 20);
        Calc calc = new Add();
        obj.poly(calc , 10 , 20);
        obj.poly(new Concat(), 10,20);



    }
}
