/*
    Arrays :
        To create an array, use the function `arrayOf()` and pass the item values to it,
        so that `arrayOf(1,2,3)` creates an array `[1,2,3]`. Alternatively, `the arrayOfNulls()`
        function can be used to create an array of a given size filled with `null` elements.

        Syntax :
            var arr = arrayOf("One","Two","Three")

        Kotlin Array declaration - using arrayOf() func.
            var arr1 = arrayOf(1,2,3,4)
            var arr2 = arrayOf<Int>(1,2,3,4)
            var arr3 = arrayOf<String>("One","Two","Three")
            var arr4 = arrayOf(1,2,3,"One","Two","Three")

        Array set() function :
          To set a value in array at a given index
            1. arr.set(index,value)
            2. arr[1] = 20

        Array get() function :
           To get a value in array at a given index
           1. println(arr.get(index))
           2. println(arr[1])
 */

fun main(){
    val arr = arrayOf(1,2,3,'c',3.24,"One","Two","Three")
    arr.set(0,10)
    arr[2]=20

    for (i in arr){
        println(i)
    }
    println(arr.get(6))
}