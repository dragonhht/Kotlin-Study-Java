package hht.dragon.java.collection

import org.junit.Test

/**
 * List集合.
 * @author: huang
 * Date: 18-1-4
 */
class ListCollection {

    /**
     * 创建不可变List.
     */
    @Test
    fun test0() {
        val list: List<Int> = listOf()
        println(list)

        val list_1 = listOf(1)
        println(list_1)

        val list_2 = listOf(0, 1, 2)
        println(list_2)

        val list_3 = arrayListOf(9, 3, 4)
        println(list_3)

        // 使用迭代器遍历
        val iterator = list_3.iterator()
        while (iterator.hasNext()) {
            println(iterator.next())
        }

        // 使用forEach遍历
        list_3.forEach {
            println(it)
        }
        list_3.forEach(::println)

    }

    /**
     * 创建不可变List.
     */
    @Test
    fun test1() {
        val list = mutableListOf(123, 23)
        println(list)
    }
}