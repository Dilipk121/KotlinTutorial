package com.mine.kotlintutorial

fun main() {

    val str1 = "Hello "
    val str2 = "Kotlin"

    val str3 = " Welcome, Developer: "

    val str4 = str3 + str1 + str2

    println(str4)

    val str5 = str3.add(str1,str2)//calling extension function

    println(str5)

    val x:Int = 100
    val y:Int = 90

    val result = y.greaterValue(x)
    println("Greater Value is $result")

}
//this is called extension function, in kotlin we can create these type of extension functions as per our needs
fun String.add(s1:String,s2:String):String{
    return this+s1+s2
}

fun Int.greaterValue(another:Int):Int{
    return if (this > another){
        this
    }else{
        another
    }
}


