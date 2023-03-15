fun main(args: Array<String>) {
    println("Enter a number: ")
    var num = readLine()!!.toInt()

    if (num == 0) {
        print("Sh 10(1GB Youtube for 3hrs)")
    }
    else if (num == 1) {
        print("Sh 20(1GB valid for 1hr)")
    }
    else if (num == 2){
        print("BLAZE Deals")
    }
    else if (num == 3){
        print("Daily Bundles")
    }
    else if (num == 4){
        print("Weekly bundles")
    }
    else if (num == 5){
        print("GO MONTHLY")
    }
    else if (num == 6){
        print("Entertainment bundles")
    }
    else if (num == 7){
        print("Okoa Data")
    }
    else if (num == 8){
        print("Lipa Mdogo")
    }
    else if (num == 98){
        print("MORE")
    }
    else {
        print("....")
    }


}