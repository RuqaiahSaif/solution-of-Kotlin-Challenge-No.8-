open class A {

    open fun printVarName() {
        print("I am in class printVarName")
    }

    init {
        println("I am in init of A")
    }
}

object Singleton : A() {

    var variableName = "I am Var in Singleton"
    override fun printVarName() {
        println(variableName)
    }
}
fun main(args: Array<String>) {
    var a = A()
    Singleton.printVarName()
}