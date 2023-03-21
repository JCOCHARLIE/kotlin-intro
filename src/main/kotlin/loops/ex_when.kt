fun main(args: Array<String>) {
    println("Enter your USSD:")
    var USSD = readLine()!!.toInt()
    when(USSD){
        1-> println("Daily Bundles")
        2-> println("Weekly Bundles")
        3-> println("Monthly Bundles")
        4-> println("Okoa Bundles")
        5-> println("Blaze Bundles")
    }
}