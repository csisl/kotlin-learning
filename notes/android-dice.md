# Android Dice App

Notes from the android app tutorial when we were making the dice roll app

## Activities

Activity: a window of the android UI 

### MainActivity 

MainActivity: the main view that is loaded when the app starts

There can be multiple activities for different views. For example, the main
page of instagram would be MainActivity and then the explore page would
be a different activity.  

### onCreate()

Instead of calling a main() function, the Android system calls the onCreate()
method of your MainActivity when your app is opened for the first time.  

Every app's MainActivty file has the following code in it to start it.  

```
package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

   override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_main)
   }
}
```

### Enable auto imports


In Android Studio, open the settings by going to File > New Project Settings > Preferences
for New Projects. Expand Other Settings > Auto Import. In the Java and Kotlin sections,
make sure Add unambiguous imports on the fly and Optimize imports on the fly (for current project)
are checked. Note that there are two checkboxes in each section. The unambiguous imports settings
tell Android Studio to automatically add an import statement, as long as it can determine which
one to use. The optimize imports settings tell Android Studio to remove any imports that aren't
being used by your code. Save the changes and close settings by pressing OK.

## Buttons

To have the button do something when clicked, first you have to save
a reference to that button. In my case, I'm making a `ImageButton`
instead of a normal `Button` like in the android tutorial series. To register 
the button:

```
val rollButton: ImageButton = findViewById(R.id.diceButton)

```

diceButton is the ID I gave my button in the activity view.  

rollButton now has a reference to the ImageButton object.

Next, have the button perform some action `on click`. To do this, we can
set a listener, waiting for the button to be clicked.

```
rollButton.setOnClickListener {
}
```

Now, when it's clicked, make it show some text:

```
val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
toast.show()
```

### update the text view 

First, get the ID of the text view from `activty_main.xml`. In my case, it's
`rollResult`.  

Now, we need to get that `TextView` with the `R.id.rollResult`.  


Imports at this point:

```
import android.widget.ImageButton
import android.widget.Toast
import android.widget.TextView
```


