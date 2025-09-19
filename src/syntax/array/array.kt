fun main(args: Array<String>){
    val names = listOf(
        "Carlos",
        "Marcos",
        "Carol",
        "Maria",
        7
    )
    val newList = names.plus("Bruna")

    names.forEach { it -> println(it) }
    println(names[0])
    println(names.size)
    println(names.indexOf("Marcos"))
    println(names.first())
    println(names.last())
    println(names.contains("Vera"))
    println(names.shuffled())
}