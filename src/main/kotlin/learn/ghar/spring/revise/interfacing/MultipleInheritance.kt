package learn.ghar.spring.revise.interfacing

fun main(){
    println("multiple implementations")

    val student = Student()
    student.serialize()
}

open class Person

class Student : Person(), Serializable, Comparable {
    override fun serialize() {
        super.serialize()           // calling original implementation in Interface-S
        println("calling serializable function-in-implemented")
    }

    override fun compare() { }
}

/*  ---------- Multiple Inheritance with Same-named-function in different interfaces  */
class VillagePainter : CowBoy, Artist {
    override fun draw() {
        super<Artist>.draw()            // both interfaces (Implementations) carried out
        super<CowBoy>.draw()
    }

}