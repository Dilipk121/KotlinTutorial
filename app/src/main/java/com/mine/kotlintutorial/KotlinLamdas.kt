package com.mine.kotlintutorial

fun main() {

val program = Program()

    program.addTwoNUmbers(4,8)

    program.addTwoNUmbers(10,15,object : myInterface{
        override fun execute(sum: Int) {
            println(sum)
        }
    })

    //Lambda is a function or expression without name
    val myLambda: (Int) -> Unit = { s:Int -> println(s) } //Lambda Expression or [function]

    program.addTwoNUmbers(10,20,myLambda)


}

class Program{

    fun addTwoNUmbers(a:Int,b:Int){
        val sum = a+b
        println(sum)
    }

    fun addTwoNUmbers(a:Int,b:Int,action:myInterface){
        val sum = a+b
        action.execute(sum) //interface function
       // println(sum)
    }

    fun addTwoNUmbers(a:Int,b:Int,action:(Int) -> Unit){
        val sum = a+b
        action(sum) //println(s)
        // println(sum)
    }

}

interface myInterface{
    fun execute(sum:Int)
}