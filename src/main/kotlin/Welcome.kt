import csstype.TextDecoration
import csstype.px
import emotion.react.css
import kotlinx.js.jso
import react.FC
import react.Props
import react.dom.html.InputType
import react.dom.html.ReactHTML.button
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.input
import react.dom.html.ReactHTML.label
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.ul
import react.useState

val Welcome = FC<Props> {
    val (items, setItems) = useState(initialTodos)
    val (item, setItem) = useState("")
    console.log(item)
    div {
        css {
            paddingTop = 50.px
            paddingBottom = 50.px
        }
        +"Hello World"
        div {
            css {
                paddingTop = 50.px
                paddingBottom = 50.px
            }
            label {
                +"To Do Item"
            }
            input {
                type = InputType.text
                onChange = {
                    setItem(it.target.value)
                }
            }
            button {
                onClick = {
                    console.log("Button Clicked")
                    val newToDo = jso<ToDoItem> {
                        text = item
                        completed = false
                    }
                    setItems(items + newToDo)
//                    setItems(arrayOf(newToDo))
                }
                +"Add Item"
            }
        }
        ul {
            items.forEach {
                li {
                    +it.text
                    if (it.completed == true) {
                        css {
                            textDecoration = TextDecoration.lineThrough
                        }
                    }
                }
            }
        }
    }
}

//css affects the parent
//jso javascript object