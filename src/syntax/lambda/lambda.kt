fun main(args: Array<String>){
    config {
        return@config 10 + 10
    }
}

fun config(funConfig: () -> Int){
    val sumResult = funConfig()
    println("The result of the sum is `${sumResult}`.")
}