package com.akshat;

public class Person {
    private int age;

    Laptop lap;

    public Person(int age, Laptop lap) {
        this.age = age;
        this.lap = lap;
    }

    public Laptop getLap() {
        return lap;
    }

    public Person(int age) {
        this.age = age;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public Person() {
        System.out.println("Object Created");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("setter called");
        this.age = age;
    }

    public void code(){
        System.out.println("Coding");
        lap.compile();

    }
}
