/*
    Constructor :
       * It is a concise way to initialize class properties.
       * It is a special member function that is called when an object is instantiated(created).
         However,how they work in Kotlin is slightly different.

         In Kotlin, there are two constructors:
            * Primary Constructor -> concise way to initialize a class
            * Secondary constructor -> allows you to put additional initialization logic
 */

/*
    Primary Constructor :
        It is a part of the class header. Here's an example:
            class Person(val firstName: String, var age: Int){
              //class body
            }
        The block of code surrounded by parentheses is the primary constructor.
        '--> (val firstName: String, var age: Int)

    Primary Constructor and Initializer blocks :
        * It has a constrained syntax, and cannot contain any code.
        * To put the initialization code (not only code to initialize properties), initializer block is used.
           It is prefixed with init keyword.

           Example :-
           fun main(args: Array<String>){
                val person1 = Person("Joe",25);
           }
           class Person(val fName: String, var personAge: Int){
            val firstName: String
            var age: Int

            // initializer block
            init{
                firstName = fName.capitalize()
                age = personAge

                println("First Name = $firstName")
                println("Age = $age");
            }
           }
 */
/*
    Secondary Constructor :
        In Kotlin, a class can also contain one or more secondary constructors.They are created using `constructor` keyword.
        Secondary Constructor are not that common in Kotlin.
        The most common constructor comes up when you need to extend a class that provides multiple constructors that initialize the class in different ways.
        * Be sure to check Kotlin Inheritance before you learn it.

        Example :
            class Log{
                constructor(data: String){
                    // some code
                }
                constructor(data: String, numberOfData: Int){
                    // some code
                }
            }
 */
class Tutorial6 {

}
fun main(){
    val person1 = Per("joe",25);
}
class Per(private val fName: String, private var personAge: Int){
    private val firstName: String
    private var age: Int

    // initializer block
    init{
        firstName = fName.capitalize()
        age = personAge

        println("First Name = $firstName")
        println("Age = $age");
    }
}