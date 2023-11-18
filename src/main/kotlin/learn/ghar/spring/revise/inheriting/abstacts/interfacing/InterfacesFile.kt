package learn.ghar.spring.revise.inheriting.abstacts.interfacing

interface Serializable {
    fun serialize(){
        println("serialize() call in interface")
    }
}

interface Comparable {
    fun compare()
}
/*  ---------- Multiple Inheritance with Same-named-function in different interfaces  */
interface Artist {
    fun draw(){
        println("draw a picture")
    }
}

interface CowBoy {
    fun draw(){
        println("draw a gun")
    }
}
