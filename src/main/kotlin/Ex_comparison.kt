fun main(args: Array<String>) {
    println("Enter your marks:")
    var marks = readLine()!!.toInt()

    if (marks >=80) {
        println("Your grade is A")
        println("Congratulations")
    }
    else if (marks >= 70) {
        println("Your grade is A-")
        println("Aim Higher")
    }
    else if (marks >= 60) {
        println("Your grade is B")
        println("Work Harder")
    }
    else {
        println("Your grade is E")
        println("You have to resit the examination")
    }
}