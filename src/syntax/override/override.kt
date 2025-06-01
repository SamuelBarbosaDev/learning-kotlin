fun main(args: Array<String>) {
    val dog = Dog()
    dog.run()
}

open class Animal{
    open fun run(){
        println("Correndo como um animal.")
    }
}

class Dog: Animal(){
    override fun run(){
        println("Correndo como um cachorro.")
    }
}