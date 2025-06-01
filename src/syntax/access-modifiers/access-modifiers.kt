fun main(args: Array<String>) {
    val car = Car()
    car.accelerate()
}

class Car{
    protected fun fuelInjection(){
        println("Injetando de combustível...")
    }

    fun accelerate(){
        fuelInjection()
        println("Acelerando...")
    }
}