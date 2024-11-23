[Back to overview](./00_Java_SyntaxGuide.md)

---
# Objects and Methods

## Creating and Assigning Objects

- We can interpret the class of an object like its data type...
- BUT variables for objects are only **references** to the object (not the value itself)
- **Declare** variable of that Class --> no object yet
- **Instantiate** ("new") --> object created (calls constructor)
- **Assign** to variable --> points to that object
- **Reassign** --> points to **different object (= Aliases)**!
- **Change** object --> **all** variables pointing to it change!

---

**Create object = declare (left), instantiate (right) and assign (=)**:
![alt text](creating_objects.png)

```java
AnyClass anyObject = new AnyClass(anyParameters);
Circle circle1 = new Circle(40, 40, 10); // Ex.
```
---


## Using Methods and Constants

Call methods of an object: use **dot operator on the Object**

```java
anyObject.anyMethod(anyParameters); // ... of another object
circle1.setCenterX(100); // Ex.
```

Use a **static method** or access a **static constant**: apply the **dot operator on the Class**:

```java
AnyClass.anyMethod(anyParams); // ... static of another class
Quotes.printQuoteOfSteve(); // Ex. method that is pre-defined in the class "Quotes" but independent of an object
```
```java
AnyClass.ANY_CONSTANT; // using static constants (outside the class)
double circleCirc = circleDiam * Math.PI; // Using the pi constant from Math module
```

**Inside the class** itself, static methods and static constants (or variables) can be called/accessed without the dot operator, but it is still recommended to use the dot operator (of course on the class) for clarity:

```java
NameOfThisClass.anyMethod(anyParams); // ... static method of this class
anyMethod(anyParams); // ... static method of this class without using the dot operator
printQuoteOfSteve(); // Ex. method that is defined in this class (without the dot operator)
Person.globalCount++; // Using a static variable (inside the class Person but explicitly using the class name)
```

NOTE: There can also be **non-static constants** (declared outside methods, and can be public or private). They belong to an instance - and are therefore addressed by the dot operator on the object (from outside) or using `this.*` (inside the class) - and are set once, e.g. in the constructor. Like this, the constant can be set for the instance and then used for its lifetime.

```java
// Example:
class Car {
    private final int maxSpeed;
    
    public Car(int maxSpeedIn) {
        this.maxSpeed = maxSpeedIn; // Setting the constant to the input at the instantiation
    }
}
```

*For an overview over possible variable and constant types, see Chapter [Variable Types](06_Variable_Types.md).*


## Method overloading

- Method overloading is the case where multiple methods have the **same method name** but **different parameters** (number, type and/or order)
- In this case, the method is **selected based on the parameters** used in the method call
- The lowest possible (most specific) level of type is considered (e.g. `Mammal` is more specific than `Animal`)
- But if the variable is declared as a more general type (e.g. `Animal`), the method of the general type is called (if no casting is done)
*(- Sidenote: overloading depends on the declared type at compile time, while overriding depends on the actual type at runtime)*

```java
// TAKEN FROM WORKSHOP CHAPTER 9 (SEE THERE FOR MORE DETAILS)
    public static void main(String[] args) {
        for(Animal a : animals){
            if(a instanceof Mammal){ // since we want to use the overloaded method specific for mammals, we filter for mammal objects
                System.out.println("Without overloaded method (treating as an animal): ");
                displayInfo(a); // Since above, the object is defined as an animal, it will be treated as an animal by default
                System.out.println("With overloaded method (treating as a mammal): ");
                displayInfo((Mammal) a); // NOTE: we are casting the object to Mammal, so that the overloaded method is called
            }
        }
    }

    private static void displayInfo(Animal a){
        System.out.println(a);
        a.eat();
        a.move();
        if(a instanceof Mammal){
            ((Mammal) a).giveBirth();
        }

    }
    private static void displayInfo(Mammal m){ // Define the same method, but for mammals; this is called method overloading
        System.out.println(m);
        System.out.println("This is a mammal, and thus has fur!");
        m.eat();
        m.move();
        m.giveBirth();
    }
```


## Importing Classes

Imports are done **before class definitions**.
```java
// Examples:
import java.util.Scanner; // import specific Class
import java.util.*; // import all Classes from a Package
```

---

[Back to overview](./00_Java_SyntaxGuide.md)
