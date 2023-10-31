package oop

class ReverseArrayNamePrinter : NamePrinter {
    override fun printNames(names: Array<String>) {
        val reversedArray = names.reversedArray()
        println("Printing names in reverse order:")
        reversedArray.forEach { println(it) }

    }
}

class third:NamePrinter{
    override fun printNames(names: Array<String>) {
//        var uniqueNames = arrayOf<String>()
//        for (jina in names){
//            if (!uniqueNames.contains(jina)){
//                uniqueNames.add(jina)
//            }
//
//        }
//        for (kajina in uniqueNames){
//            println(kajina)
//        }
//    }
for (jina in names){
    var count = names.count{
        it==jina
    }
    if (count==1)
    {
        println(jina)}

}
    }
}


//given a function that accepts two arrays of the same length from the
// user as parameters swap the elements in the even
// indices of the first array with those
// of the second array and vice versa






