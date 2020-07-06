import java.nio.channels.CancelledKeyException
import kotlin.reflect.jvm.internal.impl.util.Check

interface Clickable{
    fun click()
}

interface View{
    fun draw()
}

class Button: Clickable, View
{
    fun setText(){
        //setting text
    }

    override fun click() {
        println("Button is clicked")
    }

    override fun draw() {
        //draw Button via rectangle
    }

}
class CheckBox: Clickable, View {
    override fun click() {
        println("CheckBox is clicked")
    }

    override fun draw() {
        //drawing CheckBox and galochka
    }
}

class Image: Clickable, View {
    override fun click() {
        println("Image is clicked")
    }

    override fun draw() {
        //drawing image via pixels
    }
}

fun main(){
    val button = Button()
    val image = Image()
    val checkBox = CheckBox()

    val views = arrayOf(button,image,checkBox)

    views.forEach {
        it.draw()
//        it.click()
    }
}