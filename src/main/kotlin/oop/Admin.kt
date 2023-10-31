package oop

open class Admin( name:String,email:String, pasaword:String):User(name,email,pasaword) {
    fun suspendUser(){
        println("I can suspend users")
    }
}