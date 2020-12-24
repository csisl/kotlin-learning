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

Initially, all of the methods in `Vehicle` were abstract. 

## Player - inherits from Vehicle

### Expression function