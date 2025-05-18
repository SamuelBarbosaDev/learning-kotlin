fun main(args: Array<String>) {
    val condition = false
    val option = 7

    if (condition){
        println("A condição verdadeira!")
    } 
    else if(option in 1..9){
        println("$option está dentro do range de 1 a 9.")
    } 
    else{
        println("Nenhuma das condições é verdadeira.")
    }
}