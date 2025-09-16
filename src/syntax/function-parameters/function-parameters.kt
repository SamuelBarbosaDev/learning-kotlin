fun main(args: Array<String>){
    sumResult(::sum)
}

fun sum(n1: Int, n2: Int): Int{
    return n1 + n2
}

fun sumResult(funAlpha: (Int, Int) -> Int){
    val value = funAlpha(10, 99)
    println(value)
}