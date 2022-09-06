// Это однострочный комментарий
/*
Многострочный комментарий
    /* Это вложенный комментарий */
 */

const val DEBUG = true //это как final в java - константа времени компиляции

fun main(args:Array<String>)
{


    val name = "Dima"  //константа времени выполнения
        // (но с точки зрения kotlin это почти тоже что const, это переменная которую нельзя модифицировать)

    val name1 : String = "Vasya" //явное указание типа
    val name2 = "Alex"

    var lastname = "Ivanov"
    lastname = "Rusakov"

    println ("Hello, world!")

   // nullable типы
    var age: String?  //может быть String а может быть null
    age = null

    println(" age length: " + age?.length)
     //? коворит компилятору что если age не null то выводится длина, если Null то выводится null
   // println(" age length: " + age!!.length)  //!! говорит что там точно не null , будет Null pointer exception

    //    ветвления

    //if
    val temperature = 14
    val condition = if (temperature < 5)  //if в котлине - это инструкция которая может возвращать значение
            "Холодно"
    else if (temperature < 15)
        { println("тест")
        "Средне" }
    else if (temperature < 40)
        "Жарко"
    else "Очень жарко"

    println(condition)

    //ветвление с помощью when - делает не нужным switch
    val cond = when {
        temperature <5 -> "Cold"
        temperature <15 -> "Medium"
        temperature <40 -> "Hot"
        else -> "Very hot!"
       //в switch (java) можно проверить только одно значение

    }

    //проверка и приведенеи типов
    //Int, String, Long наслдеуют от Any
    //Nothing наследник всех типов
    //Int?, String?, Long? наслдеуют от Any?
    //Nothing? наследник всех типов Int?, String?, Long? Any?

    val obj:Any = "22"
    // smart cast
    if (obj is String){
        //внутри этого блока уже можно применять все методы как к переменной типа String
        //причем можно уже не приводить к типу String в этом блоке
        println("String len is: "+ obj.length)
        println("String len is: ${obj.length}")
    }

    //операторы приведения

    //unsafe cast (не безопасное)
    val y = 12
   // val x:String = y as String //unsafe cast

    //safe cast (безопасное) - тут не надо обрабатывать исключения
    val z : String? = y as? String
    println ("z = "+z)

        //строковые шаблоны
    val firstName = "Masha"
    val lastName = "Ivanova"
    val a = 23

    // java way
    println ("Hello " + firstName + " " + lastName + " with age "+ (a+1))

    //kotlin way
    println ("Hello, $firstName $lastName with age ${a+1}")  //{} - если хотим вычислить выражение

    //многострочные шаблоны
    println("""
        Это первая строка
        Это вторая строка
        Это третья строка
        """.trimIndent() ) //trimIndent отрезает только пробелы

    val literal = """
        Это первая строка
        Это вторая строка
        Это третья строка
        """
    println (literal)

    println("""
        |SELECT ID FROM NAME 
        |WHERE AGE > 12
        """.trimMargin()) //trimMargin отрезает по символ |

    //функции
    println(greeting ("Alex", "Lee"))

    //циклы
    //while
    //do-while
    var i=1
    while (i<=10)
    {
        println (i)
        i++
    }

//    do{
//
//    }while (a<3)

    //диапазоны

    val oneToFive = 1..5
    val smallLetters = 'a'..'z'

    if ('d' in smallLetters)
        println("входит")
    else
        println("не входит")

    val HundredToOne = 100 downTo 1 step 4

    for (k in HundredToOne)
    {
        println("k = $k")
    }

    val betweenJavaAndYaml = "Java" .. "Yaml"
    //kilo можно проверить входимость в диапазон,
    //   а вот проитерироваться в For не сможем - количество вариантов слишком велико

    if ("Kilo" in betweenJavaAndYaml)
    {
        println("Kilo")
    }

println(printAny("123"))

println(fizzbuzz(3))


} //end main

    //функции
//вариант 1
fun greeting(firstName:String, lastName: String):String //возвращает String
{
    return "Hello, $firstName $lastName"
}

//вариант 2
//fun greeting(firstName:String, lastName: String):String = "Hello, $firstName $lastName" //возвращает String

//вариант 3
//fun greeting(firstName:String, lastName: String) = "Hello, $firstName $lastName" //возвращает String

//fun japaneseSalary (base:Int, years: Int) : Int
//туду - будет написано позже

//японская зарплата
fun japaneseSalary (base:Int, years: Int) : Int //для денег хорошо использовать тип big decimal
{
    return base + years * 10000;
}

fun printAny(any:Any):String
{
    return when {
        any is Int -> "Int $any"
        any is String -> "String $any"
        else -> "Any"
    }

    // или так
//    return when (any) {
//        is Int -> "Int" + any
//        is String -> "String" + any
//        else -> "Any"


    //15 -> "Int 15"
    //"123" -> "String"
    //.. ->"Any"
    //return ""
}

fun fizzbuzz(i:Int):String
{
//fizz buzz
//Int / 3 - fizz
//Int /5 - buzz
//Int /3 /5 - fizzbuzz
//если не делиться то будет выдавать ""
//%остаток от деления
//1..15
    return when {
        ((i % 3) == 0 ) && ((i % 5) == 0) ->  "fizzbuzz"

        (i % 5) == 0 ->  "buzz"

        (i % 3) == 0 ->  "fizz"
        else  -> ""
    }
}
