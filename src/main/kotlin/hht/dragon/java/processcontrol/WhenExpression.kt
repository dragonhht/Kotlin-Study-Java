package hht.dragon.java.processcontrol

/**
 * when表达式.
 * @author: huang
 * Date: 18-1-1
 */
fun main(args: Array<String>) {
//    cases("1")
//    switch(-1)
    whenIn(21)
}

fun cases(obj: Any) {
    when (obj) {
        1 -> print("1")
        "hello" -> print("hello")
        is Long -> print("Long类型数据")
        !is String -> print("不是一个String")
        else -> print("类似与Java中switch-case中的default")
    }
}

fun switch(obj: Any) {
    when (obj) {
        -1, 0 -> println("-1 or 0")
        else -> {
            println("else")
        }
    }
}

fun whenIn(x: Int) {
    val nums = arrayOf(1, 2, 3, 21)
    when (x) {
        in 1..10 -> print("在1~10之中")
        in nums -> print("在数组中")
        !in 10..20 -> print("不在10~20中")
    }
}