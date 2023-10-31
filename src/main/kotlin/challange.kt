import java.lang.Exception

//create a function to display names of students
// on an array in the following manner
// * print only names with 5 or more characters
//*ensure the names are printed in reverse


//create a function called "login" on the function ascertain that the user
// has provided emobilis @test.com
//and emobilis 123 as the password
//hence calculate the BMI of any user using a separate
// function and display BMI results as either
//a.underweight b.normal weight c.overweight d.obese
//NB 0-18 is underweight    18.1-29=normal weight
// 29.1-34=overweight   34.1 and above =obese
//if login details are wrong display an error message



//1
fun main(args: Array<String>) {
    val names = arrayOf("Joy","Benson","Chen","Melissa","Maeve","Mickey")
    val filteredNames = names.filter { it.length>=5 }
    filteredNames.forEach{ println(it)}
   reverse()

}

fun reverse(){
    val names = arrayOf("Joy","Benson","Maeve","Mickey","Chen")
    names.forEach {
        val reversed = it.reversed()
        println(reversed)
    }

}























