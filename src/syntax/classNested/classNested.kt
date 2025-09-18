fun main(args: Array<String>){
    Driver("Toião do caminhão")
        .showDriverData()

    Driver.Truck("F-600")
        .showTruckData()
}

class Driver(val name: String){
    fun showDriverData() = println("The driver's name is: $name")

    class Truck(val truckName: String){
        fun showTruckData() = println("The name of the truck is: $truckName")}
}
