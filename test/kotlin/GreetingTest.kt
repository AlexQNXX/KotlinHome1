import org.junit.Test
import org.junit.Assert.*

class GreetingTest {
    @Test
    fun testSvetaIvanova ()
    {   //в основном тестируют бизнес-логику приложения, а интерфейс пользователя, как правило нет,
         // внешние подключаемые библиотеки как правило нет
        assertEquals ("Hello, Sveta Ivanova", greeting ("Sveta", "Ivanova"))
        //greeting ("Sveta", "Ivanova") //Hello, Sveta Ivanova
    }
    @Test
    fun test50k5yearJapaneseSalary ()
    {   //в основном тестируют бизнес-логику приложения, а интерфейс пользователя, как правило нет,
        // внешние подключаемые библиотеки как правило нет
        assertEquals (100_000, japaneseSalary (50_000, 5))
        //japaneseSalary (50_000, 5)
    }
}