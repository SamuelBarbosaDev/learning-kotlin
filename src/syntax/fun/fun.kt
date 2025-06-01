fun main(args: Array<String>) {
    println(sum(6, 9))
    unitSum(1,1)
    println(multiplication(3, 3))
}

fun sum(x: Int, y: Int): Int{
    return x + y
}

fun unitSum(x: Int, y: Int): Unit{
    println("O resultado é: ${x + y}")
}

fun multiplication(x: Int, y: Int = 1): Int = x * y