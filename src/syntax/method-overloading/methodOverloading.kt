fun main(args: Array<String>){
    val user = User()
    user.login("email@email.com", "$%**83*fF*33**")
    user.login("+00 (99) 9 9999-9999")
}

class User{
    fun login(email: String, password: String){
        println("Logando com E-mail ($email) e Senha ($password).")
    }

    fun login(phone: String){
        println("Logando com Telefone ($phone).")
    }
}