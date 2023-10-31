fun main(args: Array<String>) {
    var marks = 90
    var grade = if (marks <=40){
        "E"
    }else if (marks <=50){
        "D"
    }else if (marks <=50){
        "D"}
    else if (marks <=50){
        "D"}
    else{
        "A"
    }
    println(grade)


    var bettingNumber = 0
    var bettingResult = when (bettingNumber){
        1->{
            "you lost"
        }
        2->{
            "you won"
        }else ->{
            "enter a valid number"
        }
    }
    println(bettingResult)
}