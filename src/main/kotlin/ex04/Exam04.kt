package org.service.ex04

fun main() {

    // 자료구조 map 사용법

    // any = java Object
    val map = mapOf<String,Any>(
        Pair("",""),  // 방법 1
        "key" to "value") // 방법 2

    // put 이 존재하지 않는다.

    val mutableMap = mutableMapOf<String,Any>(
        "key" to "value"
    )

    // mutableMap.put("key","value");
    mutableMap["key"] = "value";

    // get 역시 아래와 같이 표현 가능하다.
    val value = mutableMap["key"]

    val hashMap = hashMapOf<String,Any>()

    var triple = Triple<String,String,String> (
        first = "",
        second = "",
        third = ""
    )

}