package com.mine.kotlintutorial

fun main() {

    //########################################################################
    //"SET" contains unique elements only
    val mySet = setOf<Int>(12,15,6,89,45,12,45,78) //immutable, READ only
    // its automatically remove all similar value
    //its only store unique elements
    //no duplicate allowed here

    for (index in mySet){
        print(" $index ")
    }

    //######################################################################
    val myMutableSet = mutableSetOf<Int>(12,15,6,89,45,12,45,78,99,12)
    myMutableSet.remove(12)//remove all elements
    myMutableSet.add(100) // add in last index
    println()
    for (index in myMutableSet){
        print(" $index ")
    }

    //######################################################################
    //"HashSet" also contains unique elements but sequence in not guaranteed in the output
    val myHashSet = hashSetOf<Int>(12,15,6,89,45,12,45,78,99,12)
    println()
    for (index in myHashSet){
        print(" $index ")
    }
    println()
    for (index in myHashSet){
        print(" $index ")
    }


}