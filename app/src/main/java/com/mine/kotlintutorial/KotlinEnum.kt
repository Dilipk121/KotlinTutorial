package com.mine.kotlintutorial

fun main() {


    println(CreditCardType.GOLD.ordinal) // its return index number
    println(CreditCardType.GOLD.name) //its return name
    println(CreditCardType.GOLD.toString())  //its also return name
    println(CreditCardType.GOLD) //its also return name

    println(CreditCardType.GOLD.color)
    println("Cash Back % " + CreditCardType.GOLD.getCashBackAmount())


    //each enum object has two method: values() and ValuesOf()
   // var myConstant: Array<CreditCardType> = CreditCardType.entries.toTypedArray()
    var myConstant: Array<CreditCardType> = CreditCardType.values()
    myConstant.forEach { println(it) }


    var RahulCardType: CreditCardType = CreditCardType.PLATINUM

    println(RahulCardType.ordinal)

    //using in when statement
    when(RahulCardType){
        CreditCardType.SILVER -> println("Rahul Have Silver Card Type")
        CreditCardType.GOLD -> println("Rahul Have Gold Card Type")
        CreditCardType.PLATINUM -> println("Rahul Have Platinum Card Type")
        else -> println("Rahul Have Not Assigned Card Type")
    }



}

interface CardCashBack {

    fun getCashBackAmount():Float

}

enum class CreditCardType(var color:String,var maxLimit:Int = 100000):CardCashBack {
    SILVER("Gray",50000) {    //ordinal = 0    name="SILVER"
        override fun getCashBackAmount(): Float {
            return 0.25f
        }
    },
    GOLD("Yellow") {      //ordinal = 1    name="GOLD"
        override fun getCashBackAmount(): Float {
            return 0.35f
        }
    },
    PLATINUM("White") {   //ordinal = 2    name="PLATINUM"
        override fun getCashBackAmount(): Float {
            return 0.45f
        }
    }
}