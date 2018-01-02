package hht.dragon.java.expand

/**
 * 函数扩展.
 * @author: huang
 * Date: 18-1-2
 */

/** 扩展属性. */
val <T> List<T>.lastIndex: Int get() = size - 1

/**
 * 扩展函数.
 */
fun String.notEmpty(): Boolean {
    return !this.isEmpty()
}

fun main(args: Array<String>) {
    "123".notEmpty()
}