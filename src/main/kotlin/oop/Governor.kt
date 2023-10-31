package oop

class Governor(name:String,email:String,password:String):Mca(name, email, password) {
    fun allstudents(){
        var students = arrayOf("Derrick","Ian","Erick","Isaac","king","Joy","Monicah","Fabris","Viona")
        var countOfSkipped = 0
        for (name in students){
            if (name.length>=5){
                println(name.reversed())
            }else{
                countOfSkipped++
            }
        }
        println("names are $countOfSkipped")
    }
}
