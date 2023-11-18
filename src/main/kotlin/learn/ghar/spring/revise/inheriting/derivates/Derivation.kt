package learn.ghar.spring.revise.inheriting.derivates

fun main(){
    println("This is practice area")
    val studentsNames = listOf("Naeem", "Sal")
    val hamza = Student(
        studentsNames,
        24,
        50)

    val studentTwo = Student(50)

    println("1st student has the name: ${hamza.name}, grade: ${hamza.grade}")
    println("2nd student has the name: ${studentTwo.name}, ${studentTwo.grade}")

    studentTwo.provideName("from instance of ${studentTwo.javaClass.name }")
}

open class PersonPractice(open val name : String) {
    constructor(name: String, idParent: Int) : this(name)              // secondary constructor

    open fun provideName(inputName: String){
        println("Name in Parent class")
    }
}

class Student(val grade: Int) : PersonPractice("Sass ") {

    constructor(name: List<String>, idStudent: Int, age: Int) : this(90)    // if primary constructor has same 'state' (property) using 'this', is required instead of 'super'
    {
        println("parent-class, primary-constructor, 1st-param: ${super.name}")
        println("derived-class, sec-constructor, 1st-param-entries: $name")
    }

    override fun provideName(inputName: String){
        super.provideName(inputName)            // parent call to the same 'behavior' (method)
        println("Name in derived-class")
    }

}