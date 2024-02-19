package com.mine.kotlintutorial

fun main() {

// Map Tutorial : key-value pair

    //immutable, fixed READ only ######################################################
    val myMap = mapOf<Int,String>(0 to "Apple",11 to "Mango",2 to "Banana") //key can be non-arrangement
    val myMap1 = mapOf<Int,String>() //key can be non-arrangement

    println(myMap1.keys.size)
    // but internally its arranged as index

    for (key in myMap.keys){
        print(" "+myMap[key])
    }
    println()
    for (key in myMap.keys){
        print(" "+myMap.get(key)) //both way works well
    }
    println()
    print(" "+ myMap[1]) // its gives null at non-index valued

    //same works as above #########################################################
    val myHashMap = HashMap<Int,String>()
    myHashMap.put(0,"Yogi")
    myHashMap.put(10,"Amit Shah")
    myHashMap.put(12,"Modi")

    println()
    for (element in myHashMap){
        print(" $element ") // get both keys & elements
    }

    println()
    for (element in myHashMap.keys){
        print(" $element ") // get all keys- index value
    }
    println()
    for (element in myHashMap.keys){
        print(" ${myHashMap[element]} ") // get all elements
    }

    myHashMap.replace(10,"Dilip Boss")
    //myHashMap.put(10,"Dilip Boss")// this will also replace
    println()
    for (element in myHashMap){
        print(" $element ") // get both keys & elements
    }

    //same works as above #########################################################
    val myMutableMap = mutableMapOf<Int,String>() // basically its return linkedHashMap

    myMutableMap.put(11,"modi")
    myMutableMap.put(5,"new modi")
    myMutableMap.put(15,"yogi")

    println()
    for (element in myMutableMap){
        print(" $element ") // get both keys & elements
    }
    println()
    for (element in myMutableMap.keys){
        print(" ${myMutableMap[element]} ") // get all elements
    }



}