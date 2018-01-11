package hht.dragon.java.interfaces

/**
 * 接口定义.
 * @author: huang
 * Date: 18-1-11
 */
interface InterfaceDefinition {
    val name: String
    val owner: String

    fun save(name: String)

    fun print() {
        println("Hello")
    }

}