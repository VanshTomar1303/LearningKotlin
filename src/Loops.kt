/*
    Loops :
      Execute set of statement multiple times.
       Ex :- Print "Hi Developer" 5 times
        1. for loop
        2. while loop
        3. do-while loop

     for loop :
        Syntax :
            for(item in collection){
                //body of for loop
            }


     while loop :
        Entry controlled loop
        Syntax:
            while(testExpression){
                //code inside body of while loop
            }

     do while loop :
        Exit controlled loop.
        This loop execute once if the textExpression is false.
        Syntax :
            do{
                // body of do while loop
            }while(testExpression)

 */
fun main(){
    var i = 1
    var sum: Int = 0
    var input: String
    // ------------WHILE LOOP--------------
    while (i<=5){
        println(i)
        ++i
    }
    // ------------DO-WHILE LOOP--------------
    do {
        println("Enter an integer:")
        input = readln() // to take the input from user but the `readln()` take string only
        sum += input.toInt() // we have to typecast it
    }while (input!="0")
    println("Sum $sum")
    // ------------FOR LOOP--------------
    for(y in 1..5){
        println(y)
    }
    val text = "Kotlin"
    for (letter in text){
        println(letter)
    }
}