fun main(args: Array<String>) {
motto()
    add()
    addittion("king",20.5, 30)
    interest(1000.0,15.0,10)

}

fun motto(){
    println("hello there this is our motto")
}
fun add(){
    var x = 10
    var y = 20
    var z = x +y
    println("your answer is $z")
}
fun addittion(name:String, x:Double, y:Int){
    val answer = x + y
    println("hello $name , your answer is $answer")
}
fun interest(p:Double, r:Double, t:Int){
    val interest =(p*r*t)
    println("your interest is $interest")
}




