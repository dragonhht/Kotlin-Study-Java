package hht.dragon.java.withjava

import domain.User

/**
 * kotlin调用Java.
 * @author: huang
 * Date: 18-2-3
 */

/**
 * 调用Java静态方法.
 */
fun usingStatic() {
    val str = User.staticFun()
    println(str)
}

/**
 * 使用Java中的反射.
 */
fun testRefect() {
    val user = User::class.java
    println(user.canonicalName)
    user.declaredFields.forEach { println(it) }
    user.declaredMethods.forEach {
        println(it.name)
        it.parameters.forEach { println(it) }
    }
}

fun main(args: Array<String>) {
        //usingStatic()
    testRefect()
}