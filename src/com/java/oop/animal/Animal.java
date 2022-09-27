package com.java.oop.animal;

public class Animal {
    String name;
    int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void display(){

        System.out.println(name + " " + age);
    }
    public void sound(String s){
        System.out.println(s);
    }
    public void printArray(int [] x){

        for(int i:x){
            System.out.print(i+ " ");
        }
    }
}
