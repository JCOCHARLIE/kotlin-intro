fun println(i: Int, s: String) {

}

fun main(args: Array<String>) {

for (i in 1..100){
    if (i % 3 == 0){
        println("$i Divisible")
    }
    else{
        println("$i Not divisible")
    }
}


}