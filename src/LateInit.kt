/*
    Lateinit -> I will initialize this variable later on in the program
 */

fun main(){
    val obj = LateInit()
    println(obj.add(2,3))
    println(obj.mul(2,3))
}

class LateInit {
    lateinit var message : String
    fun add(a:Int, b:Int) : Int{
        return a+b
    }
    fun mul(a:Int, b:Int) : Int{
        return a*b
    }
}