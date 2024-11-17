[Back to overview](./00_Java_SyntaxGuide.md)

---
# Inheritance

- **Inheritance** in Java allows a class (*subclass*) to **acquire properties and behaviors** (methods and variables) from another class (*superclass*), promoting code reuse and hierarchy.
- A subclass is defined using the `extends` keyword, indicating it is **inheriting from** a specified superclass.
- This relationship between the subclass and superclass is referred to as an **"is-a" relationship**, meaning the subclass is a *specific type* of the superclass.
- The subclass **inherits all public and protected (accessible inside package) methods, variables, and constants** of the superclass
- This enables the subclass **to use or override** them as needed.

```java
public class TheSubclass extends TheSuperclass
// Example:
public class Dictionary extends Book
```

## Constructors

- To instantiate an object of a subclass, besides the one of the subclass, also the **blueprint of its superclass is required**.
- The **constructor of the subclass** is responsible for **calling the constructor** of the superclass first.
- The **subclass constructor should always include super() in the first line** to explicitly call the superclass constructor.
- If this statement is missing, Java will automatically call the no-argument constructor of the superclass.
- If parameters are required, they must be explicitly specified in the explicit super() call.

```java
    public TheSubclassConstructor(aType anArg, anotherType anotherArg) {
        super(anArg); // Call of the constructor of the superclass
        this.anInstanceVar = anotherArg;
    }

    // Example:
    public Dictionary(String title, int pages, int definitions) {
        super(title, pages); // Call of the constructor of the superclass
        this.definitions = definitions;
    }
```


## Overwriting and `final` methods/classes

- **Methods that share the method head** of a method in the superclass will overwrite the inherited method.
- The reference `super.` can be used to **access the superclass' definition** of methods and variables, allowing to simply extend on it.
- **Methods** that are defined as `final` **can't be overwritten** by subclasses.
- **Classes** that are defined as `final` **can not be used as superclasses** at all.
- In java, all classes **finally originate from the `Object` class** (even if not explicitly stated), and inherit its methods, such as toString().
- The **`@Override` annotation** is used to indicate that a method is intended to override a method in the superclass (it is optional, but helps if the method in the superclass is changed).

```java
    // Overwriting a method
    @Override
    public void aMethod() {
        super.aMethod(); // Access the superclass' method (optional)
        // Additional code
    }

    // Example:
    @Override
    public void toString() {
        return super.toString() + " with " + definitions + " definitions";
    }
```


## Hierarchies

- Java only allows **single inheritance**, meaning a class can only inherit from one superclass.
- On the other hand, a **superclass can have multiple subclasses**.
- To create a **hierarchy of classes**, multiple levels of inheritance can be used, creating a tree-like structure.
- Inheritance is "transient", meaning variables and methods are inherited along a chain of super- and subclasses.


### Abstract classes and methods

- **Abstract classes** are classes that can't be instantiated, but are used as a **blueprint for other classes** (kind of defining its role but not its implementation).
- Abstract classes can have **abstract methods**, which are methods without a body, only a method head (but it can also have concrete methods).
- Since abstract classes can't be instantiated, their **constructors can't be called** and are optional (they are just used when a concrete subclass is instantiated).
- Subclasses of an abstract class must **implement all abstract methods** of the superclass, unless they are abstract themselves.
- Abstract methods are defined using the `abstract` keyword.

```java
    // Abstract class
    public abstract class TheAbstractClass {
        public abstract void anAbstractMethod();
    }

    // Example:
    public abstract class Shape {
        public abstract double getArea();
    }
```

## Polymorphism

- Polymorphism is the ability of an object to take on many forms, meaning that a **reference variable of a superclass can refer to an object of any subclass**.
- This allows for **flexibility** in the code, as the same method can be used for different objects, achieved through method overriding.

```java
    // Polymorphism
    TheSuperclass obj = new TheSubclass();
    obj.aMethod(); // Calls the method of the subclass

    // Example:
    Book book = new Dictionary(33);
    book.printTitle(); // Calls the method of the subclass

    // Example with arrays
    // Array for various beverage objects
    Beverage[] beverages = new Beverage[6];
    beverages[0] = new SoftDrink("Cola", 33, true);
    beverages[1] = new Wine("Bordeaux", 10, 0.168);
    beverages[2] = new Beer("Felsenau Junker", 33);
    Beverage beverage; // polymorphic variable
    // Output of all beverage objects
    System.out.println("All drinks:");
    for (int i = 0; i < beverages.length; i++){
        beverage = beverages[i]; // polymorphic assignment !!!
        System.out.println(beverage);
    }
```

---

[Back to overview](./00_Java_SyntaxGuide.md)
