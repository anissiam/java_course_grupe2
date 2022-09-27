package com.java.oop.poly.Add;

import com.java.oop.poly.A;

public class Concat extends Calc {
    @Override
    void add(int a, int b) {
        System.out.println(a + "" + b);
    }
}
