fun main(args: Array<String>) {
    val fish = Fish()
    fish.sleep()    
}

abstract class Animal{
    fun run(){
        println("Correndo como um animal.")
    }

    abstract fun sleep()
}

class Fish: Animal(){
    override fun sleep(){
        println("Dormindo debaixo da água.")
    }
}