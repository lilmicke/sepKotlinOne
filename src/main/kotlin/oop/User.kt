package oop


open class User(open var name: String,
                open var email: String, open var password: String) {

    private var phoneNumber:String =""
    fun setPhoneNumber(phoneNumber:String){
        this.phoneNumber=phoneNumber
    }
    fun getPhoneNumber():String{
       return this.phoneNumber
    }
    private var gender:String =""
    fun setgender(gender:String){
        this.gender=gender
        fun getGender():String{
            return this.gender
        }
    }

    fun register(){
        println("I can register")
    }
    fun login(){
        println("I can login")
    }
    fun logout(){
        println("I can logout")
    }
}
