package hht.dragon.java.processcontrol

/**
 * for循环.
 * @author: huang
 * Date: 18-1-1
 */
fun main(args: Array<String>) {
    val s = arrayOf(1, 2, 3,8 ,4, 6, 7)
    for (n in s) {
        println(n)
    }
    println("-----------------")

    for (i in s.indices) {
        println(s[i])
    }

    println("--------------------")

    for ((index, value) in s.withIndex()) {
        println("$index is $value")
    }
}