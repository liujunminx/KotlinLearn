package com.kotlinlang.learn.advantage

/**
 * data前缀，创建POJO类
 * 包含 equals, hashCode, toString, copy
 */
data class Customer(val name: String, val email: String, val company: String)

// lambda
//val positiveNumbers = list.filter{it > 0}

object ThisIsASingleTon{
    val companyName: String = "ops"
}

//fun calculateTotal(obj: Any){
//    if (obj is Customer)
//        calculateTotal(obj)
//}

fun main() {
    var customer = Customer("liujunmin", "1792619448@qq.com", "ops")
    println(customer.name)
}