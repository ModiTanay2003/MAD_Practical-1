fun main() {
    // val num = 5
    print("Enter a number: ")
    val input = readLine()!!
    val num: Int = input.toInt()
    println("Factorial of $num = ${findFactorial(num)}")
    println("By TailRec Keyword, Factorial of $num = ${factorial(num)}")
}

fun findFactorial(num: Int): Long {
    if (num == 1) {
        return 1
    }
    while (num > 0) {
        return num * findFactorial(num - 1)
    }
    return -1
}

tailrec fun factorial(num: Int, run: Int = 1): Long {
    return if (num == 1) {
        run.toLong()
    } else {
        factorial(num - 1, run * num)
    }
    return -1
}
