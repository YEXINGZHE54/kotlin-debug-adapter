package sample.workspace

class App {
    private val member: String = "test"
    val greeting: String
        get() {
            val local: Int = 123
            return "Hello world."
        }
    
    override fun toString(): String = "App"
}

fun main(args: Array<String>) {
    println(App().greeting)
}
