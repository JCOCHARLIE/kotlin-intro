package OOP

class Vehicle(owner:String, color:String, wheels:Int, model:String)
{

    init {
        println("Owned by $owner")
        println("Color is $color")
        println("Has $wheels wheels")
        println("The model is $model")
    }
}

fun main(args: Array<String>) {
    var owner1 = Vehicle("Sharon", "Red", 4, "Toyota")
    var owner2 = Vehicle("Jim", "White", 4, "Mercedes")
    var owner3 = Vehicle("Negroni", "Black", 4, "BMW")
}