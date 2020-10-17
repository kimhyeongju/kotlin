package oop
interface SimpleInterface{
    fun TestFunc();
}

class SimpleImp : SimpleInterface{
    override fun TestFunc() = println("구현했음");
}

abstract class TestAbstract{
    fun TestFunc() = println("TestFunc");
    abstract fun abstractFunc();
}

class TestAbstractImp : TestAbstract(){
    override fun astractFunc() = println("상속 구현했음");

    // companion object {} 안에서 구현해야 static 가능
    companion object{
        var static Var = "staticVar";
        fun staticFunc() = println("스태틱 함수임")
    }
}
