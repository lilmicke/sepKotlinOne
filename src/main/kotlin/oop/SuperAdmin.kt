package oop

class SuperAdmin( name:String,email:String, pasaword:String):Admin(name, email, pasaword) {
    fun suspendAdmin(){
        println("I can suspend an admin")
    }
}