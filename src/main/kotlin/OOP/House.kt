package OOP

class House(owner:String, location:String, rooms:Int, windows:Int, designer:String, value:String) {
    init {
        println("The owner is $owner")
        println("It's found in $location")
        println("It has $rooms rooms")
        println("It has $windows windows")
        println("Designed by $designer")
        println("It costs $value")
        println("........................................................................................................................................................................................")
    }
}

fun main(args: Array<String>) {
    var house1 = House("James", "Nairobi", 4, 10, "Killy", "1M")
    var house2 = House("Lonky", "Kennington", 6, 20, "Metro", "5M")
    var house3 = House("Triptych", "Antananarivo", 12, 30, "Pierre", "42M")
}