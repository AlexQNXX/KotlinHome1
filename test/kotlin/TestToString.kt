import org.junit.Test
import org.junit.Assert.*

class TestToString {
    //15 -> "Int 15"
    //"123" -> "String"
    //.. ->"Any"
    //return ""
    @Test
    fun test15ToInt15 ()
    {

        assertEquals ("Int 15", printAny (15))
    }
    @Test
    fun test123ToString123 ()
    {

        assertEquals ("String 123", printAny ("123"))
    }
    @Test
    fun testAny ()
    {

        assertEquals ("Any", printAny (3.5f))
    }

}

