fun main(args: Array<String>) {
    val names: Array<String> = arrayOf("Hinata", "Rock lee", "Naruto")
    val numbers = listOf(20, 16, 10, 14, 19)
    val matriz = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6),
        arrayOf(7, 8, 9)
    )

    // Loop padrão
    for (name in names){
        println(name)
    }

    /*
    Iterando sobre um array ou lista com forEach:
        O forEach é uma alternativa mais funcional ao for
    */
    numbers.forEach{ number -> println(number)}

    // Usando for com indices
    for (i in names.indices){
        println("Índice $i -> ${names[i]}")
    }

    // Usando for com withIndex()
    for ((index, name) in names.withIndex()){
        println("[$index] $name")
    }

    // Iterando sobre um Range (IntRange)
    for (i in 1..9){
        println(i)
    }

    /*
    Usando step para controlar incrementos:
        Podemos pular números dentro do intervalo usando step:
    */
    for (i in 2..10 step 2) {
        println(i)
    }
    // O step 2 faz o loop pular de 2 em 2.

    /*
    Percorrendo um intervalo em ordem reversa:
        Podemos iterar de trás para frente usando downTo:
    */

    for (i in 10 downTo 1 step 2){
        println(i)
    }

    /*
    Usando for para percorrer uma Matriz (Array 2D):
        Se estivermos lidando com arrays multidimensionais, for também funciona bem:
    */
    println("=+=+=+=")
    for (linha in matriz) {
        for (valor in linha) {
            println("$valor ")
        }
    }

    // Interrompe o loop
    for (i in 1..10){
        if (i == 5){
            println("Parando no 5!")
            break
        }
        println(i)
    }

    // Pula para a próxima iteração
    for (i in 1..5){
        if (i == 3) continue // Pulando o número 3
        println(i)
    }
}