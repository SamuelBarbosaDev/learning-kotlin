fun main(args: Array<String>){
    val persona1 = Persona("Zé alicate", 9, 2.7)
    val persona2 = Persona("Zé alicate", 9, 2.7)

    if (persona1 == persona2) println("The same person.")
}

data class Persona(val name: String, var power: Int, var speed: Double)
