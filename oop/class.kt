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

