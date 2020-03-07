package caesars.cipher

class CaesarsCipher {
    val LETTER_A = 'a'
    val LETTER_Z = 'z'
    val ALPHABET_SIZE = 26

    fun cipher(message: String, offset_: Int): String{
        val offset = offset_ % ALPHABET_SIZE
        val character = message.toCharArray()
        offsetBy(character, offset)
        return String(character)
    }

    private fun offsetBy(character: CharArray, offset: Int) {
        for(i in character.indices){
            if (character[i] != ' ') {
                character[i] = offsetChar(character[i], offset, LETTER_A, LETTER_Z)
            }
        }

    }

    private fun offsetChar(c_: Char, offset: Int, letterA: Char, letterZ: Char): Char {
        val c = c_ + offset
        if (c < letterA){
            return c + ALPHABET_SIZE
        }
        if (c > letterZ){
            return c - ALPHABET_SIZE
        }
        return c
    }


}