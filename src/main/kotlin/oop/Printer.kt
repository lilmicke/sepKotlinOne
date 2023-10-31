package oop

class ReverseNamePrinter : NamePrinter {
    override fun printNames(names: Array<String>) {
        println("Printing each name in reverse:")
        names.forEach { name ->
            val reversedName = name.reversed()
            println(reversedName)
        }
    }
}