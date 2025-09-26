fun main(){
    val location = Pair("28° 00' 0.00\" N", "82° 00' 0.00\" E")
    val names = Triple("Samuel", "Rafael", "")

    println("Latitude: ${location.first} - Longitude: ${location.second}")
    println("Names:\n${names.first}, ${names.second}, ${names.third}")
}