package com.java.oop.classes;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println(person1.age);
        person1.age = 29;
        person1.name = "anis";
        person1.tall = 170.0;
        System.out.println("Person:" + person1.name + " " + person1.age + " " + person1.tall);

        String animalname = "losy";
    }


}
