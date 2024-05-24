import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {

    println("Task2")

    //ввід цілого числа
    print("Enter number: ")
    val num: Int = readln().toInt()

    //Обрахунок сотень
    val hundreds = num / 100

    //обрахунок десятків
    val tens = num / 10 % 10

    //обрахунок одиниць
    val ones = num % 10

    //обрахунок результуючого числа
    val result = tens * 100 + hundreds * 10 + ones

    print("Result number: $result")
}