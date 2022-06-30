fun main() {
//    val child = Person("ChildName", "ChildName",35);
//val person = Person("Name", "LastName",35,child);

    val rectangle1 = Rectangle(5.4, 2.1)
//    val rectangle2 = Rectangle(5.4, 2.1)
//   println(rectangle1.area());

//    println(rectangle1==rectangle2)
}

class Person(val firstName: String, val lastName: String, var age: Int) {
    var chidren: ArrayList<Person> = arrayListOf();

    init {
        println("Person $firstName is created")
    }

    constructor(firstName: String, lastName: String, age: Int, child: Person) :
            this(firstName, lastName, age) {
        chidren.add(child)
    }
}

data class Rectangle(var height: Double, var lenght: Double) : Area,
    Perimeter {
    companion object {
        var count = 0
    }

    init {
        count++
        println("Created: $count objects")
    }

    var test = 1
        get() = field + 1
        set(value) {
            field = value + 3;
        }

    override fun area() = height * lenght;
    override fun perimeter() = (height + lenght) * 2
}

interface Area {
    fun area(): Double
}

interface Perimeter {
    fun perimeter(): Double
}

enum class NewEnum {
    ENUM1, ENUM2;
}

sealed class listOfDb {
    data class MySql(val id: Int, val connection: String) : listOfDb()
    data class Mongo(val id: Int, val connection: String) : listOfDb()
    data class PostgreSql(val id: Int, val connection: String) : listOfDb()
}