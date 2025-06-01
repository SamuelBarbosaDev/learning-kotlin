fun main(args: Array<String>){
    val numbers = arrayOf(3, 5, 76, 11)
    val names: Array<String> = arrayOf("Hinata", "Rock lee", "Naruto")
    
    // Especificando o Tipo
    val empty = arrayOfNulls<Int>(5)
    val intArray = intArrayOf(1, 2, 3)
    val doubleArray = doubleArrayOf(1.2, 3.4, 5.6)
    val booleanArray = booleanArrayOf(true, false, true)
    
    // Acessando e modificando elementos
    names[0] = "Fortalecimento"
    println(names[1])

    // Tamanho do array
    println(names.size)

    // Ordenando elementos
    numbers.sort()
    println(numbers.joinToString())

    // Verificando existência de elemento em uma lista
    println("Rock lee" in names)

    // Convertendo Array para lista
    val listaDeNames = names.toList()
    println(listaDeNames)

    /*
    Arrays Multidimensionais
        Podemos criar arrays com múltiplas dimensões:
    */
    val matriz = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6),
        arrayOf(7, 8, 9)
    )
    println(matriz[1][2])
}