/*
    Functions :
        * Block of code to perform certain functionality
        * Help to reuse code

        Syntax :
           1. fun methodName{
                //block of code
              }
           2. fun funcName(parameter1,parameter2): ReturnType{
                //Block of statement
                return result
               }
 */
// An entry point of Kotlin application is the `main` function
// Another form of `main` accepts a variable number of `String` argument
/*fun main(args: Array<String>){
    println(args.contentToString())
}*/
fun main(args: Array<String>)
{
    println(add(5,2))
    println(add(5.5,2.5))
    println(add(5.4,2.2,3.0))
}
fun add(a: Int,b: Int):Int /* `Unit` is for void */
{
    return a+b
    // if there is one line in function then :
    // fun add(a: Int,b: Int)=a+b
}
fun add(a: Double,b: Double):Double
{
    return a+b
}
fun add(a: Double,b: Double,c: Double):Double
{
    return a+b+c
}

/*
    Function Overloading :
         * Same name different parameters
            1. Either number of parameters is different
            2. Or datatype is different
 */