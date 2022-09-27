package com.java.oop.poly;

public class Main {
    public static void main(String[] args) {
       /* A a = new A();
        a.print();


        a= new B();
        a.print();

        a= new C();
        a.print();*/

        Ploy ploy = new Ploy();
        A obj = new C();
        ploy.print(obj);

    }
}
