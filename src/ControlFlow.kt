/*
    If-Else :
      Example :
       * If it is raining - take umbrella
       * Otherwise -No rains -you can enjoy your day

     Syntax:
        if(condition){
            //code
        }else{
            //code
        }

     If-Else-if :
        Syntax :
            if(condition){

            }else if(condition){

            }else{

            }


      When:
        It is like `switch case` in java without the `break`.
        We use `else` for the `default` keyword.

        when(num){
           0 -> print("0")
           1 -> print("1")
           else -> print("-1")
         }

 */

class ControlFlow (private var name: String, private var age: Int){
    init {
        if(age>=18) println("$name can vote")
        else if(age<18) println("$name can't vote")
        else println("Enter something valid")
    }
}
fun main(){
    val obj = ControlFlow("vansh",20)
}