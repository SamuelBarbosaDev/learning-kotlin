fun main(args: Array<String>){
    val martialArtist = MartialArtist(
        "Rei Maligno",
        3000,
        Status.STRENGTHENING_THE_EGO
    )

    martialArtist.description()
    println("Fortalecimento do corpo: ${Status.STRENGTHENING_THE_BODY}")
}

enum class Status{
    STRENGTHENING_THE_BODY,
    STRENGTHENING_THE_EGO,
    STRENGTHENING_THE_SPIRIT,
    STRENGTHENING_THE_ALMA
}

class MartialArtist(
    var name: String,
    var age: Int,
    var cultivationStatus: Status
){
    fun description(){
        println("Nome: ${name }, Idade: ${age}, Cultivação: ${cultivationStatus}")
    }
}