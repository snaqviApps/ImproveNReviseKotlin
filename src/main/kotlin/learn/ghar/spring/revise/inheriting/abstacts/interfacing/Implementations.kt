package learn.ghar.spring.revise.inheriting.abstacts.interfacing


fun main(){
    println("implementation examples")

    val button : Button = Button()       // instance created of type 'Interface'
    val checkBox : Clickable = CheckBox()

    clickingAppItem(button)
    clickingAppItem(checkBox)

}

fun clickingAppItem(clickable: Clickable) {         // passable interface as references
    clickable.click()
}

interface Clickable {
    fun click()
}

class Button : Clickable {
    override fun click() {
        println("Button was clicked")
    }
}

class CheckBox : Clickable {
    override fun click() {
        println("Checkbox was clicked")
    }
}