import java.util.Scanner
import java.util.Calendar

/*
 * A program to help demonstrate a lot of Kotlin basics
 */

fun main(args: Array<String>) {
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

    // classes and input
    makeBuddy()

    // dec 5: types, func return types
    mathStuff()

    // longs and conditionals
    calcAge()

    // dec 6: ranges
    showRanges()

    // dec 21: companion object
    // Call a function of a class without instantiating it
    CompanionTest.sayHi()
    val doesThisWork = CompanionTest // not an instance
    doesThisWork.sayHi()

    val actualInstance = CompanionTest()
    actualInstance.needInstance()

    // Dec 31: `when`
    whenSample()
}

/**
 * Make the KotlinBuddy after getting the name of the buddy
 * from the user with the Scanner object
 */
fun makeBuddy() {
    val scanner = Scanner(System.`in`)
    print("Enter a name for your buddy: ")
    val buddyName = scanner.nextLine()

    // val cannot be changed
    // var can be changed
    val buddy = KotlinBuddy(buddyName)
    buddy.welcome()
}

/**
 * Demonstrate how to ues classes, constructors, and init methods
 */
class KotlinBuddy constructor(name: String) {

    init {
        println("Kotlin Buddy ${name.toUpperCase()} is alive!!")
    }

    fun welcome() {
        println("Welcome to the Kotlin helper :)")
    }

}

/**
 * Demonstrate different ways to represent numerical types. You
 * can be explicit with how you want to declare a long
*/
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

/**
 * To remove excess code from main, perform the necessary
 * steps to calculate someones age before calling the getAge
 * method that return an integer
 */
fun calcAge() {
    val scanner = Scanner(System.`in`)
    print("What year were you born?: ")
    val birthYear = scanner.nextInt()
    val age: Int = getAge(birthYear)
    println("\nYou must be $age years old")
}

/**
 * Demonstrate how to use a return type for a function
 */
fun getAge(birthYear: Int): Int {
    val age: Int = Calendar.getInstance().get(Calendar.YEAR) - birthYear
    println("Birth year: $birthYear")
    return age
}

/**
 * Dec 6, I learned about ranges and how you can even
 * use them with strings
 */
fun showRanges() {
    var inRange = 'b' in 'a'..'c'
    println("\'b\' in \'a\'..\'c\': $inRange")
    inRange = 'z' in 'a'..'y'
    println("\'z\' in \'a\'..\'y\': $inRange")
}

/**
 * Demonstrate how to use a companion object, otherwise known
 * as a static method for a class
 */
class CompanionTest() {
    companion object CompanionBuddy {
        fun sayHi() {
            println("Hello from companion buddy!")
        }
    }
    fun needInstance() {
        // a function that needs an instance of the class to be run
        println("You need an instance to run me!")
    }
}

/**
 * You can use the `when` statement along with `->` to
 * handle multiple cases efficiently
 */
fun whenSample() {
    val num = 5
    when (num) {
        4 -> println("Unlucky number 4!")
        5 -> println("Lucky number 5!")
    }
}