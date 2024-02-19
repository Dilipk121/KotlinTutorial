package com.mine.kotlintutorial

fun main() {

    Customer.id = 121
    Customer.registerCustomer()

    println(Customer.id)

    println(Customer.customerAccount)

    Customer.activeShopper("Rahul")

}

open class myRealCustomer(){

    open var customerAccount = 1001

    open fun activeShopper(active:String){
        println("Yes this customer is Active")
    }

}

//use object here to make this class like static class in java
//this is called singleton class
object Customer : myRealCustomer(){

    var id:Int = 1

    fun registerCustomer(){
        println("This Customer is Registered")
    }

    override var customerAccount: Int = 2001

    override fun activeShopper(active: String) {
        super.activeShopper(active)
        println("Hello This Customer is Valid & Active : $active")
    }

}