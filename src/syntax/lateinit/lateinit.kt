fun main(args: Array<String>){
    val entrega = Entrega()

    entrega.status = "Entrega concluída"
    println(entrega.status)
}

class Entrega{
    lateinit var status: String
}
