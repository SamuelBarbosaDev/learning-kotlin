fun main(args: Array<String>){
    val phoneNumber = SavePhoneNumber(
        "(00) 00000-0000",
        "(00) 00000-0000",
        "(00) 00000-0000",
        "(00) 00000-0000",
        "(00) 00000-0000",
        "(00) 00000-0000",
        "(00) 00000-0000",
        "(00) 00000-0000"
    )
        .showPhoneNumber()
}

class SavePhoneNumber(
    vararg phoneNumbers: String
){
    private var phoneNumbersList = phoneNumbers
    fun showPhoneNumber(){
        for (phoneNumber in this.phoneNumbersList){
            println("Phone Number: $phoneNumber")
        }
    }
}