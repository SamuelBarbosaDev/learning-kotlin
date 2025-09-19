fun main(args: Array<String>){
    val car = Car()
    car.model = "Ford Kar"
    car.price = 20000.00

    println("Model: ${car.model} \n Price: ${car.price}")
}

class Car(){
    var model: String = ""
        get() {
            return field.uppercase()
        }
        set(value) {
            field = "Set: $value"
        }
    var price: Double = 0.0
        get(){
            return field + 69.99
        }
        set(value){
            field = value - 5
        }

}