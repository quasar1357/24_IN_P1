[Previous Chapter: Variables and Constants](./03_Variables_and_Constants.md) | [Back to overview](./00_Java_SyntaxGuide.md)

---
# Classes and Method Definitions

**GENERAL DISTINCTION: Class definition vs. object instantiation** (vs. variable declaration/assignment)

The class **definition** outlines the **blueprint**, while **instantiation** creates an **actual instance** (object) based on that blueprint. Multiple, distinct instances/objects of a single class may be built.

**Class structure**:

<img src="class_structure.png" alt="class_structure" width="350">


## Defining a Class

### Class head

1. **Visibility** modifier (and optionally other modifiers such as `abstract` or `final`): see below and chapters [13_Inheritance](13_Inheritance.md), [14_Interfaces](14_Interfaces.md) and [15_Polymorphism](15_Polymorphism_and_InhVsInt.md)
2. **`class`** (or other types such as [`interface`](14_Interfaces.md) or [`enum`](12_Enums.md)).
3. **Name** of the class
4. Optional info about its nature as extension/implementation:
    - `extends` for a [superclass](13_Inheritance.md) (only one superclass allowed)
    - `implements` for [interfaces](14_Interfaces.md) (comma-separated if multiple)

```java
// General structure:
aVisibility class AnyClassName { ... }

// Minimal class definition:
public class MyClass {
    ...
}

// Example with extensions and implementations:
public final class AnyClass extends ParentClass implements InterfOne, InterfTwo {
    ...
}
```

<div style="page-break-before: always;"></div>

### Defining Methods

**Head**:

1. **Visibility** modifier (and optionally other modifiers such as `static`, `abstract` or `final`); see below and [inher.](13_Inheritance.md), [interf.](14_Interfaces.md) and [polym.](15_Polymorphism_and_InhVsInt.md)
2. **Return type** OR `void` (when nothing is returned)
3. **Name** of the method
4. **Parameters**: inside `()` in form `type name`, multiples separated by `,`

```java
    aVisibility aType aMethodName(typeOne argOne, typeTwo argTwo){
        ...
    }
```
```java
    // Example:
    public int calcDouble(int num){
        ...
    }
```

**Parameter lists of variable length**
- We can give a **parameter list of variable length** to a method
- Using **`...` in front of a parameter name**, indicates that this variable can consist of an arbitrary number of elements
- It is then saved in form of **an array of the given type**, with **length inferred** by the number of elements passed (*see [Arrays](11_Arrays.md) for details*)
- We can only use **ONE such parameter**, and it has to be **passed as the last parameter**

```java
    // Example:
    public Band(String bandName, String ... members) {
        this.bandName = bandName; // simple String
        this.members = members; // string-array of variable length
    }
```

**Return**:
- Methods that declare a return type, must **return a value** of that type
```java
        return this.anyVar; // an instance variable
        return endResult; // a local variable
        ... // or any other expression (but only one value/object)
```
- If the method is declared as `void`, **no return value** is expected and the control is passed back to the caller after the method is executed
- However, the method can still **return prematurely** using `return;` (without a value)
```java
        return; // return without a value
```

