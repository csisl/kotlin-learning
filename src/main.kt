import java.util.Scanner
import java.util.Calendar

/*
 * A program to help demonstrate a lot of Kotlin basics
 */

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var usedArgs = false

    println("Hello, World!")

    if (args.size > 1) {
        // pass in arguments via run > edit configuration > program arguments
        println("${args.size} arguments passed to main")
        for (value in args) {
            println(value)
        }
        usedArgs = true
    }

    if (!usedArgs) {
        println("No arguments passed to main")
    }

    print("Enter a name for your buddy: ")
    val buddyName = scanner.nextLine()

    // val cannot be changed
    // var can be changed
    val buddy = KotlinBuddy(buddyName)
    buddy.welcome()

    // dec 5: types, func return types
    mathStuff()

    print("What year were you born?: ")
    val birthYear = scanner.nextInt()
    val age: Int = getAge(birthYear)
    println("\nYou must be $age years old")

    // dec 6: ranges
    showRanges()
}

class KotlinBuddy constructor(name: String) {

    init {
        println("Kotlin Buddy ${name.toUpperCase()} is alive!!")
    }

    fun welcome() {
        println("Welcome to the Kotlin helper :)")
    }

}

// demonstrate different ways to represent numerical types
// you can be explicit with how you want to declare a long
fun mathStuff() {
    val scanner = Scanner(System.`in`)
    val myLong: Long = 100_000_000
    // or not
    val bezosNetWorthProbably = 100_000_000_000L
    println("Longs are cool! $bezosNetWorthProbably\t $myLong")

    print("Enter some long: ")
    val userLongInput = scanner.nextLong()
    println("\nYour long: $userLongInput")
}

// you can create a return type for a function
fun getAge(birthYear: Int): Int {
    val age: Int = Calendar.getInstance().get(Calendar.YEAR) - birthYear
    println("Birth year: $birthYear")
    return age
}

// Dec 6, I learned about ranges and how you can even use them with strings
fun showRanges() {
    var inRange = 'b' in 'a'..'c'
    println("\'b\' in \'a\'..\'c\': $inRange")
    inRange = 'z' in 'a'..'y'
    println("\'z\' in \'a\'..\'y\': $inRange")
}