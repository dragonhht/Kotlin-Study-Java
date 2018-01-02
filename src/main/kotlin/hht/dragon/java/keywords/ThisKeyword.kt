package hht.dragon.java.keywords

/**
 * this关键字.
 * @author: huang
 * Date: 18-1-2
 */
class Outer {
    val oh = "Oh!"

    inner class Inner {

        fun m() {
            val outer = this@Outer
            val inner = this@Inner
            val pthis = this
            println("outer: $outer")
            println("inner: $inner")
            println("pthis: $pthis")
            println("outer.oh = " + outer.oh)

            val fun1 = hello@ fun String.() {
                val d = this
                println("d = " + d)
            }

            "abc".fun1()
        }
    }
}

fun main(args: Array<String>) {
    val out = Outer()
    out.Inner().m()
}