### Visibility Modifiers
Variables, constants and methods can be defined with a specific **visibility** and its according modifier:
- **Private**: only visible within the class; private methods = **"support methods"**
- **Public**: also visible and accessible from other classes; public methods = **"service methods"**
- **Protected**: The variable is accessible within the same package and by subclasses (even if they're in a different package); especially useful for [inheritance](13_Inheritance.md)
- If no visibility modifier is specified, the **default is "package-private"**, meaning the variable is accessible within the same package.

<img src="visibility.png" alt="visibility" width="400">

<div style="page-break-before: always;"></div>

### Variables and Constants

**Local variables:**

- Variables (and constants) that are declared **inside a *method***
- Can **only** be used **within this method**
- Visibility cannot be changed
- IMPORTANT: **Passed parameters** are treated as local variables

**Instance variables/constants**

- Declared **inside a class but outside methods** (and not declared as "static", see below)
- They are **tied to an instance** (object) of that class
- Within the class, they are **available to all methods**
- To address an instance variable/constant of the current instance, the **`this.*` keyword** is used, e.g. `this.points = 3` (although `this` is technically optional if there is no ambiguity)
- NOTE: It is **possible to have instance variables and local variables with the same name**, in which case the local variable will be prioritised; in this case, the instance variable can/must be accessed using `this.*`

**Visibilities**

- **Variables** are typically defined as `private`, such that they are only available within the class (= "encapsulation")
- Using **public variables is not recommended**, as this violates the principle of encapsulation
- **Constants** (esp. `static` ones, see below) can be `private` or `public`, in which case they can be seen as a "service" to external sources

```java
public class AnyClass{

    // An instance variable, available to all methods of the class
    private int anInstanceVariable;

    public anyType anyMethod(aType anArg){
        string aLocalVariable; // A local variable, only available to the method
        this.anInstanceVariable = 100; // Use instance variable anywhere using this.*
        ...
    }
    ...
```

### The Static Modifier

- **Variables, constants and methods** can be declared **to belong to the class** itself, not to an instance
- In that case, they are declared/defined as `static` ...
- ... and can be used **without instantiating an object** (*see [Objects and Methods](05_Objects.md) and [Variable Types](06_Variable_Types.md) for details*).

For static variables (and constants), there is only **one instance of the variable for the whole class**, and it is shared among all objects/instances of this class. This can be useful for variables that are the same for all instances, such as a counter.

*Sidenote: static methods are somewhat similar to functions in other programming languages such as Python.*

```java
public class AnyClass{

    public static final int ANY_CONSTANT = 100; // A static, public constant
    private static int aCounter = 0; // A static variable; e.g. an instance counter

    public static anyType anyMethod(aType anArg){
        ... // Do something independently of any instances...
    }
    ...
```

### Method overloading
- In java, it is allowed to define **multiple methods with the same name, but different parameters** (number, type and/or order), which is called **method overloading**
- This is possible as just the **signature (= name & parameters) must be unique**
- In this case, java can **select the method based on the parameters** used in the method call


<div style="page-break-before: always;"></div>

## Special Methods

### Main Method
The main method contains commands that we want to be **executed** when running the program. It is mandatory for classes that are designed to be the entry point of a Java program.

```java
public class AnyClass{

    public static void main(String[] args){
        ...
    }
    ...
```

### Constructor Method(s)
- Is called when **a new instance is created**
- Its **name** is always the **same as the class**
- It contains **no return type** (also not void, as it implicitly returns the *address* of the instance).

IMPORTANT: There can be **multiple constructors** that differ in the **number/type of arguments** they take (= "method overloading", see above). At the instantiation of an object, the suited constructor is automatically chosen based on the input.

```java
public class AnyClass{
    ...
    public AnyClass(aType anArg){
        ... // Define the initial state of the object given an argument
    }
    public AnyClass(){
        ... // Define the initial state of the object given NO argument
        ... // (e.g. using default values)
    }
    ...
```

### Getters/Setters
- Since instance variables should typically be private, they cannot be accessed from the outside
- However, **controlled access** can be granted **through methods**
- **Setters** grant control as they typically check the input before assigning it to an instance variable, and may include validation or transformations before setting the value
- **Getters** are used to access the value of an instance variable, possibly transformed or checked before returning it

```java
public class AnyClass{
    ...
    public varType getVarOne(){
        ... // Could also be that the variable is transformed before...
        return varOne
    }
    ...
```
```java
public class AnyClass{
    ...
    public void setVarOne(aType anArg){
        ... // Usually check input first, and possibly modify it
        this.varOne = anArg;
    }
    ...
```

<div style="page-break-before: always;"></div>

### toString() Method
The `toString()` method overrides the default implementation from the Object class and **defines the string representation** of the object when printed or concatenated with strings.
```java
public class AnyClass{
    ...
    public String toString() {
        // any sort of string suited to describe the object
        return this.varOne + ": " + this.varTwo; 
}
```

### equals() and compareTo()

Be aware that comparing objects with **`==` tests for aliases** (variables pointing to the very same object).

However, objects should often be recognised as identical if certain properties are the same. **Implement the `equals()` method** for this comparison (default is also simply a test for aliases!).

The **`compareTo()`** method has a similar function. It should generally produce the output in a sense according to **"executing_object - argument_object"**, i.e. at least ensure to return:

- a **negative** integer value if the **executing object is smaller** than the object in the argument (in a defined way)
- a **positive** integer value if the executing object is **larger** in this way
- **0** if objects are **equal** (with regard to relevant properties)


## Importing Classes

Imports are done **before class definitions** (but after package definitions).

```java
package myPackage; // Package definition

// Examples for imports:
import java.util.Scanner; // import specific Class
import java.util.*; // import all Classes from a Package

public class AnyClass{
    ...
```

---

[Next Chapter: Objects and Methods](05_Objects.md) | [Back to overview](./00_Java_SyntaxGuide.md)
