fun main() {
    var flag: Int = 1;
    while (flag == 1) {
        println("Enter Month Number: ")
        val input = readLine()!!
        val month: Int = input.toInt()
        if (month > 0 && month <= 12) {
            flag = 0
            when (month) {
                1 -> println("Month 1 -> January")
                2 -> println("Month 2 ->  February")
                3 -> println("Month 3 -> March")
                4 -> println("Month 4 ->  April")
                5 -> println("Month 5 -> May")
                6 -> println("Month 6 -> June")
                7 -> println("Month 7 ->  July")
                8 -> println("Month 8  -> August")
                9 -> println("Month 9 ->  September")
                10 -> println("Month 10 -> October")
                11 -> println("Month 11 ->  November")
                12 -> println("Month 12 -> December")
            }
        }
    }
}