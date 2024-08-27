/*
    Classes:-
    * Class is a blueprint or template
    * Objects are the real thing
    * You create objects in your program and they interact with each other to complete the work


    Kotlin Class:-
    * Before creating objects in Kotlin, you need to define a class.
    * A class is a blueprint for the object.
    * We can think of a class as a sketch (prototype) of a house. It contains all the details about the floors, doors, windows, etc. Based on these descriptions, we build the house. The house is the object.  
    * Since many houses can be made from the same description, we can create many objects from a class.

    Introduction:-
      * In object-oriented programming (OOP), visibility modifiers control the accessibility of class members (properties, methods, etc.) from different parts of the code. This helps in encapsulating data and preventing unauthorized access.

      * Common Visibility Modifiers

      * private:
      * Accessible only within the class itself.
      * Encapsulates data and prevents external modification.

      * public:
      * Accessible from anywhere in the code.
      * Used for public interfaces and APIs.

      * protected:
      * Accessible within the class, its subclasses, and any other classes in the same package.
      * Useful for inheritance and related classes.

      * internal:
      * Accessible within the same assembly (module).
      * Provides a level of encapsulation within a module.

      * Default Visibility
      * If no visibility modifier is specified, the default is public.

    Choosing the Right Visibility Modifier

      Encapsulation: Use private to hide internal implementation details.
      Public Interface: Use public for methods and properties that should be accessible from outside the class.
      Inheritance: Use protected for members that should be accessible to subclasses.
      Module-Level Access: Use internal to restrict access within the same assembly.
 */

class Tutorial5 {
    // class -> is a keyword
    // Tutorial5 -> is a user define class name

    // Data Member(Property)
    private var isStudent = false;
    // private -> access modifier

    // member function
    fun isStudent() {
        isStudent = true;
    }

    fun isNotStudent() {
        isStudent = false;
    }
}

/*
    Note:-
        When class is defined, only the specification for the object is defined; no memory or storage allocated.
 */

fun main(args:Array<String>){
    // val - variable that value doesn't change
    // student - variable name
    // Tutorial5() - class name

    // We can define as many object in different variable.
    val student = Tutorial5() // Creation of object
    // val student1 = Tutorial5() // Creation of object
    student.isStudent()
    student.isNotStudent() // . operator to access class function and variable

    val person1 = Person("Vansh",19)
    person1.canVote(person1.age)
}

class Person( var name : String, var age : Int){
    fun canVote(age:Int){
        if(age<18){
            println("Can't vote")
        }else{
            println("Can vote")
        }
    }
}