package com.github.liberatemetumortis

abstract class Person(private var age: Int, var name: String) {
    fun getAge(): Int {
        return age
    }

    fun setAge(age: Int) {
        require(age >= 0) { "Yaş negatif olamaz!" }
        this.age = age * 10
    }

    open fun describeYourSelf() {
        println("Ben bir insanım.")
    }
}