class Rectangle (val height: Int, val width:Int)
{
//    fun isSquare () = height == width // можно в виде функции
    val isSquare:Boolean //можно вариант свойство класса rectangle
//    get() = height ==width //каждый раз оно вычисляется

    //можно так
    get ()
    {
        println ("Calculating...")
        return height==width
    }

    //это свойство проинициализируем позже
    lateinit var color:Color //= Color.RED
//        set (value)
//        {
//            field = value
//        }

    //это свойство проинициализируем сейчас
    var depth = 15
        set (value)
        {
        field = value
        }

}