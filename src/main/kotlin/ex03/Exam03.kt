package org.service.ex03

fun main() {

    // 코틀린에서는 가변 var , 불변 val 에 대한 구분이 명확하다.
    // 변경될 수 있는 컬렉션이라면 mutable  , 불변은 immutable (기본)

    val userList = mutableListOf<User>() // 내용물이 변경될 수 있는
    userList.add(User("1",10))
    userList.add(User("2",20))
    userList.add(User("3",30))

    val list = listOf<User>( // 불변 리스트
        User("4",40)
    )
    // list (불변) -> add 메서드 지원이 안됨 -> 원본에 대한 데이터가 보장이됨.
    // java 에도 Collections.unmodifiableCollection(userList) 와 같이 사용가능 .

    for (element in userList) {
        println(element)
    }

    // 반복의 사용법 (for)

    userList.forEach{it -> println(it)}

    // 인덱스(i) + 반복
    userList.forEachIndexed { index, user ->
        println("index : $index user : $user "  )
    }

    userList.forEachIndexed(fun (index,user) {
        println("index : $index user : $user "  )
    })

    for ((index,element) in userList.withIndex()) {
        println("index : $index user : $element "  )
    }



}


class User (
    var name: String ,
    var age: Int
)