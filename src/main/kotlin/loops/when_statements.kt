fun main(args: Array<String>) {

    println("Enter Your floor:")
    var point = readLine()!!.toInt()
    when(point){
        1-> println("Go to First floor")
        2-> println("Go to Second floor")
        3-> println("Go to Third floor")
        4-> println("Go to Forth floor")

        else -> println("No floor available")
    }
}

