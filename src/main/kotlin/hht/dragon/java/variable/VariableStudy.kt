package hht.dragon.java.variable

/**
 * 变量.
 * @author: huang
 * Date: 17-12-31
 */
class VariableStudy {
    fun declareVar() {
        var a = 1
        a = 2
        println(a)
        println(a::class)
        println(a::class.java)

        var x = 5
        x += 1
    }

    fun declareVal() {
        val b = "a"
        println(b)
        println(b::class)
        println(b::class.java)

        val c: Int = 1  // 立即赋值
        val d = 2   // 自动推断出“Int”类型
        val e: Int  // 如果没有初始值类型不能省略
        e = 3
        println("c = $c, d = $d, e = $e")
    }

    // 使用is进行类型检测
    fun getLength(obj: Any): Int? {
        var result = 0
        if (obj is String) {
            // 在该处obj自动转换成String
            println(obj::class)
            result = obj.length
            println(result)
        }
        println(obj::class)
        return result
    }

    /**
     * 原始字符串和模板表达式.
     */
    fun rawString() {
        val rawString = """
             // 使用is进行类型检测
    fun getLength(obj: Any): Int? {
        var result = 0
        if (obj is String) {
            // 在该处obj自动转换成String
            println(obj::class)
            result = obj.length
            println(result)
        }
        println(obj::class)
        return result
    }/n
        """.trimIndent()
        println(rawString)

        // 模板表达式
        val s = "$rawString has ${rawString.length} characters."
        println(s)
    }

}