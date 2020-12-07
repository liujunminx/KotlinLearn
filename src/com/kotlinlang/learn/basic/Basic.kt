package com.kotlinlang.learn.basic

/**
 * Function: two params at end, Int return type
 */
fun sum1(a: Int, b: Int): Int{
    return a + b;
}

/**
 * no body, no return type
 */
fun sum2(a: Int, b: Int) = a + b

/**
 * no meaningful value, and you can omitted Unit
 */
fun sum3(a: Int, b: Int): Unit{
    println("sum of $a and $b is ${a + b}")
}

/**
 * Kotlin conditional function
 */
fun maxOf(a: Int, b: Int): Int = if (a > b) a else b

/**
 * check null safe
 */
fun strLen(str: String): Int?{
    return str.toIntOrNull()
}

fun printProduct(arg1: String, arg2: String){
    var x = strLen(arg1)
    var y = strLen(arg2)

    if (x != null && y != null){
        println(x * y)
    }
    else{
        println("'$arg1' or '$arg2' is not a number")
    }
}

/**
 * type checks and automatic casts
 */
fun getStringLength(obj: Any): Int?{
    if (obj is String){
        return obj.length
    }

    return null
}

fun main() {
    println("Hello!!!")
    println(sum1(5, 8))
    println(sum3(5, 8))

    // variables
    //val c error
    val c : Int // Type required when no initializer is provided
    c = 3 // deferred assignment

    // String templates
    var a = 1
    var s1 = "a is $a"
    a = 2
    var s2 = "${s1.replace("is", "was")}, but now is $a"
    println(s1)
    println(s2)
    println(maxOf(5, 8))
    println(printProduct("123",""))

    fun printLength(obj: Any){
        // ${} 可用三目表达式
        println("'$obj' string length is ${getStringLength(obj)?:"... err, not a string"}")
    }
    printLength("bilibili")
    printLength(1000)
    printLength(listOf(Any()))

    // for loop
    val items = listOf<String>("apple", "bilibili", "fruit")
    for (item in items){
        println(item)
    }
}