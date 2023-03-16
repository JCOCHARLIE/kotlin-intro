fun main(args: Array<String>) {
    println("Enter your weight")
    var weight = readLine()!!.toInt()

    println("Enter your height")
    var height = readLine()!!.toDouble()

    var bmi = weight /(height * height)

    println(bmi)
    if (bmi <= 18){
        println("Underweight")
    }
    else if (bmi <= 29){
        println("Normal Weight")
    }
    else if (bmi <= 34){
        println("Overweight")
    }
    else{
        println("Obese")
    }
}