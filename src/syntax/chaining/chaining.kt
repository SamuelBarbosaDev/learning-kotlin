fun main(args: Array<String>){
    Message.buildingMessage(
        "Hello World - The duration of the Message is",
        Message.LONG_DURATION
    ).exibi()
}

class Message(
    val msg: String,
    val duration: Int
){
    companion object{
        const val SHORT_DURATION: Int = 2
        const val LONG_DURATION: Int = 10
        fun buildingMessage(msg: String, duration: Int): Message{
            return Message(msg, duration)
        }
    }
    fun exibi(){
        println("${msg}: ${duration}")
    }
}