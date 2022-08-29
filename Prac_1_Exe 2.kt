open class Product(name: String, quantity: Int) {
    var p: Int = -1

    init {
        println("Product name :$name")
        println("Quantity: $quantity")
    }

    constructor(name: String, quantity: Int, p: Int) : this(name, quantity) {
        this.p = p
        println("Price :$p per piece")
    }
}

class Laptop(
    name: String, quantity: Int, price:
    Int, cName: String, rSize: String
) : Product(name, quantity, price) {
    var hdd: String = ""

    init {
        println("CPU name:$cName")
        println("RAM Size:$rSize")
    }

    constructor(
        name: String, quantity: Int, price: Int, cName: String, rSize:
        String, hdd: String
    ) : this(name, quantity, price, cName, rSize) {
        this.hdd = hdd
        println("HDD Size:$hdd")
        println("---------------")
    }
}

fun main() {
    var laptops = ArrayList<Laptop>()
    laptops.add(Laptop("DELL", 5, 90000, "Intel", "8GB", "1TB"))
    laptops.add(Laptop("Lenovo", 1, 50000, "Intel", "16GB", "512GB"))
    laptops.add(Laptop("Apple", 3, 100000, "Intel Duo", "8GB", "256GB"))
    laptops.add(Laptop("HP", 4, 76000, "AMD", "8GB", "512GB"))
    laptops.add(Laptop("MI", 8, 51000, "AMD", "16GB", "1TB"))
}