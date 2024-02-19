package com.mine.kotlintutorial

import java.math.BigInteger

fun main() {

    // pass BigInteger Number as function
    //Exception in thread "main" java.lang.StackOverflowError:- we can use tailrec to prevent from these exceptions
    val result = getFibonacciNumber(100, BigInteger("1"), BigInteger("0"))
    println(result)

}

tailrec fun getFibonacciNumber(n:Int,a:BigInteger,b:BigInteger):BigInteger{

    return if (n == 0){
        b
    }else{
        getFibonacciNumber(n-1,a+b,a)
    }
// 0 1 1 2 3 5 8 13 21 .... so on is called fibonacci number
}