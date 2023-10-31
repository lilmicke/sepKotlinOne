package oop


//create a class MCA on this class ensure the MCA can register and login
//through inheritance ensure a governor
// can register and login.henceforth
// allow the G to display names of students in the county
// on an array in the following manner
// print only names with 5 or more characters
//ensure names are printed in reverse
//dispaly the count of names that were skipped on the array




open class Mca (open var name:String="John" ,open var email:String="" ,open var password:String=""){

    fun register()
    {
        println("I can register")
    }
    fun login()
    {
        println("I can login")
    }


}

