package hht.dragon.java.variable

import org.junit.Assert
import org.junit.Test
import java.time.temporal.ValueRange

/**
 * Kotlin测试.
 * @author: huang
 * Date: 17-12-31
 */
class TestKotlin {

    @Test
    fun test1() {
        val v = VariableStudy()
        v.declareVal()
        v.declareVar()
    }

    @Test
    fun test2() {
        val v = VariableStudy()
        val obj = "hht"
        val len = v.getLength(obj)
        Assert.assertTrue(len == 3)

        val obj1:Any = Any()
        v.getLength(obj1)
    }

    @Test
    fun test3() {
        val v = VariableStudy()
        v.rawString()
    }

}