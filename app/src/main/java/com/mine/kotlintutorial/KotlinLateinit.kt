package com.mine.kotlintutorial

fun main() {

    var country: Country = Country()

    country.state_name = "India"
    println(country.state_name)

    country.display()

}

class Country {

    lateinit var state_name: String

    fun display(){
        println("Country : $state_name")
    }
}