package hht.dragon.java.withjava

import hht.dragon.domain.User
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import java.util.ArrayList

/**
 * Kotlin与Java互相操作.
 * @author: huang
 * Date: 18-2-3
 */
@RunWith(JUnit4::class)
class UsingJava {

    /**
     * 使用Java集合类.
     */
    @Test
    fun testArrayList() {
        // 使用Java中的ArrayLis
        val list = ArrayList<Int>()
        for (i in 0..13) {
            list.add(i)
        }

        for (i in list) {
            println("数字 " + i)
        }
    }

    /**
     * 调用Java中的Getter和Setter方法.
     * 直接使用属性名进行getter和Setter操作
     */
    @Test
    fun testGetterAndSetter() {
        val user = User()
        user.id = 1
        user.name = "张三"
        user.age = 18

        println(user)
    }

    /**
     * 调用Java中返回void的方法.
     * 如果一个Java方法返回void,那么Kotlin调用方法是返回Unit
     */
    @Test
    fun testReturnVoid() {
        val user = User()
        val returnResult = user.returnVoid();
        println(returnResult)
    }

    /**
     * 调用Java中的静态方法.
     */
    fun testStaticFun() {
        val str = User.staticFun()
        println(str)
    }

    /**
     * 使用Java中的反射.
     * 通过使用instance::class.java、ClassName::class.java或instance.javaClass通过java.lan.Class来进入Java中的反射类
     * ，java.lang.Class，之后就可以使用Java中的反射
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

}