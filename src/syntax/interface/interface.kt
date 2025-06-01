fun main(args: Array<String>) {
    val guerreiro = Guerreiro()
    guerreiro.toBeBorn()
    guerreiro.toGrow()
    guerreiro.itStrengthens()
}

interface MartialArtist{
    fun itStrengthens()
}

open class Man{
    fun toBeBorn(){
        println("Nascer")
    }
    fun toGrow(){
        println("Crescer")
    }
    fun toDie(){
        println("Morrer")
    }
}

class Guerreiro: Man(), MartialArtist{
    override fun itStrengthens(){
        println("Fortalece-se.")
    }
}