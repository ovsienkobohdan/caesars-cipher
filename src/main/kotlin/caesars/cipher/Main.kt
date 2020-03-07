package caesars.cipher

fun main(){

    val message = "how are you doing today"
    val offset = 12

    val caesarsCipher = CaesarsCipher()
    val cipheredMessage = caesarsCipher.cipher(message, offset)
    println("Message: $message")
    println("Offset: $offset")
    println("Ciphered message: $cipheredMessage")
}