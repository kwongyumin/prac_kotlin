package org.service.ex02

import java.util.*

fun main() {

    val a: Int = 0
    val b = 10
    val c: Int = 20
    val d: Int? = null

    callFunction(a);
    callFunction(b);
    callFunction(c);
    callFunction(d); // Java 와는 다르게 null 이 출력됨
    Optional.ofNullable(d).ifPresent {it -> // 자바와 동일한 문법채계로도 작성가능하며 람다식은 더욱 간결해짐.
        println(it)
    }

    callFunction(); // 전달인자를 함수에서 초기화함으로써 전달인자 없이도 함수를 출력할 수 있다.

}
// ? 엘비스연산자 -> 코틀린에서는 NULL 일 수도 있다는 것을 해당 연산자를 통해 표기

// i 에 값이 넘어오지 않을 때, 디폴트 값으로 100을 설정한다.
fun callFunction(i: Int? = 100){

//    java 삼항연산자 대체
//    val temp = if (i == null) "null 값 입니다" else i
//    println(temp)

    // 코틀린에서는 삼항연산자를 아래와 같이 더욱 간결하게 지원함.

    val temp = i ?: "null 값 입니다"
    println(temp)

    // 변수 ? -> 변수가 null 인지 ,
    // 변수 ?. -> 변수가 null 이 아닐 때
    // 변수 ?: -> 변수가 null 일 때

    i?.let {
        println(i)
    }?: run {
        println("null")
    }

    println(i);
}