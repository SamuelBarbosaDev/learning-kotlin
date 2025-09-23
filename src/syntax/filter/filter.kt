fun main(){
    val list = listOf("Marco", "Maria", 7, "Tiago", 21, 22, 9, 11, 88, 1, 2, 3)
    val listFruits =  listOf("Manga", "Pera", "Maça", "Uva", "Melancia")

    val listNumbersLessThanTen = list.filterIsInstance<Int>().filter { it < 10 }
    val listString = list.filter { it is String }
    val listMFruits = listFruits.filter { it.contains("M") }

    println("List of Number:\n$listNumbersLessThanTen\n")
    println("List of Strings:\n$listString\n")
    println("List of Fruits with M:\n$listMFruits\n")
}