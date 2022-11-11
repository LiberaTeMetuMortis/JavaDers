package com.github.liberatemetumortis

class Programmer(age: Int, name: String?, var language: String) : Person(age, name!!) {

    override fun toString(): String {
        return "Programmer [language=" + language + ", getAge()=" + getAge() + ", getName()=" + name + "]"
    }

    override fun describeYourSelf() {
        println("Ben bir programcıyım.")
    }
}