package com.github.liberatemetumortis;

public abstract class Person {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0) {
            throw new IllegalArgumentException("Yaş negatif olamaz!");
        }
        this.age = age*10;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void describeYourSelf() {
        System.out.println("Ben bir insanım.");
    }

}
