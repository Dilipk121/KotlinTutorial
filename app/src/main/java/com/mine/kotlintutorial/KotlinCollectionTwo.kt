package com.mine.kotlintutorial

fun main() {

    val list = listOf<String>("Yogi", "Modi", "Amit shah") //immutable , fixed size , READ only

//    list[1] = "dilip" // we can not change items using their index its fixed

    for (element in list) {
        print(" $element ")
    }
    println("")
    for (element in 0..list.size - 1) {
        print(" $element : ${list[element]} ")
    }


    // Mutable listOf()
    val list_mutable = mutableListOf("Yogi", "Modi", "Amit shah") //mutable, no fixed size, we can add/remove
    //this is also the same as above
    val list_mutable1 = arrayListOf("Yogi", "Modi", "Amit shah") //mutable, no fixed size, we can add/remove
    //this is also the same as above
    val list_mutable2 = ArrayList<String>() // it also working same as above
    list_mutable2.add(0,"Apple")
    list_mutable2.add(1,"Mango")
    list_mutable2.add(2,"Orange")

    println("")
    for (element in list_mutable2) {
        print(" $element ")
    }


    list_mutable.add(3, "Dilip Boss")

    println("")
    for (element in list_mutable) {
        print(" $element ")
    }

    println("")
    list_mutable.reverse()
    for (element in list_mutable) {
        print(" $element ")
    }

    list_mutable.removeAt(2)

    println("")
    for (element in list_mutable) {
        print(" $element ")
    }

    list_mutable.remove("Amit shah")
    list_mutable.add(1,"Swami Narayan")

    println("")
    for (element in list_mutable) {
        print(" $element ")
    }

    list_mutable[1] = "Narendra Modi"
    println("")
    for (element in list_mutable) {
        print(" $element ")
    }


}