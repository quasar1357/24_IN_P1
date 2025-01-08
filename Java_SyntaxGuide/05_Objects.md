[Back to overview](./00_Java_SyntaxGuide.md)

---
# Objects and Method Calls

## Creating and Assigning Objects

- We can interpret the class of an object like its data type...
- BUT variables for objects are only **references** to the object (not the value itself)
- **Declare** variable of that Class --> no object yet
- **Instantiate** ("new") --> object created (calls constructor)
- **Assign** to variable --> points to that object
- **Reassign** --> points to **different object (= Aliases)**!
- **Change** object --> **all** variables pointing to it change!

---

### **Create object variable = declare (left), instantiate (right) and assign (=)**:

<img src="creating_objects.png" alt="creating objects" width="700">


```java
AnyClass anyObject = new AnyClass(anyParameters);

// Example:
Circle circle1 = new Circle(40, 40, 10);
```
---


<div style="page-break-before: always;"></div>

## Using Methods and Constants

Call methods of an object: use **dot operator on the Object**

```java
anyObject.anyMethod(anyParameters);

// Example:
circle1.setCenterX(100);
```

Use a **static method** or access a **static constant**: apply the **dot operator on the Class**:

```java
AnyClass.anyMethod(anyParams); // ... static of a class

// Ex. method that is pre-defined in the class "Quotes" but independent of an object
Quotes.printQuoteOfSteve();
```
```java
AnyClass.ANY_CONSTANT; // using static constants (outside the class)

// Example: Using the pi constant from Math module
double circleCirc = circleDiam * Math.PI;
```

**Inside the class** itself, static methods and static constants (or variables) can be called/accessed without the dot operator, but it is still recommended to use the dot operator on the class for clarity:

```java
NameOfThisClass.anyMethod(anyParams); // ... static method of this class
anyMethod(anyParams); // ... static method of this class without using the dot operator

// Examples:

 // Method that is defined in this class (called without the dot operator)
printQuoteOfSteve();

// Using a static variable (inside the class Person itself
// but explicitly using the class name and dot operator)
Person.globalCount++;
```

NOTE: There can also be **instance constants** (declared as non-static, but outside methods; public or private). They belong to an instance - and are therefore addressed by the dot operator on the object (from outside) or using `this.*` (inside the class) - and are set once, e.g. in the constructor. Like this, the constant can be set for the instance and then used for its lifetime.

```java
// Example:
class Car {
    private final int maxSpeed;
    
    public Car(int maxSpeedIn) {
        // Setting the constant to the input at the instantiation
        this.maxSpeed = maxSpeedIn;
    }
}
```

*For an overview over possible variable and constant types, see Chapter [Variable Types](06_Variable_Types.md).*


<div style="page-break-before: always;"></div>

## Using overloaded methods

- When calling an overloaded method, the **most specific matching type** is chosen based on the compile-time type of the argument (e.g., `Mammal` is more specific than `Animal`)
- If the variable is declared as a more general type (e.g., `Animal`), the method corresponding to that general type is called unless explicitly cast

IMPORTANT: Differentiate between **overloading** (same method name, different parameters) and **overriding** (same method name and parameters, but different level in the hierarchy, used in [inheritance](13_Inheritance.md) and [interfaces](14_Interfaces.md)).

*Sidenote: overloading depends on the declared type at compile time, while overriding depends on the actual type at runtime)*

```java
// TAKEN FROM WORKSHOP CHAPTER 9 (SEE THERE FOR MORE DETAILS)

public static void main(String[] args) {
    for(Animal a : animals){ // iterating over animals as type Animal

        // since we want to use the overloaded method specific for mammals,
        // we filter for mammal objects
        if(a instanceof Mammal){

            System.out.println("Without overloaded method (treating as an animal): ");
            // Above, the object is defined as an animal
            // -> treated as an animal by default
            displayInfo(a);

            System.out.println("With overloaded method (treating as a mammal): ");
            // CASTING the object to Mammal
            // -> OVERLOADED method is called
            displayInfo((Mammal) a);
        }
    }
}

// Define a method that takes an ANIMAL and displays information about it
private static void displayInfo(Animal a){
    System.out.println(a);
    a.eat();
    a.move();
    if(a instanceof Mammal){
        ((Mammal) a).giveBirth();
    }

}

// Define the same method, but for MAMMALS; this is called method overloading
private static void displayInfo(Mammal m){
    System.out.println(m);
    System.out.println("This is a mammal, and thus has fur!");
    m.eat();
    m.move();
    m.giveBirth();
}
```


---

[Back to overview](./00_Java_SyntaxGuide.md)
