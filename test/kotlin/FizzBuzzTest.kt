import org.junit.Test
import org.junit.Assert.*

class FizzBuzzTest {
    //15 -> "Int 15"
    //"123" -> "String"
    //.. ->"Any"
    //return ""
    @Test
    fun test3toFizz() {
        assertEquals("fizz", fizzbuzz(3))
    }

    @Test
    fun test5toFizz() {
        assertEquals("buzz", fizzbuzz(5))
    }

    @Test
    fun test15toFizzBuzz() {
        assertEquals("fizzbuzz", fizzbuzz(15))
    }
}