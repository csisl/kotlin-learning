# Punch Buggy

This I learned when working on the [Punch Buggy repo](https://github.com/csisl/PunchBuggy-Kotlin).  

## Game

### MutableList

To hold all of the players inside of a `Game`, I knew I needed to make a list of 
some type. In Java, I used an `ArrayList`. For Kotlin, I considered using an
`Array`, a `List`, and then eventually decided on a `MutableList`.  
  
So I made a private MutableList of type `Player`. To declare the list as empty
and not have a fixed size I set it equal to `mutableListOf()`. I saw this on
[Kotlin's documentation page](https://kotlinlang.org/docs/reference/classes.html).  

```
class Game {
    private var players: MutableList<Player> = mutableListOf()
}
```

The syntax is somewhat similar to Java, in that you can declare the type of 
list you are working with denoting `<Player>`.  

### iterable / forEach

Eventually I needed to loop through `players`. To do this, I used the built in 
`forEach` method. Note: do not use parentheses (Warning: Remove unnecessary
parentheses from function call with lambda).  

To access the current object in the loop use the keyword `it`. The function to
display the score looped through each player in the MutableList and called the 
function `displayTotalScore` for that player:

```
    fun displayScore() {
        players.forEach {
            println("*-------${it.username}---------*")
            println("${it.displayTotalScore()}")
            println("*------------------------------------*")
        }
    }
```

## Vehicle - abstract class

Vehicle is an abstract class (at least currently) declared with
`abstract class Vehicle`. Alternatively, you can use the keyword
[open](https://kotlinlang.org/docs/reference/classes.html#inheritance) to say that it's
open for inheritance.  

Initially, all of the methods in `Vehicle` were abstract and were being implemented inside
of the base class that was inheriting it. However, after going back over
the `open` keyword in Kotlin, I realized you can actually implement code inside of the
abstract class and then just have the subclass call those methods with that logic. `open`
provides the opportunity to override the method. I don't see myself changing the code
for incrementing the count of a vehicle so I put some code and logic into the `Vehicle`
class.  

### companion object

I needed a static member inside of the `Vehicle` object, so I made a companion object which
is described inside of the [til.md](https://github.com/csisl/kotlin-learning/blob/master/notes/til.md)
file in this repo. I should be able to see the available colors of a vehicle without needing
and instance of a vehicle. Inside of the companion object `Colors` is an array of strings,
each a possible color of the vehicle:

```
    companion object Colors {
        val colors: Array<String> = arrayOf("red", "orange", "yellow", "green", "blue",
            "purple", "pink", "black", "white", "silver")
    }
```

To get the colors array, I just need to call `Vehicle.colors`. Iterating through the array is
easy enough, following the same `forEach` logic metioned [above](###iterable-/-forEach).  


### Expression function

For functions that only return something in Kotlin, you can set that method equal to what
it should return. 

```
    fun getCount(): Int = count // the same as returning count 
```

## PunchBuggy - inherits from Vehicle

Initially, the punch buggy code had a lot of logic. There were methods that were
overriding the abstract methods that `Vehicle` defined. However, currently, it is
completely empty, just using the logic from the `Vehicle` superclass.  

## Player

A player can be made by passing a string to the constructor that is the username. Each
player has a `muatable list` of punch buggies and a `score` object. Pretty much everything
done in this class has been talked about above (mutable lists, forEach, constructors).  

