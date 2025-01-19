[Previous Chapter: Enums](12_Enums.md) | [Back to overview](./00_Java_SyntaxGuide.md)

---
# Inheritance

- **Inheritance** in Java allows a class (*subclass*) to **acquire properties and behaviors** (methods and variables) from another class (*superclass*), promoting code reuse and hierarchy
- A subclass is defined using the `extends` keyword, indicating it is **inheriting from** a specified superclass
- This relationship between the subclass and superclass is referred to as an **"is-a" relationship**, meaning the subclass is a *specific type* of the superclass
- The subclass **inherits all public and protected (= accessible inside package) methods, variables, and constants** of the superclass
- This enables the subclass **to use or override** them as needed

```java
public class TheSubclass extends TheSuperclass {
    ...
}

// Example (Dictionary is a specific type of Book):
public class Dictionary extends Book {
    ...
}
```

## Constructors

- To instantiate an object of a subclass, the **blueprint of its superclass is required** (besides the more specific one of the subclass)
- The **subclass constructor should always include `super()` in the first line** (or any version with arguments) to explicitly call the superclass constructor; the constructor of the subclass is responsible for calling the constructor of the superclass first
- If the `super()` statement is missing, Java will automatically call the *no-argument* constructor of the superclass
- If parameters are required, they must be explicitly specified in the explicit `super(...)` call

```java
    public TheSubclassConst(aType anArg, anotherType anotherArg) {
        // Call of the constructor of the superclass
        super(anArg);
        // Additional specification of the subclass object
        this.anInstanceVar = anotherArg;
    }

    // Example:
    public Dictionary(String title, int pages, int definitions) {
        super(title, pages);
        this.definitions = definitions;
    }
```


<div style="page-break-before: always;"></div>

## Overriding and `final` methods/classes

- **Methods that share the method head** of a method in the superclass will overwrite the inherited method
- The reference **`super.` can be used to access the superclass' definition** of methods and variables, allowing to simply extend on it
- **Methods** that are defined as `final` **can't be overwritten** by subclasses
- **Classes** that are defined as `final` **can not be used as superclasses** at all
- In java, all classes **finally originate from the `Object` class** (even if not explicitly stated), and inherit its methods, such as toString()
- The **`@Override` annotation** is used to indicate that a method is intended to override a method in the superclass (it is optional, but helps to track dependencies if the method in the superclass is changed)

IMPORTANT: Differentiate between **overloading** (same method name, different parameters) and **overriding** (same method name and parameters, but different level in the hierarchy)!

*Sidenote: overloading depends on the declared type at compile time, while overriding depends on the actual type at runtime)*


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

> ____________
> **IMPORTANT**: Java only allows **single inheritance**, meaning a class can only inherit from one superclass.
>_____________

- On the other hand, a **superclass can have multiple subclasses**
- To create a **hierarchy of classes**, multiple levels of inheritance can be used, creating a tree-like structure
- Inheritance is **"transient"**, meaning variables and methods are inherited **along a chain of super- and subclasses**; it goes only one way (from superclass to subclass) and methods/variables that one class inherited itself is passed on to its subclasses


## Abstract classes and methods

- **Abstract classes** can't be instantiated, but are used as a **blueprint for other classes** (~= defining its role but not its implementation)
- Abstract classes can have **abstract methods**: methods with no body, only a method head (but they can also have concrete methods)
- Since abstract classes can't be instantiated, their **constructors can't be (directly) called** and are optional (they are just called when a concrete subclass is instantiated); in some cases, they can be useful, especially to initialize variables
- Subclasses of an abstract class **must implement all abstract methods** of the superclass, unless they are abstract themselves
- Abstract methods are defined using the `abstract` keyword, and a `;` instead of a method body

```java
    // Abstract class
    public abstract class TheAbstractClass {
        // Abstract method
        public abstract void anAbstractMethod();
    }

    // Example:
    public abstract class Shape { // Abstract class
        public abstract double getArea(); // Abstract method
    }
```

---
[Next Chapter: Interfaces](14_Interfaces.md) | [Back to overview](./00_Java_SyntaxGuide.md)
