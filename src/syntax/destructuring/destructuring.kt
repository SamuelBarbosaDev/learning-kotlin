fun main(args: Array<String>){
    val fighter1 = Fighter("Zé alicate", 9, 2.7)

    val (name, power, speed) = fighter1

    println("Name: $name, Power: $power, Speed: $speed")
}

data class Fighter(val name: String, var power: Int, var speed: Double)