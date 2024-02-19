package com.mine.kotlintutorial

fun main(){

    //labeled for loop
    myloop@ for (i in 1..3){

        for (j in 1..3)
        {
            if(i ==2 && j==2){continue@myloop}
            println("$i  --  $j")
          //  if (i==4 && j==3){break@myloop}

        }

    }


}