package com.kotlinlang.learn.advantage

/*
 Use any existing library on the JVM, as there’s 100% compatibility, including SAM support.
*/

//import io.reactivex.Flowable
//import io.reactivex.schedulers.Schedulers

//
//fun main() {
//    Flowable
//    .fromCallable {
//        Thread.sleep(1000) //  imitate expensive computation
//        "Done"
//    }
//    .subscribeOn(Schedulers.io())
//    .observeOn(Schedulers.single())
//    .subscribe(::println, Throwable::printStackTrace)
//
//}
