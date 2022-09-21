package com.java.oop.inhr;

public class Animal {
    String name   ;
    int age;
    String eyeColor;



    public Animal(){

    }
    public Animal(String name, int age, String eyeColor) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }
    public final void printAnimal(){
        System.out.println("Cat = " + name + " " + age + " " + eyeColor);
    }

    public void hi(){
        System.out.println("Hello from other side !!");
    }

    public void sound(){
        System.out.println("Animal sound");
    }
}
