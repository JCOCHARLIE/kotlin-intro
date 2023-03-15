fun main(args: Array<String>) {
    print("Enter your age: ")
    var age = readLine()!!.toInt()

    if (age >= 18) {
        print("Welcome to the club.")
    }
    else {
        print("Sorry we don't admit underage!")
    }
}