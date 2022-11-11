package com.github.liberatemetumortis

import java.util.*

fun main(){
    val İsmail = Programmer(10, "İsmail", "Java")
    İsmail.age = 2
    println(İsmail.age)

    var liste = arrayListOf("Selam", "Merhaba", "Nasılsın")
    liste
        .map { kelime -> "$kelime MetuMortis" }
        .forEach(::println)

    val str: String? = null;

    // Optional chaining ve Nullish coalescing
    println(str?.uppercase() ?: "Selam MetuMortis")


    val isim = "Metu"
    println("Merhaba $isim")


}