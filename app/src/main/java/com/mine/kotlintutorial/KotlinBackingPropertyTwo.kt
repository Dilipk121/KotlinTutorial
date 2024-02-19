package com.mine.kotlintutorial

fun main() {

    var newStudent = NewStudent()

    newStudent.addFavHobby("Cricket")
    newStudent.addFavHobby("FootBall")

    println(newStudent.hobbies)

//    newStudent.hobbies.remove("Cricket") // now we can not access this remove() thats why its secure

    println(newStudent.hobbies)


}

class NewStudent(){

    private val _hobbies = mutableListOf<String>()

     val hobbies:List<String>

        get() = _hobbies

    fun addFavHobby(hobbyName:String){
        _hobbies.add(hobbyName)
    }

}