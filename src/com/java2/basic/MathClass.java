package com.java2.basic;

public class MathClass {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int f = -20;
        double z = 20.7;
        double w = 50.3;

        double pi = Math.PI;
        System.out.println( "PI"+ pi);
        System.out.println( "abs:"+ Math.abs(f));
        System.out.println( "max:"+ Math.max(x, y));
        System.out.println( "min:"+ Math.min(x, y));
        System.out.println( "min:"+ Math.min(z, w));
        System.out.println( "ceil:"+ Math.ceil(z));
        System.out.println( "ceil:"+ Math.ceil(60.8));
        System.out.println( "floor:"+ Math.floor(w));
        System.out.println( "sqrt:"+ Math.sqrt(9));
        System.out.println( "pow:"+ Math.pow(2,3));
        System.out.println("round:" + Math.round(50.4));
        System.out.println("round:" + Math.round(z));
        System.out.println("random:" + Math.random());
        System.out.println("random:" + Math.random()*10);
    }
}
