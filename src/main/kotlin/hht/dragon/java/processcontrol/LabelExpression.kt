package hht.dragon.java.processcontrol

/**
 * 标签.
 * @author: huang
 * Date: 18-1-1
 */
fun main(args: Array<String>) {

    // 显示标签
    val nums = intArrayOf(1, 2, 3 ,4 ,5, 6)
    nums.forEach hrere@ {
        if (it == 3) return@hrere
        println(it)
    }

    println("------------------")
    // 隐式标签
    nums.forEach {
        if (it == 3) return@forEach
        println(it)
    }
}