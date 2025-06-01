fun main(args: Array<String>) {
    val bird = Bird()
    bird.run()
    bird.fly()
}

open class Animal{
    fun run(){
        println("Correndo como um animal.")
    }
}

class Bird: Animal(){
    fun fly(){
        println("Voando como um pássaro.")
    }
}