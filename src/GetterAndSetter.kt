/*
    In programming, getter are used for getting value of the property.Similarly,setters are used for setting value of the property.

    In Kotlin, getter and setters are optional and auto-generated if you do not create them in your program
 */

class GetterAndSetter {
    var name : String = "Vansh Tomar"

        // Autogenerate you do not need to made it
    // getter    ------------------
    get() = field

    // setter
    set(value)  {
        field = value
    }
    //           ------------------
}
fun main(){
    val p = GetterAndSetter()
    println(p.name)
}