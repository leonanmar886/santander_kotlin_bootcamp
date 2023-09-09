package src.main.firstModule.functions

fun main(){
    println("Hello World!")
    printMessageWithPrefix("Hello", "Log") // function call
    printMessageWithPrefix("Hello") // function call
    println(sum(1, 2)) // function call
    println(multiply(2, 4)) // function call
    printAll("Hello", "World", "Kotlin") // function call
    printAll(*arrayOf("Hello", "World", "Kotlin")) // spread operator
    val x = 2
    val y = 3
    println("$x + $y = ${x + y}") // string interpolation
    printAllWithPrefix("Kotlin", "Java", "Scala", "C", prefix = "Language:") // named arguments
}

fun printMessageWithPrefix(message: String, prefix: String = "Info:"){// the prefix argument has a default value
    println("[$prefix] $message") // string interpolation
}

fun sum(x: Int, y: Int): Int{ // this function mandatory returns an Int
    return x + y
}

fun multiply(x: Int, y: Int) = x * y // kotlin functions syntax don't need the brackets if the function is a single expression

fun printAll(vararg messages: String){ // vararg is used to pass a variable number of arguments
    for (m in messages) println(m) // for loop that executes a inlined function
}

fun printAllWithPrefix(vararg messages: String, prefix: String){
    for (m in messages) println(prefix + m)
}