package caesars.cipher

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CaesarCipherTest {

    val caesarsCipher = CaesarsCipher()

    @Test
    fun testCipheredMessageWithOffsetOf12(){
        assertEquals("tai mdq kag pauzs fapmk", caesarsCipher.cipher("how are you doing today", 12))
    }

    @Test
    fun testEmptyString(){
        assertEquals("", caesarsCipher.cipher("", 12))
    }

}