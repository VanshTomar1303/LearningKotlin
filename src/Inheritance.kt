/*
    Inheritance :
        It is one of the key feature of object-oriented programming.
        It allows user to create a new class (derived class) from an existing class (base class).
        The derived class inherits all the features from the base class and can have additional features of its own.
        Kotlin has only single level inheritance.


        Here an example :-
            open class Person(private var age: Int){
                //code for eating,talking,walking
            }
            class MathTeacher(age: Int,name: String): Person(age){
                //other features of math teacher
            }
            class Footballer(age: Int): Person(age){
                //other features of footballer
            }
            class Businessman(age: Int): Person(age){
                //other features of businessman
            }

    Note :
        Notice, the keyword `open` before the base class `Person`.It`s important.
        By default, classes is Kotlin are final.If you are familiar with java,you know that a final class cannot be subclassed.
        By using the `open` annotation on a class, compiler allows you to derive new classes from it.
 */

open class Vehicle(private var name: String, private var year: Int) {
    init{
        println("Vehicle name $name")
        println("Manufacture Year $year")
    }
}
class Car(name: String,year: Int,company: String): Vehicle(name,year){
    init{
        println("Car company $company")
    }
    fun driveCar(){
        println("Broom Broom")
    }
}
class Bus(name: String,year: Int): Vehicle(name, year){
    fun driveBus(){
        println("Sii Sii")
    }
}
fun main(){
    val car = Car("Mustang",2000,"Ford")
    car.driveCar()

    println()

    val bus = Bus("Shanti",2010)
    bus.driveBus()
}

/*
    Secondary Constructor Example :
        fun main(){
            val p1 = AuthLog("Bad Password")
        }

        open class Log{
            var data : String = ""
            var numberOfData=0
            constructor(_data:String){

            }
            constructor(_data:String,_numberOfData: Int){
                data=_data
                numberOfData = _numberOfData
                println("$data: $numberOfData times")
            }
        }
        class AuthLog: Log{
            constructor(_data:String): this("From AuthLog -> + $_data",10){

            }
            constructor(_data:String,_numberOfData: Int): super(_data,_numberOfData){

            }
        }
 */