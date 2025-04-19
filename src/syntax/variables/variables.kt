/*
Em Kotlin, const val é usada para definir valores 
constantes que são conhecidos em tempo de compilação. 
Isso significa que o valor é atribuído diretamente no bytecode 
e não pode ser modificado em tempo de execução.

    - Diferença entre const val e val

A principal diferença entre const val e val é que:

    - const val pode apenas ser usado para variáveis globais 
    dentro de objetos (object) ou top-level (fora de funções).

    - val pode ser usado em qualquer contexto, incluindo dentro 
    de classes e funções, mas seu valor é determinado em tempo de execução.
*/

const val absolute = 1234

fun main(args: Array<String>) {
    /*
        - O kotlin trabalha com inferência de tipo.
        - No kotlin não é obrigatório o ";" ao final do código.
    */ 

    // Variável imutável (val).
    val PI = 3.14

    // Variável mutável (var).
    var food = "rice"
    food = "meat"

    // Saídas
    println("Today I'll eat ${food} .")
    println("The value of PI is ${PI}")
    println(absolute)
}