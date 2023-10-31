fun main(args: Array<String>) {

    Palindrome("2001")

}


fun Palindrome(value: String) {
    if (value.equals(value.reversed())) {
        println("this is a palindrome")

    } else {
        println("this is not a palindrome")
    }
}








