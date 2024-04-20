package org.service.ex01

// Class 명과 일치 안해도됨
//class Exam01 {
//}

fun main() {

    // 변수 선언
    // var = mutable (가변) / val ,final (불변) -> immutable

    // : [타입]
    val name : String = "테스트";
    var _name : String = "테스트";

    // 타입 추론이 가능하기에 아래와 같이 선언 가능
    val n = "테스트";

    // java 에서는 primitive 와 refer 타입을 구분 ..
    // 코틀린에서는 레퍼타입만 존재 -> 객체로 관리된다.

    var i = 10
    var _i: Int = 10
    var d: Double = 20.0
    var f: Float = 10f;
    var b: Boolean = true;

    //즉, 불변성 이냐 ? 가변성 이냐? 에 대해서만 신경쓴다.

    // Java 와는 문자열 포맷팅 방식이 상이힘.
    println("테스트 : $name" );


}