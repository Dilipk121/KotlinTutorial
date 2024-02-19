package com.mine.kotlintutorial

import java.util.Locale

class newPerson{
    var name = "Rahul"
    var age = 25
}



fun main() {

    val newPerson = newPerson()

    println(newPerson.age)
    println(newPerson.name)


    //scope function : 'with'
    // refer context object by using 'this'

    with(newPerson){
        println("Age is = ${this.age}")
        println("Name is = $name") // you can use this it internally use there
    }

    val ageAfter5 = with(newPerson){ age + 5}

    println("Ager after 5 Years is $ageAfter5")

    //scope function : 'apply'
    newPerson.apply {
        name = "Dilip Boss" // we can assigned another vale too
        age = 35
        println("Name is == ${this.name}")
        println("Age is == $age") // you can use this it internally use there
    }
    println("Name= ${newPerson.name}")
    println("Age= ${newPerson.age}")

    //scope 'also'
    //refer by 'it'

    val numsList = mutableListOf<Int>(45,89,12,47,56)

    numsList.also {
        println("The List Element are: $it") // we can use 'it' here to call
        it.add(100)
        println("The List Element are,after adding : $numsList")
        numsList.remove(89)
        println("The List Element are,after removing : $numsList")
    }

    val dublicate_nums = numsList.also {
        it.add(200) // its add in both places
    }
    println("Original Nums== $numsList")
    println("Dublicate Nums== $dublicate_nums")


    //scope 'let'
    val name_one:String? = "nulL"

    // if it will null than this block not going to run
    name_one?.let {
        println("Name is $name_one")
        println("Name is ${name_one.reversed()}")
        println("Name is ${name_one.length}")
        println("Name is ${name_one.lowercase()}")
        println("Name is ${name_one.uppercase()}")
    }

    val string_lenght = name_one?.let { name_one.length } //it will return too

    println(string_lenght)


    //scope 'run'
    //its a combination of both 'with' and 'let' at the same time

 //   val newNullPerson:newPerson? = null  // object refer to initialized with null
    val newNullPerson:newPerson? = newPerson()  // when its null , it will not going to run

    newNullPerson?.run {
        println("Age is = ${this.age}")
        println("Name is = $name") // you can use this it internally use there
    }

}