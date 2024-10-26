[Back to overview](./00_Java_SyntaxGuide.md)

---
# Classes

**GENERAL DISTINCTION: Class definition vs. object instantiation** (vs. variable declaration/assignment)

The class definition outlines the blueprint, while instantiation creates an actual instance (object) based on that blueprint. Multiple, distinct instances/objects of a single class may be built.

**Class structure**:

![class_structure](class_structure.png)

## Defining a Class

### Class head
`aVisibility class AnyClassName { ... }`
```java
public class MyClass {
    ...
}
```

### Defining Methods

**Head**:

1. **Visibility** modifier (and optionally other modifiers such as `static`); see below
2. **Data type** that is returned; OR `void` when nothing is returned
3. **Name** of the method

```java
aVisibility aType aMethodName(aType anArg){
        ...
    }
```
```java
public class AnyClass{
    ...
    public int calcDouble(int num){
        ...
    }
}
```

**Return**:
```java
return this.anyVar; // an instance variable

return endResult; // a local variable

... // or any other expression (but only one value/object)
```

### Visibility Modifiers
Variables, constants and methods can be defined with a specific **visibility** and its according modifier:
- **Private**: only visible within the class; private methods = **"support methods"**
- **Public**: also visible and accessible from other classes; public methods = **"service methods"**
- **Protected**: The variable is accessible within the same package and by subclasses (even if they're in a different package)
- If no visibility modifier is specified, the default is "package-private", meaning the variable is accessible within the same package.

![visibility](visibility.png)

### Variables and Constants
Variables and constants that are declared inside a method, are called **local variables/constants**, and can only be used within this method. Their visibility cannot be changed.

Variables and constants that are declared inside a class but outside methods (and are not declared as "static", see below) are called **instance variables/constants** as they are tied to an instance (object) of that class. Within the class, they are available to all methods of the class. To address an instance variable/constant of the current instance, the **`this.*` keyword** is used, e.g.: `this.points = 3`.

**Variables** are typically defined as `private`, such that they are only available within the class. Using **public variables is not recommended**, as this violates the principle of encapsulation. **Constants** can be `private` or `public`, in which case they can be seen as a "service" to external sources.

```java
public class AnyClass{
    ...
    private int anInstanceVariable; // An instance variable
    ...
    public anyType anyMethod(aType anArg){
        string aLocalVariable; // A local variable, only available to the method
        this.anInstanceVariable = 100; // Use instance variable anywhere using this.*
        ...
    }
    ...
}
```

### The Static Modifier
Variables, constants and methods can be declared to belong to the class itself, not to any instance. In that case, they are declared/defined as `static` and can be used **without instantiating an object** (*see [Objects and Methods](05_Objects_and_Methods.md) and [Variable Types](06_Variable_Types.md) for details*). 

Sidenote: static methods are somewhat similar to functions in other programming languages such as Python.

```java
public class AnyClass{
    ...
    public static final int ANY_CONSTANT = 100; // A static, public constant
    ...
    public static anyType anyMethod(aType anArg){
        ... // Do something independently of any instances...
    }
    ...
}
```

## Special Methods

### Main Method
The main method contains commands that we want to be **executed** when running the program. It is mandatory for classes that are designed to be the entry point of a Java program.
```java
public class AnyClass{
    ...
    public static void main(String[] args){
        ...
    }
    ...
}
```

### Constructor Method
Is called when **a new instance is created**. Its name is always the same as the class. It contains no return type (also not void, as it returns the address of the instance).

IMPORTANT: There can be **multiple constructors** that differ in the **number/type of arguments** they take. At the instantiation of an object, the suited constructor is automatically chosen based on the input.

```java
public class AnyClass{
    ...
    public AnyClass(aType anArg){
        ... // Define the initial state of the object given an argument
    }
    public AnyClass(){
    ... // Define the initial state of the object given NO argument (e.g. using default values)
}
```

### Getters/Setters
Since instance variables should typically be private, they cannot be accessed from the outside. However, **controlled access** can be granted through methods. Setters grant control as they typically check the input before assigning it to an instance variable, and may include validation or transformations before setting the value.
```java
public class AnyClass{
    ...
    public varType getAnyVar(){
        return anyVar // Could also be that the variable is transformed before...
    }
    ...
}
```
```java
public class AnyClass{
    ...
    public void setAnyVar(aType anArg){
        ... // Usually check input first, and possibly modify it
        this.anyVar = anArg;
    }
    ...
}
```

### toString() Method
The `toString()` method overrides the default implementation from the Object class and **defines the string representation** of the object when printed or concatenated with strings.
```java
public class AnyClass{
    ...
    public String toString() {
        return this.varOne + ": " + this.varTwo; // or any sort of string describing the object
}
```
### equals() and compareTo()

Be careful when comparing objects with `==`, this tests for aliases (pointing to the same object).

However, objects should often be recognised as identical if certain properties are the same. Implement the `equals()` method for this comparison (default is also simply test for aliases!).

The `compareTo()` method has a similar function. It should generally produce the output of "executing_object minus argument_object" :
- Negative integer value if the executing object is smaller than the object in the argument (in a defined way)
- Positive integer value if the executing object is larger in this way
- 0 if objects are equal (with regard to relevant properties)


---

[Back to overview](./00_Java_SyntaxGuide.md)
