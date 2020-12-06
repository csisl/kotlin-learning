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
