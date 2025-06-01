fun main(args: Array<String>){
    var shoes = Shoes()
    shoes.brand = "Gold"
    shoes.model = "Extreme"
    shoes.size = 49
    shoes.description()
}

class Shoes{
    var brand: String = ""
    var model: String = ""
    var size: Int = 0

    fun description(){
        println("Marca: $brand, Modelo: $model, tamanho: $size")
    }
}