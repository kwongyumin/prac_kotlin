package org.service.ex05

import java.util.function.Predicate


fun main() {

    // 고차함수

    var numberList = listOf<Int>(1,2,3,4,5)
    numberList.filter { it % 2 == 0}


//    val pred = object : Predicate<Int> {
//        override fun test(t: Int): Boolean {
//            return t % 2 == 0;
//        }
//    }

//    numberList.stream().filter(pred)

//  람다
    val pred = Predicate<Int> { t -> t % 2 == 0; }
    numberList.stream().filter(pred)

    val add = { x:Int , y :Int -> x + y}

    println(add.invoke(2,3))
    println(add(2,3))

    // 함수 자체를 변수에 할당 하는 것도 가능

    val _add = fun(x: Int , y:Int) : Int {
        return x + y;
    }

    println(_add(2,3))

    lambda(4,5,_add)
}

fun lambda(x:Int , y:Int , method: (Int,Int) -> Int) {
    println(method(x,y))
}