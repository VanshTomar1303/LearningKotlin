/*
   Kotlin Visibility Modifiers :
    * Visibility modifiers are keywords that set the visibility (accessibility)
      of class,objects,interface,constructors,functions,properties and their setters.
    * (You cannot set visibility modifier of getters as they always take the same visibility
       as that of the property.)

    Visibility Modifiers Inside Classes and Interfaces :
    Modifier         Description

     public    ->      visible to any client who can see the declaring class
     private   ->      visible inside the class only
     protected ->      visible inside the class and its subClasses
     internal  ->      visible to any client inside the module that can see the declaring class

     Note :
      If you override a `protected` member in the derived class without specifying its visibility,its
      visibility will also be `protected`.
 */

class KotlinVisibilityModifiers {
}