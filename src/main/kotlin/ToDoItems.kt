import kotlinx.js.jso

external interface ToDoItem {
    var text: String
    var completed: Boolean
}
//Specify type
val initialTodos = arrayOf<ToDoItem>(
    jso {
        text = "Learning Kotlin JS"
        completed = false
    },
    jso {
        text = "Learning Kotlin React"
        completed = true
    },
    jso {
        text = "Learning Redux"
        completed = false
    },
)