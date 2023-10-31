package oop

//create an interface with a function responsible for
//printing an array of names provided by the user as a parameter
//in one of the implementations print the array in reverse
//in the other implementation print every name in reverse
// Define the interface
interface NamePrinter {
    fun printNames(names: Array<String>)
}


fun main() {
    // Example usage
    val names = arrayOf("Joan", "Justine", "Chloe", "Derrick")

    // Using the first implementation
    val reverseArrayPrinter: NamePrinter = ReverseArrayNamePrinter()
    reverseArrayPrinter.printNames(names)

    majina(names)
    // Using the second implementation
    val reverseNamePrinter: NamePrinter = ReverseNamePrinter()
    reverseNamePrinter.printNames(names)


}
fun majina(names: Array<String>){
    println("Printing names:")
        names.forEach { println(it) }


}
