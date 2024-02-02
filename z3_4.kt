fun main ()
{
    println ("Задание 3")
    print("Введите свой возраст: ")
    var age = readLine()!!.toInt()
    if (age>0 && age<150) {
        when (age) {
            in 0..2 -> println("Младенец")
            in 3..12 -> println("Детсво")
            in 13..18 -> println("Подросток")
            in 19..35 -> println("Молодость")
            in 26..59 -> println("Зрелость")
            else -> println("Пожилой возраст")
        }
    }
    else println ("Возраст был введён не корректно")


    println ("\nЗадание 4")
    print("Введите X: ")
    var x = readLine()!!.toDouble()
    var y =0.toDouble()
    when
    {
        x>3 -> y = -3*x+9
        else -> y = (Math.pow(x,3.0))/(Math.pow(x,2.0)+8)
    }
    println("\nF(x) = ${"%.2f".format(y)}")
}