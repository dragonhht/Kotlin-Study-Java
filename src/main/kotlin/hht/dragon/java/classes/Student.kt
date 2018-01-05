package hht.dragon.java.classes

/**
 * 类.
 * @author: huang
 * Date: 18-1-5
 */
open class Student constructor(var name: String, var age: Int) {

    init {
        println("name is $name, and age is $age")
    }

}