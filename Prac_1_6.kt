import java.util.Scanner

fun main() {
    val ip = Scanner(System.`in`)

    print("Enter number 1: ")
    //val input1 = readLine()!!
    var input1: Int = ip.nextInt()
    val a: Float = input1.toFloat()

    print("Enter number 2: ")
    //val input2 = readLine()!!
    var input2: Int = ip.nextInt()
    val b: Float = input2.toFloat()

    println("")
    println("$a + $b = " + add(a, b))
    println("$a - $b = " + sub(a, b))
    println("$a * $b = " + mult(a, b))
    println("$a / $b = " + div(a, b))
    println("$a % $b = " + mod(a, b))
}

fun add(num1: Float, num2: Float): Float {
    return num1 + num2
}

fun sub(num1: Float, num2: Float): Float {
    return num1 - num2
}

fun mult(num1: Float, num2: Float): Float {
    return num1 * num2
}

fun div(num1: Float, num2: Float): Float {
    return num1 / num2
}

fun mod(num1: Float, num2: Float): Float {
    return num1 % num2
}