package com.java.oop.animal;

import java.util.Scanner;

public class Main {
/*
    static Animal a;
*/
    public static void main(String[] args) {

        /*a.display();

        Animal[] animal = new Animal[5];
        animal[0] = new Animal("losy", 10);

        for (Animal animal1 : animal) {
            animal1.display();
        }*/
        data();
    }

    private static void data() {
        Animal cat = new Animal("Losy" , 4);
        Scanner in = new Scanner(System.in);
        System.out.println("1. Display\n2. Sound\n3. Print array");
        int c = in.nextInt();
        switch (c){
            case 1 :
                cat.display();break;
            case 2:
                cat.sound("Meowww");break;
            case 3:
                int[] x = {10, 20, 80, 10};
                cat.printArray(x);
                break;
        }
    }
}
