class Phone (
    val model: String,
    val brand: String,
    var price: Double
){
    fun notification() = println("Message for you")
    fun sendMessage() = println("Sending a message to your enemy.")
    fun showDescription() = println("Model: $model, Brand: $brand, Price: $price")
    fun bootload(active: Boolean) = println("Bootload unlocked")
}

fun main(){
    // Let
    val phone1: Phone? = Phone(
        "Pixel 11",
        "Google",
        500.00
    )

    phone1?.let {
        println("I have a ${it.model}")
    }

    // run
    val phone2 = Phone(
        "IPhone X",
        "Apple",
        1000.00
    )

    phone2.run{
        this.notification()
        this.sendMessage()
        this.showDescription()
    }

    //    with
    val withMessage = with(phone2){
        "${this.brand} very expensive."
    }

    println(withMessage)

    // Apply
    phone1?.apply {
        bootload(true)
    }

    // Also
    val listNames = listOf("Samuel", "Bianca", "Carol")

    listNames
        .map { it.uppercase() }
        .also{ println("Use Also function: $it")}
}

/*
Em Kotlin, o conceito de **funções de escopo** (scope functions) é uma
característica poderosa que permite executar blocos de código no contexto
de um objeto de forma mais concisa e expressiva. Elas são usadas para
manipular objetos, inicializá-los, transformá-los ou executar operações em
um contexto específico. As funções de escopo mais comuns em
Kotlin são: `let`, `run`, `with`, `apply` e `also`.

Abaixo, explico cada uma delas, suas diferenças, casos de uso e exemplos práticos.

---

### **O que são funções de escopo?**
Funções de escopo são funções de extensão (ou não, no caso de `with`) que
permitem executar um bloco de código em um objeto, definindo um **escopo**
onde o objeto está disponível de forma especial (como `this` ou `it`). Elas ajudam a:
- Evitar código repetitivo.
- Tornar o código mais legível e fluido.
- Encadear operações em objetos.
- Manipular objetos de forma segura (como em verificações de nulidade).

As cinco funções de escopo principais são:
1. **`let`**
2. **`run`**
3. **`with`**
4. **`apply`**
5. **`also`**

---

### **1. `let`**
- **Propósito**: Executa um bloco de código em um objeto, acessando-o como `it`.
É muito usado para operações em objetos que podem ser nulos (null-safety).
- **Retorno**: O resultado do bloco de código (lambda).
- **Contexto**: O objeto é acessado como `it`.
- **Uso comum**: Trabalhar com objetos que podem ser nulos, mapeamentos ou transformações.

**Quando usar `let`?**
- Quando você precisa executar um bloco de código apenas se o objeto não for nulo.
- Para transformar o objeto em outro valor (o retorno da lambda é o resultado).
- Quando você prefere usar `it` em vez de `this`.

---

### **2. `run`**
- **Propósito**: Executa um bloco de código no contexto do objeto, onde o objeto é acessado
como `this`. É semelhante ao `let`, mas usa `this` em vez de `it`.
- **Retorno**: O resultado do bloco de código (lambda).
- **Contexto**: O objeto é acessado como `this` (pode omitir `this.`).
- **Uso comum**: Executar operações que envolvem o objeto e retornar um resultado computado.

**Quando usar `run`?**
- Quando você quer executar um bloco de código no contexto do objeto e retornar um valor computado.
- Quando o objeto não é nulo e você prefere usar `this` (ou omiti-lo).

---

### **3. `with`**
- **Propósito**: Executa um bloco de código no contexto de um objeto, acessando-o como `this`.
Diferentemente das outras, `with` não é uma função de extensão, mas uma função regular que
aceita o objeto como argumento.
- **Retorno**: O resultado do bloco de código (lambda).
- **Contexto**: O objeto é acessado como `this`.
- **Uso comum**: Configurar ou manipular um objeto sem retornar o próprio objeto.

**Quando usar `with`?**
- Quando você quer executar várias operações no mesmo objeto e retornar um valor computado.
- Similar ao `run`, mas usado quando o objeto não é uma extensão (sintaxe mais explícita).

---

### **4. `apply`**
- **Propósito**: Executa um bloco de código no contexto de um objeto, onde o objeto é acessado
como `this`, e retorna o próprio objeto.
- **Retorno**: O próprio objeto.
- **Contexto**: O objeto é acessado como `this`.
- **Uso comum**: Inicializar ou configurar propriedades de um objeto.

**Quando usar `apply`?**
- Quando você precisa configurar ou inicializar um objeto e retornar o próprio objeto.
- Ideal para configurar objetos recém-criados ou builders.

---

### **5. `also`**
- **Propósito**: Executa um bloco de código em um objeto, acessando-o como `it`, e retorna
o próprio objeto.
- **Retorno**: O próprio objeto.
- **Contexto**: O objeto é acessado como `it`.
- **Uso comum**: Executar ações secundárias (como logging ou efeitos colaterais) sem alterar
o fluxo principal.

**Quando usar `also`?**
- Quando você quer realizar ações adicionais (como logging ou validação) em um objeto e
retornar o próprio objeto.
- Útil para efeitos colaterais sem modificar o objeto diretamente no bloco principal.

---

### **Comparação Rápida**

| Função | Contexto do Objeto | Retorno | Uso Comum |
|--------|--------------------|---------|-----------|
| `let`  | `it`              | Resultado da lambda | Null-safety, transformação |
| `run`  | `this`            | Resultado da lambda | Computar algo no contexto do objeto |
| `with` | `this`            | Resultado da lambda | Manipulação direta do objeto |
| `apply`| `this`            | Próprio objeto      | Inicializar/configurar objeto |
| `also` | `it`              | Próprio objeto      | Ações secundárias (logging, etc.) |

---

### **Dicas para Escolher a Função Certa**
1. **Precisa lidar com nulidade?** Use `let` para verificações seguras (`?.let`).
2. **Quer configurar um objeto e retorná-lo?** Use `apply`.
3. **Quer executar ações secundárias?** Use `also`.
4. **Quer calcular algo e retornar um valor?** Use `run` ou `with`.
5. **Prefere `it` ou `this`?** Escolha com base na legibilidade:
   - `it` (`let`, `also`) é explícito e útil quando o nome do objeto não é necessário.
   - `this` (`run`, `with`, `apply`) permite omitir o nome do objeto, mas pode ser confuso
   em escopos aninhados.

---

### **Boas Práticas**
- **Evite aninhamento excessivo**: Funções de escopo podem tornar o código menos legível se usadas
em excesso ou aninhadas profundamente.
- **Escolha nomes claros**: Quando usar `it`, certifique-se de que o contexto é claro. Caso contrário,
renomeie `it` (ex.: `let { pessoa -> ... }`).
- **Use para legibilidade**: Escolha a função que torna o código mais expressivo e fácil de entender.
- **Cuidado com `this` em escopos aninhados**: Em blocos com `run`, `with` ou `apply`, o uso de `this`
pode ser ambíguo se houver objetos aninhados.

---
*/