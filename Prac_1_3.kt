import java.util.Scanner

fun main() {

    val ip = Scanner(System.`in`)

    print("Enter your enrollment number: ")
    var en_no = readLine()

    print("Enter your name: ")
    var name = readLine()

    print("Enter your age: ")
    var age: Int = ip.nextInt()

    print("Enter your branch: ")
    var branch = readLine()

    print("Enter your class: ")
    var cl = readLine()

    print("Enter your batch: ")
    var batch = readLine()

    print("Enter your College name: ")
    var clg = readLine()

    print("Enter your University name: ")
    var uni = readLine()

    println("\n\n**************************\n")
    println("Student's data:")
    println("Enrollment No.: $en_no")
    println("Name: $name")
    println("Age: $age")
    println("Branch: $branch")
    println("Class: $cl")
    println("Batch: $batch")
    println("College name: $clg")
    println("University name: $uni")
}