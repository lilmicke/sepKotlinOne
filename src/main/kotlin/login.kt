fun main() {
    println("enter your email")
    val email = readln()
    println("enter your password")
    val password = readln()

    if (login(email, password)) {
        println("Login successful!")
        println("Please enter your weight in kilograms:")
        val weight = readLine()?.toDoubleOrNull()

        println("Please enter your height in meters:")
        val height = readLine()?.toDoubleOrNull()

        if (weight != null && height != null) {
            val bmi = calculateBMI(weight, height)
            val bmiCategory = determineBMICategory(bmi)
            println("Your BMI is: $bmi")
            println("BMI Category: $bmiCategory")
        } else {
            println("Invalid input for weight or height.")
        }
    } else {
        println("Login failed. Incorrect email or password.")
    }
login("","")

}

fun login(email: String, password: String): Boolean {
    return email == "emobilis@test.com" && password == "emobilis123"
}

fun calculateBMI(weight: Double, height: Double): Double {
    return weight / (height * height)
}

fun determineBMICategory(bmi: Double): String {
    return when {
        bmi <= 18.0 -> "Underweight"
        bmi <= 29.0 -> "Normal weight"
        bmi <= 34.0 -> "Overweight"
        else -> "Obese"
    }
}
