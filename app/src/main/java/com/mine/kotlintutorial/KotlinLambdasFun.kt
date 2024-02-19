package com.mine.kotlintutorial

fun main() {

    val one = Add()
    var result = 0


//    val myLambdasfun: (Int, Int) -> Int = { x:Int, y:Int -> x+y}

    //passing lambadas to high level functions
//    one.AddTwoNum(5,10,myLambdasfun) // one way

//    one.AddTwoNum(15,10,{ x, y -> x + y })  // second way

//    one.AddTwoNum(25,10) { x, y -> x + y } // third way, outside of method() like their body{}

    one.AddTwoNum(25,10) { x, y -> result = x + y } // Fourth way , using closures

    println(result)


    one.reverseAndDisplay("AnimalZoo",{ s -> s.reversed()}) // 1 way

    one.reverseAndDisplay("AnimalZoo") { s -> s.reversed() } //2nd way

    one.reverseAndDisplay("AnimalZoo") { it.reversed() } //3rd way, use only when you have single parameter


}

class Add{

//    fun AddTwoNum(a:Int,b:Int,action:(Int,Int)->Int){
//        println(action(a,b))
//    }

    fun AddTwoNum(a:Int,b:Int,action:(Int,Int)->Unit){
//        println(action(a,b))
        action(a,b)
    }

    fun reverseAndDisplay(str:String ,myFunc:(String) -> String){

        println(myFunc(str))

    }


}