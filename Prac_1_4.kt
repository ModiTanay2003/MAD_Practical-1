fun main() {
    print("Enter a number: ")
    val a = readLine()!!.toInt()

    if (a % 2 == 0) {
        println("$a is even.")
    } else {
        println("$a is odd.")
    }
}