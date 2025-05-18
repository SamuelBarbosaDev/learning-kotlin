fun main(args: Array<String>) {
    var option = 5

    when(option){
        1 -> println("A opção é 1.")
        2 -> println("A opção é 2.")
        3 -> println("A opção é 3.")
        in 4..6 -> println("A opção está dentro do range de 4 a 6.")
        else -> println("Nenhuma das opções.")
    }
}