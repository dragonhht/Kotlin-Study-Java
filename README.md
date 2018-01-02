# Kotlin学习

## 1、基础学习

### 1、[变量](./src/main/kotlin/hht/dragon/java/variable/VariableStudy.kt)

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

-   [If表达式](./src/main/kotlin/hht/dragon/java/processcontrol/IfExpression.kt)
    
    > Kotlin中的if是一个表达式，可返回一个值， 这种情况下类似于Java中的三元表达式
    
    ```
    val max = if (a > b) a else b
    ```
    > 也可向传统的If表达式样使用。
    
    -   if-else语句规则（与Java中的基本相同）
    
        -   if后的括号不能省略，括号内的表达式的值必须为布尔值
        
        -   如果条件体内只有一条语句执行，那么if后面的大括号可以省略，但建议加上大括号
        
        -   对于给定的if，else语句是可选的，else if也是可选的
        
        -   else和else if同时出现时，else必须出现在else if后面
        
        -   如果有多条else if语句同时出现，那么如果有一条else if语句的表达式测试成功，那么会忽略其他所有else if和else分支
        
        -   如果出现多个if，只有一个else的情况，else子句归属于内层的if语句
        
-   [when表达式](./src/main/kotlin/hht/dragon/java/processcontrol/WhenExpression.kt)

    > 类似与switch-case表达式
    
    -   如果有多个分支需要用相同的操作，则可以将多个分支条件放在一起，用逗号分开
    
    ```
    when (obj) {
         -1, 0 -> println("-1 or 0")
         else -> {
             println("else")
         }
    }
    ```
    
    -   也可以检测一个是否在一个区间或集合中
    
    ```kotlin
    fun whenIn(x: Int) {
        val nums = arrayOf(1, 2, 3, 21)
        when (x) {
            in 1..10 -> print("在1~10之中")
            in nums -> print("在数组中")
            !in 10..20 -> print("不在10~20中")
        }
    }
    ```
   
-   [for循环](./src/main/kotlin/hht/dragon/java/processcontrol/ForWxpression.kt)

    -   格式
    
    ```
    for (item in collection) {
        ...
    }
    ```

-   while循环

    > while和do..while循环和Java中的类似
    
-   break、continue和return的使用与Java中的一致,但Kotlin中也可使用`=`来直接返回一个函数的值，如`fun sum(a: Int, b: Int) = a + b`

-   [标签](./src/main/kotlin/hht/dragon/java/processcontrol/LabelExpression.kt)

    > 可显示的指定标签，也可隐式的使用标签，当隐式的使用标签时，该标签与接收lambda的函数同名
    
-   throw表达式

    > 在Kotlin中throw是表达式，它的类型是特殊类型：Nothing，该类型没有值，与Java中的void的意思相同  
    > 如果把一个throw表达式的值赋给一个变量，需要显示声明类型为Nothing。