/**
 * Notes from the android training on https://developer.android.com/courses
 */

fun main() {
    val die = Dice(6)
    val rollResult = die.roll()
    println("The ${die.numSides} sided dice rolled a $rollResult")
    val coinFlip = Coin().flip()
    println(coinFlip)
}

class Dice constructor(val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random() // can call random method from IntRange
    }

}

class Coin {

    private fun flipNum(): Int {
        return (1..2).random()
    }

    fun flip(): String {
        if (flipNum() == 1) {
            return "Heads"
        } else {
            return "Tails"
        }
    }

}