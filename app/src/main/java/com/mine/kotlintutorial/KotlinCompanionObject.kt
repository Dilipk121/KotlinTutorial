package com.mine.kotlintutorial

fun main() {


    println(MyClass.id)
    println(MyClass.typeOfCustomer())

    //we can remove redundant code
    MyClass.id = 2001

    println(MyClass.id)
    println(MyClass.typeOfCustomer())

}

class MyClass(){

    //companion object is same as static can do but it called within the current class
    // we can remove object class name as previous
    companion object{
        var id = 100
        fun typeOfCustomer():String{
            return "Active Customer"
        }


}

//object realCustomer{
//    var id = 100
//    fun typeOfCustomer():String{
//        return "Active Customer"
//    }
}