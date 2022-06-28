fun main(){
//    val child = Person("ChildName", "ChildName",35);
//val person = Person("Name", "LastName",35,child);

    val rectangle1 = Rectangle(5.4,2.1)
    val rectangle2 = Rectangle(5.4,2.1)

    println(rectangle1==rectangle2)
}

class Person(val firstName:String, val lastName:String,var age:Int){
    var chidren: ArrayList<Person> = arrayListOf();

    init {
        println("Person $firstName is created")
    }

    constructor(firstName: String, lastName: String,age: Int, child : Person):
            this(firstName,lastName,age){
                chidren.add(child)
            }
}

data class Rectangle(var height:Double, var lenght:Double){
    var perimeter = (height + lenght) *2

    var test = 1
        get() = field +1
        set(value){
        field = value
        }

    fun area() = height * lenght;
}