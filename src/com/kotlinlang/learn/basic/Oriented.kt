package com.kotlinlang.learn.basic

class Greeter(val name: String){
    fun greet(){
        println("Hello, $name")
    }
}


/**
 * 定向Hello
 */
fun main(args: Array<String>) {
//    Greeter(args[0]).greet()
    Greeter("liujunmin").greet()
}