package com.example.kotlinsample;

public class PersonJava {
    private int age;

    private final String name;

    public PersonJava(String name){
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
}
