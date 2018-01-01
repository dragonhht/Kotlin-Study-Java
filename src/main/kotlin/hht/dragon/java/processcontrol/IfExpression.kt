package hht.dragon.java.processcontrol

/**
 * if表达式.
 * @author: huang
 * Date: 18-1-1
 */
fun main(args: Array<String>) {
    println(max(1, 2))
    println(max1(1, 2))
    println(max2(1, 2))
    println(max3(1, 2))
}

fun max(a: Int, b: Int): Int {
    // 作为表达式
    val max = if (a > b) a else b
    return max
}

fun max1(a: Int, b: Int): Int {
    // 传统用法
    var max = a
    if (a < b) max = b
    return max
}

fun max2(a: Int, b: Int): Int {
    var max: Int
    if (a > b) {
        max = a
    } else {
        max = b
    }
    return max
}

fun max3(a: Int, b: Int): Int {
    val max = if (a > b) {
        println("Max id a")
        a
    } else {
        print("Max is b")
        b
    }
    return max
}