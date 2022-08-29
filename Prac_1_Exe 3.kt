open class Person(firstname:String,lastname:String){
    var age:Int=-1
    init{
        println("First Name:$firstname")
        println("Last Name:$lastname")
    }
    constructor(firstname: String,lastname:
    String,age:Int):this(firstname,lastname){
        this.age=age
        println("Age $age")
    }
}
class Student(firstname:String,lastname:String,age:
Int,eno:Long,branch:String,Class:String):Person(firstname,lastname,age){
    var batch:String=""
    init{
        println("Branch $branch")
        println("Class $Class")
    }
    constructor(firstname:String,lastname:String,age:
    Int,eno:Long,branch:String,Class:String,batch:String):this(firstname,lastname,age,eno,branch,Class){
        this.batch=batch
        println("Batch $batch")
        println("--------------")
    }
}
fun main(){
    val students = ArrayList<Student>()
    students.add(Student("Tanay","Modi",19,20012011066,"CE","C","AB11"))
    students.add(Student("Jay","Khatri",20,12345679910,"CE","C","AB11"))
    students.add(Student("Manam","Patel",21,12457578451,"CE","D","AB8"))
    students.add(Student("Yash","Chaudhari",19,45779464131,"CE","B","AB3"))
    students.add(Student("Abhi","Patel",20,45712464141,"CE","C","AB7"))
}