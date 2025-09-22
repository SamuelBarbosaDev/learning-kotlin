fun main(){
    val namesDictionary = mapOf(
        "name_1" to "Marcia",
        "name_2" to "João",
        "name_3" to "Carol",
        "name_4" to "Luiza"
    )

    namesDictionary.forEach {
        println("{${it.key}} - ${it.value}")
    }
}