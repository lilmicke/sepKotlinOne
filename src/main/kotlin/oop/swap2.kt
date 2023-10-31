fun main(args: Array<String>) {
    var arr1 = arrayOf("a","b","c","d","e","f","g","h")
    var arr2 = arrayOf("i","j","k","l","m","n","o","p")
    myArrays(arr1,arr2)
}




fun myArrays(firstArray:Array<String>,secondArray: Array<String>){
    for (i in firstArray.indices){
        if (i % 2 ==0){
            var arrayOneEvenValue = firstArray[i]
            var arrayTwoEvenValue = secondArray[i]

            firstArray[i]=arrayTwoEvenValue
            secondArray[i]=arrayOneEvenValue
        }
    }
    for (i in firstArray.indices){
        println(firstArray[i]+"---"+secondArray[i])
    }
}
