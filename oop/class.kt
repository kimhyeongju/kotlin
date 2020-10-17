package oop

// class passwd(변수명: 데이터형, ..){} 으로 생성사를 만들어 쓰기도 함
class TestClass{
    var name : String = "";     // 여기서 : String은 생략 가능

    // 기본 생성자
    constructor(){
        println("기본생성자");
    }
    // 오버로딩된 생성자
    constructor(name : String){
        this.name = name;
        println("$name 을 입력받은 생성자");
    }
}

// kotlin에서는 기본적으로 상속이 거부되어 있음
// 선조클래스를 open으로 지정해야 함
open class ParentClass{
    var name : String = this.toString();    // 파이썬의 __str__(self):
    fun getMyName() : String = name;
}

// 상속받을 때는 선조클래스를 "class passwd : 선조클래스명(생성자인자){}" 형식으로 해야 함
class ChildClass : ParentClass(){

}

fun main(args: Array<String>) {
    var obj1 = TestClass();
    var obj2 = TestClass("파라미터");

    var obj3 = ParentClass();
    println(obj3.getMyName());

    var obj4 = ChildClass();
    println(obj4.getMyName());
}