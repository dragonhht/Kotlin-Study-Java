package hht.dragon.java.extend

/**
 * 使用open关键字，该类可被继承.
 * @author: huang
 * Date: 18-1-11
 */
open class OpenClass {

    open fun save() {
        println("已保存!")
    }
}

open class Base constructor(name: String) {

    fun save() {
        println("save")
    }

}