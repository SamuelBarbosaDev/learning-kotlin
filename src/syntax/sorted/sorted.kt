package com.agiotagemltda.collection.learning

fun main() {
    val listASC = listOf(5, 1, 4, 47, 3, 860, 7, 23, 2).sorted()
    val listDESC = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 99, 88, 74, 13, 19, 22)
        .sortedDescending()

    println("Ascending list:\n$listASC\n")
    println("Descending list:\n$listDESC\n")
}