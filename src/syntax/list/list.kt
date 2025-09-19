fun main(args: Array<String>){
    val listName = mutableListOf(
        "Afonso",
        "Antônio",
        "Sergio"
    )
    // ADD
    listName.add("Lucas")
    println(listName)
    // REMOVE
    listName.remove("Antônio")
    println(listName)
    // CLEAR
    listName.clear()
    println(listName)
}