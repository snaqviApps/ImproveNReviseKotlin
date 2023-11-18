package learn.ghar.spring.revise.inheriting.abstacts.interfacing

fun main(){
    println("Implementation - Two")
}

interface User {
    val name : String
}

abstract class DataBase : User {  }     // abstract - classes do not need to 'implement' immediately