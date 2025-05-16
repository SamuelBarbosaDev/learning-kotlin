fun main(args: Array<String>){
    // Valores podem ser nulos se indicados explicitamente.
    var name: String? = null
    // name = "Nal do Canal"
    
    // Usamos o `?.` para evitar NullPointerException
    println(name?.length)
}