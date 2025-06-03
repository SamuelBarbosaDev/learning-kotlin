fun main(args: Array<String>){
    Calculator.sum(20, 10)
    Calculator.subtraction(8, 3)
    println("O valor de PI é: ${Calculator.PI}")
}

class Calculator{
    companion object{
        const val PI = 3.14159265358979323846

        fun sum(x: Int, y: Int){
            println("Resultado da soma: ${x + y}")
        }

        fun subtraction(x: Int, y: Int){
            println("Resultado da subtração: ${x + y}")
        }
    }
}