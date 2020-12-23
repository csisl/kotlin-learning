# Classes in Kotlin

Notes from [kotlin docs](https://kotlinlang.org/docs/reference/classes.html) and as I 
fumble my way through the punch buggy game

## constructor

```
class MyClass constructor(name: String)
```

### initializer blocks

The constructor does not have any code or logic. If you want that, you must 
place the code inside of `initializer blocks` with the keyword `init`.

```
class MyClass {
    init {
        // logic
    }
}
```

You can use parameters passed to the constructor inside of initializer blocks...

```
class MyClass constructor(name: String) {
    init {
        println("hello, $name")
    }
}
```

... and as property initializers (instance fields). 

```
class MyClass constructor(name: String) {
    val currentName = name
}
```

A quick way to do that, and following Kotlin syntax would be to declare `currentName`
inside of the constructor:

```
class MyClass constructor(val currentName: String)
```

The `constructor` keyword is only required if the constructor has:
    * [visibility modifiers](https://kotlinlang.org/docs/reference/visibility-modifiers.html#constructors)
    * annotations 
    
## Inheritance 

To have a class be inheritable, user the keyword `open`.
To have a class inherit from a superclass, place the type
after the colon.

```
open class Base(x: Int)
class Derived(x: Int): Base(x) // inherits from Base
```

### overriding

Inside of the base class, you must declare a function or variable 
as `open` to make it overridable

```
open class MyClass() {
    open fun canOverride()
    fun cannotOverride()
}

class OtherClass(): MyClass {
    override fun canOverride() // must use the override keyword 
}
```

To prohibit re-overriding, use the `final` keyword:

```
final override fun canOverride()
```

You can also use the `override` keyword as part of the constructor:

```
interface Shape {
    val vertexCount: Int
}

class Rectangle(override val vertexCount: Int = 4) : Shape // Always has 4 vertices

class Polygon : Shape {
    override var vertexCount: Int = 0  // Can be set to any number later
}
```

