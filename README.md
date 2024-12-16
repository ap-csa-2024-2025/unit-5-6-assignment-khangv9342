[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=17551739)
# unit-5-5-assignment

## Git Config
```
git config user.name "user"
git config user.email "email"
```

## Compiling and Running Java Programs
Note that since our classes are separate classes, you will need to compile ALL the files (at least one time).  You can do this by running
```
javac *.java
```
The star means to compile every file that is a Java file type.

Run your code by running
```
java Main.java
```

After you compile the shape classes, you only need to compile and run `Main.java` as usual.

# Instructions  

## In-Lesson

### Warm Up
Complete the `Dog` class by adding accessor and mutator methods (getters and setters).

### In-Lesson Activity 1
Add functionality to the `Student` class by adding constructors.  Make at least 3 constructors (one of them must be the default constructor).

### In-Lesson Activity 2
Add functionality to the `Student` class by adding accessor and mutator methods.  Practice using the `this` keyword.

## Classwork - The Plane Class
Create a class named `Plane` that simulates a plane moving up and down along 4000 feet in altitude.

Your class will build a plane and keep track of its location in the air. Location values may range from -2000 to 2000. A location value of 0 represents 0 feet, a location value of 100 represents 100 feet, a location value of 200 represents 200 feet, etc. The value of 0 just means the starting position, not actually 0 feet from sea level. If the user tries to move the plane beyond +2000 or -2000, set the location to +/- 2000 respectively.

### Variables
* `int location` - An integer that holds the current block location of the plane in the sky, with possible values ranging from -2000 to 2000.

### Constructors
* `Plane()` - Sets location to 0.
* `Plane(int loc)` - If loc is between -2000 and 2000 inclusive, sets location to loc. Otherwise, sets location to 0.

### Methods
* `void upward()` - Moves the plane upward 100 feet. Do not let the user move past 2000 feet.
* `void downward()` - Moves the plane downward 100 feet. Do not let the user move past -2000 feet.
* `int getLocation()` - Returns an integer representing the location of the plane.
* `String toString()` - Returns a String representation showing the plane as an `@` character, with spaces to show its location. When the plane is at location -2000 the `@` character appears at the start of the String. When the plane is at a higher position, one space for each number from -2000 to the plane's current location appears before the @. For example, if the plane is at -1000 feet, the method will return `"          @"` (10 spaces then the `'@'`). If the plane is at 500 feet the method will return `"                         @"` (25 spaces then the `'@'`).

### Sample Run
```
					  @
Location: 0
Type "u" to move upwards, "d" to move downwards, "n" for new Plane, "q" to quit.
u
					  @
Location: 100
Type "u" to move upwards, "d" to move downwards, "n" for new Plane, "q" to quit.
n
Starting location for a new Plane?
-500
			   @
Location: -500
Type "u" to move upwards, "d" to move downwards, "n" for new Plane, "q" to quit.
d
			  @
Location: -600
Type "u" to move upwards, "d" to move downwards, "n" for new Plane, "q" to quit.
q
```

### Milestones
As this is a more substantial coding exercise than most of the ones you have seen so far, we have provided milestones for you to help you think about how to build your `Plane` class.

* **Milestone 1:** Write the class header for your `Plane` class, and add curly braces - you will write the rest of your code inside these braces. Write a header and curly braces for each constructor and method in the class. For the two methods which return values add "dummy returns" - for example return 0; for `getLocation` and return ""; for `toString`. You will delete these returns later, but they will allow you to compile your code and test it in the meantime - you should check this works before moving on.
* **Milestone 2:** Add a private member variable for the location at the start of your class. Write the code inside your constructor to set up this variable correctly. Change the return statement inside your `getLocation` method to return the location and use this to test your constructor class.
* **Milestone 3:** Add code to your upward and downward methods to change the location variable as described.
* **Milestone 4:** Add code to your `toString` method to print the `Plane` at its correct location. You will probably need to use a loop to add the correct amount of spaces before the "@" symbol representing the variable - remember you will need no spaces before the `Plane` when it is in position -2000, 20 spaces when it is in position 0, and 40 spaces when it is in position 2000.
  
