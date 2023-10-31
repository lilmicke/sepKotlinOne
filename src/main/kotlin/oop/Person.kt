package oop
//create a class called person ensure person can register login
// also ask the person to give their
// age and blood group securely encapsulation


 data class Person ( var name:String){
    private var age :String =""
    fun setage(age:String){
        this.age=age
    }
    fun getage():String{
        return this.age

    }

    private var bloodgroup:String =""
    fun setbloodgroup(bloodgroup:String){
        this.bloodgroup=bloodgroup

    }
    fun getbloodgroup():String{
        return this.bloodgroup
    }


    fun register(){
        println("I can register")
    }
    fun login(){
        println("I can login")
    }
}
