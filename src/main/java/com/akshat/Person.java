package com.akshat;

public class Person {
    private int age;

    Computer com;

//    public Person() {
//        System.out.println("Object Created");
//    }
//    public Person(int age, Computer com) {
//        this.age = age;
//        this.com = com;
//    }

//    public Person(int age) {
//        this.age = age;
//    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        System.out.println("Coding");
        com.compile();

    }
}
