package hht.dragon.java.interfaces

/**
 * 实现接口.
 * @author: huang
 * Date: 18-1-11
 */
class InterfaceImpl : InterfaceDefinition {
    override val name: String
        get() = "李四"
    override val owner: String
        get() = "张三"

    override fun save(name: String) {
        println("Name: $name" )
    }
}

fun main(args: Array<String>) {
    val test = InterfaceImpl()
    test.print()
    test.save("王五")
}