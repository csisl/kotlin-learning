# Today I learned

Things I learned as I work on the daily Kotlin training.
I am using [hyperskill.org](https://hyperskill.org/curriculum)

## November

### for loops

For loops are similar to Python.
```
for (i in 0..10) {
```

Loop through an iterable object:
```
for (someObj in myObject) {
```

### functions

```
fun example(someArg: String) {
```

to have the function return a type:

```
fun example(someArg: String): String {
```

### explicit types

Instead of `val someInt = 10` you can do `val someInt: Int = 10`.

Think of it like you're talking to someone. You wouldn't say
"This int value," you'd likely say "This value is an int."

Also capitalize the type.
* String
* Int
* Double
* Boolean
and so on...

## Dec 6, 2020

### Ranges

Similar to using ranges for `for` loops, you can use them
to see if a value is within a certain range
```
val isWithin = c in a..b
```

You can also use ranges of characters according to dictionary order
```
println("android" in "an".."az") // true
```

### for loops (cont)

Keywords to add to `for` loops:

```
for (i in 1 <keyword> 10) {
```

* `downTo`: iterate backwards
    `for (i in 4 downTo 1) // 4 3 2 1`
* `until`: exclude the upper limit of a range 
    `for (i in 1 until 4) // stops on 3`
* `step`: instead of incrementing by 1 each time, increment by `step`
    `for (i in 1..7 step 2) // 1 3 5 7`

mix them up: `for (i in 7 downTo 1 step 2) // 7 5 3 1`

## Dec 21, 2020 - Part of Android tutorial series

### IntRange 

...and calling object methods.

In following the [Android tutorial series](https://developer.android.com/courses) we started
to make a dice that will roll a random button. In the playground, I thought of making a 
Dice class with a range of 1 to 6 and a roll function that returns a random number in that range.

```
fun main() {
    val die = Dice()
    val num = die.roll()
    println(num)
}

class Dice() {
    val range = 1..6 // type: IntRange
    fun roll(): Int {
        return range.random() // can call ``random method from IntRange
    }
}
```

This also led me somehow down the rabbit hole to...

### Companion objects

I don't know how I got here, but I learned about [companion objects](https://blog.mindorks.com/companion-object-in-kotlin).
Basically, instead of having the `static` keyword for a method, like in Java, you use
something called a `companion` object.

```
class CompanionTest() {
    companion object CompanionBuddy {
        fun sayHi() {
            println("Hello from companion buddy!")
        }
    }
    fun needsInstance() {
        // you need an instance to run me, though
    }
}
// Call sayHi without instantiating the object `Companion Test`
CompanionTest.sayHi
val compInstance = CompanionTest()
compInstance.needsInstance() 
```

`CompanionBuddy` does not require an instance of `CompanionTest`
`needsInstance` *does* require an instance of `CompanionTest`

## Dec 23 - classes

A lot to learn about classes inside of the [classes.md](classes.md)

As I learn, I'm making the [Punch Buggy game](https://github.com/csisl/PunchBuggy-Kotlin)

### ? 

The elusive question mark...

## Dec 31 

### when 

You can use `when` like a `switch` statement.

```
when (age) {
    18 -> println("Voting age!")
}
```