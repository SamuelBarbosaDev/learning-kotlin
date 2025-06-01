fun main(args: Array<String>){
    val bmw = Car(brand="BMW", model="X1", year=2014, color="Black")
    val honda = Car(brand="honda", model="CIVIC", year=2025)

    bmw.description()
    honda.description()
}

class Car(
    // Constructor primário 
    val brand: String,
    val model: String,
    val year: Int
){
    init{
        println("Inicializando...")
    }

    // Constructor secundário
    var color = "Desconhecida"
    constructor(brand: String, model: String, year: Int, color: String): this(brand, model, year){
        println("Constructor Secundário")
        this.color = color
    }

    fun description(){
        println("Marca: $brand, Modelo: $model, Ano: $year, cor: $color")
    }
}