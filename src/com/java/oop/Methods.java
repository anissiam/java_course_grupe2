package com.java.oop;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        //System.out.println(addNumbers2(x, y));

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first no");
        int z = scanner.nextInt();
        System.out.println("Enter sec.. no");
        int f = scanner.nextInt();
        addNumbers1(z,f);*/

        concat("anis"," siam");
        String a= concat1("anis", "siam");
        System.out.println(concat1("anis", "siam"));
    }


    public static void concat(String st1 , String st2){
        System.out.println(st1 + st2);
    }

    public static String concat1(String st1 , String st2){
        String co = st1 + st2;
        return co;
    }
    public static void addNumbers(){
        int x = 5;
        int y = 10;
        System.out.println(x + y);


    }

    public static void addNumbers1(int x , int y){

        System.out.println(x + y);
    }
    public static int addNumbers2(int x , int y){

        return (x+y);
    }
    public static void sub(){
        int x = 5;
        int y = 10;
        System.out.println(x -y);
    }
}
