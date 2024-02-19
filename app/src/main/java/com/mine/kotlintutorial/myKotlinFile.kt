package com.mine.kotlintutorial

fun main() {

    var area = myJavaFile.getArea(10,5)
    println("Printinf from java file inside kotlin file : $area")

}

fun addTwo(a:Int,b:Int):Int{
    return a+b
}