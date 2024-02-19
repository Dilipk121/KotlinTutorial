package com.mine.kotlintutorial

fun main() {

    //1 ? - safe call operator
    //2 ?: - Elvis Operator
    //3 !! not null assertion
    //4 ?.let{ .. } safe call with let

    // this all help us to get null pointer exceptions

    val name: String? = "null"

    //1 ? - safe call operator
    //return the lenght if 'name' is not null else return null
    //use it if you dont mind getting null value

    println("length of name ${name?.length}")

    //4 ?.let{ .. } safe call with let
    //it execute the block ONLY if nameis not NULL
    name?.let { println("length of name ${name.length}") }


    //2 ?: - Elvis Operator
    //when we have nullable reference 'name',we can say "is name is not null" , use it
    //otherwise use some non-null value

    val len = if (name != null) name.length else 0

    println(len)

    val length = name?.length ?: 0  // using elvis
    println(length)

    //3 !! not null assertion
    //use it when you are sure the value is not null
    //throw nullpointerexception if the value is found null
    println("length of name ${name!!.length}")
}