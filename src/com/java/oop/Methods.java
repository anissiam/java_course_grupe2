package com.java.oop;

import java.awt.*;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {

        addNum(10,50);
        addNum();
        addNum("10","200");
        /*(7)
        maxAndMin2();
        * */

        /*
        (6)
        int y[] = {30, 20, 50, 10};
       maxAndMin1(y);
       */

        /*
       (5)

        maxAndMin();
 */
        /*
        (4)

        calc1();
        */
        /*
        (3)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x");
        int x = scanner.nextInt();
        System.out.println("Enter y");
        int y = scanner.nextInt();

        System.out.println("1)Add");
        System.out.println("2)Sub");
        System.out.println("3)Mult");
        System.out.println("4)div");

        int c = scanner.nextInt();
        calc(c, x, y);
         */
        /*(2)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x");
        int x = scanner.nextInt();
        System.out.println("Enter y");
        int y = scanner.nextInt();

        System.out.println("1)Add");
        System.out.println("2)Sub");
        System.out.println("3)Mult");
        System.out.println("4)div");

        int c = scanner.nextInt();
        switch (c){
            case 1 :
                add(x, y);
                break;
            case 2 :
                sub1(x,y);
                break;
            case 3:
                System.out.println(mult(x, y));
                break;
            case 4 :
                System.out.println(div(x, y));
                break;
            default:
                System.out.println("not valid ");
                break;
        }*/

        /*
        (1)
        int x = 10;
        int y = 20;
        add(x,y);
        sub1(x,y);
        int z = mult(x, y);
        System.out.println(z);
        System.out.println(mult(x, y));
        System.out.println(div(x, y));
        */

        //System.out.println(addNumbers2(x, y));

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first no");
        int z = scanner.nextInt();
        System.out.println("Enter sec.. no");
        int f = scanner.nextInt();
        addNumbers1(z,f);*/

        /*concat("anis"," siam");
        String a= concat1("anis", "siam");
        System.out.println(concat1("anis", "siam"));*/


    }
    private static void addNum() {
        System.out.println("Hello");
    }
    private static void addNum(int x , int y) {
        System.out.println(x + y);
    }
    private static void addNum(String x , String y) {
        System.out.println(x + y);
    }

    private static void maxAndMin2() {
        Scanner in = new Scanner(System.in);
        int[] x = new int[5];
        int f;
        for(int i =0 ; i<x.length;i++){
            System.out.println("Please enter " + (i + 1));
            f = in.nextInt();
            x[i] = f;
        }
        int min = x[0];
        int max = x[0];
        for(int i = 0; i<x.length;i++){
            if(min>x[i]){
                min = x[i];
            }
            if(max <x[i]){
                max = x[i];
            }
        }
        System.out.println("Min"+min);
        System.out.println("Max"+max);
    }
    private static void maxAndMin1(int x[]) {
        int min = x[0];
        int max = x[0];
        for(int i = 0; i<x.length;i++){
            if(min>x[i]){
                min = x[i];
            }
            if(max <x[i]){
                max = x[i];
            }
        }
        System.out.println("Min"+min);
        System.out.println("Max"+max);
    }

    private static void maxAndMin() {
        int[] x = {10, 50, 2, 3};
        int min = x[0];
        int max = x[0];
        for(int i = 0; i<x.length;i++){
            if(min>x[i]){
                min = x[i];
            }
            if(max <x[i]){
                max = x[i];
            }
        }
        System.out.println("Min"+min);
        System.out.println("Max"+max);
    }

    public static void calc1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x");
        int x = scanner.nextInt();
        System.out.println("Enter y");
        int y = scanner.nextInt();

        System.out.println("1)Add");
        System.out.println("2)Sub");
        System.out.println("3)Mult");
        System.out.println("4)div");

        int c = scanner.nextInt();
        switch (c){
            case 1 :
                add(x, y);
                break;
            case 2 :
                sub1(x,y);
                break;
            case 3:
                System.out.println(mult(x, y));
                break;
            case 4 :
                System.out.println(div(x, y));
                break;
            default:
                System.out.println("not valid ");
                break;
        }
    }
    public static void calc(int c , int x , int y){

        switch (c){
            case 1 :
                add(x, y);
                break;
            case 2 :
                sub1(x,y);
                break;
            case 3:
                System.out.println(mult(x, y));
                break;
            case 4 :
                System.out.println(div(x, y));
                break;
            default:
                System.out.println("not valid ");
                break;
        }
    }
    private static void add(int x , int y ){

        System.out.println("Add = "+ (x + y));
    }

    private static void sub1(int x , int y ){

        System.out.println(x - y);
    }

    private static int mult(int x , int y ){

        return x * y;
    }
    private static int div(int x , int y ){
        return x / y;
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
