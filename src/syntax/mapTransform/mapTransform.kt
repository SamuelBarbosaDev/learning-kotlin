fun main(){
    val listNames = listOf("Marcos", "Maria", "João", "Pedro")
    val newListNames = listNames.map { "NAME: ${it.uppercase()}" }

    println("List of Names:\n$newListNames")
}