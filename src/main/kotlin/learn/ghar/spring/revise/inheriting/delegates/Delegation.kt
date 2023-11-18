package learn.ghar.spring.revise.inheriting.delegates

fun main(args: Array<String>){
    println("delegation that prefers composition over inheritance using 'by' in Kotlin")

    val p1 = Person(SerializeCSV())           // delegation here and line below, off to whichever is being passed in
    val p2 = Person(SerializeJSON)          // (like: SerializeJSON)

    p1.save()
    p2.save()
}

class SerializeCSV : Serialize {
    override fun save() {
        println("stores as CSV")
    }
}

object SerializeJSON : Serialize {
    override fun save() {
        println("stores as JSON")
    }
}

interface Serialize {
    fun save()
}

/**
 * 'delegating' the Interface passed in the constructor
 */
class Person(private val serializer: Serialize) : Serialize by serializer {  }