# Kotlin学习

## 1、基础学习

### 1、[变量](./src/main/kotlin/hht.dragon.java.variable.VariableStudy.java)

#### 1、申明变量和值

Kotlin的变量分为可变的`var`和不可变的`val`

-   `var`：可写的，在生命周期中可被多次赋值

-   `val`：只读的，仅能一次赋值，后面就不能被重新赋值

### 2、变量类型推断

在Kotlin中，大部分情况不需要说明你使用对象的类型，编译器可以直接推断出它的类型。但是，类型推断不是所有的。例如，整型变量Int不能赋值Long变量

-   使用`is`运算符进行类型检测

```
if (obj is String) {
            // 在该处obj自动转换成String
            println(obj::class)
            result = obj.length
            println(result)
        }
```

### 3、原始字符串与模板表达式

-   原始字符串：有三重引号`"""`分隔（与Python一样），原始字符串可以包含换行符和任何其他字符

```
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
    }
```

-   模板表达式：以美元符号开始

```
// 模板表达式
val s = "$rawString has ${rawString.length} characters."
println(s)
```

### 2、流程控制语句