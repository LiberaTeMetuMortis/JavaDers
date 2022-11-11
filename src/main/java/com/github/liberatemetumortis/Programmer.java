package com.github.liberatemetumortis;

public class Programmer extends Person {
    private String language;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Programmer(int age, String name, String language) {
        super(age, name);
        this.language = language;
    }

    @Override
    public String toString() {
        return "Programmer [language=" + language + ", getAge()=" + getAge() + ", getName()=" + getName() + "]";
    }

    @Override
    public void describeYourSelf() {
        System.out.println("Ben bir programcıyım.");
    }


}
