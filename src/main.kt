import java.util.Scanner

/*
 * A program to help demonstrate Kotlin basics
 */

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    println("Hello, World!")

    if (args.size > 1) {
        // pass in arguments via run > edit configuration > program arguments
        println("${args.size} arguments passed to main")
        for (value in args) {
            println(value)
        }
    } else {
        println("No arguments passed to main")
    }

    print("Enter a name for your buddy: ")
    val buddyName = scanner.nextLine()

    // val cannot be changed
    // var can be changed
    val buddy = KotlinBuddy(buddyName)
    buddy.welcome()

}

class KotlinBuddy constructor(name: String) {

    init {
        println("Kotlin Buddy ${name.toUpperCase()} is alive!!")
    }

    fun welcome() {
        println("Welcome to the Kotlin helper :)")
    }

}