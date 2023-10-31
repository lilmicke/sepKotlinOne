fun main(args: Array<String>) {
//    while loop
    var counterOne = 0
    while (counterOne <= 5) {
        println(counterOne)
        counterOne++
    }
//    do while loop
    var counterTwo = 10
    do {
        println(counterTwo)
        counterTwo++
    } while (counterTwo <= 15)

//    for loop
    var names = arrayOf("Jamal", "Derrick", "Ian", "Erick", "Iso")
    println(names)
    for (name in names)
    {
        println(name)
    }
for (number in 90 .. 95)
    println(number)

//    foreach loop
    names.forEach {
        println(it)
    }
//    repeat loop
    repeat(5){
        println("hello there")
    }


}