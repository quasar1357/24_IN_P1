[Previous Chapter: Inheritance](13_Inheritance.md) | [Back to overview](./00_Java_SyntaxGuide.md)

---

# Interfaces

- **Interfaces** are similar to abstract superclasses, but they can't have any implementation, only method headers
- They are used to define a **set of methods** that a class must implement, thereby **ensuring a certain behavior**
- To do so, they typically contain **abstract methods**, which are implemented by the class that implements the interface (*see chapter [13_Inheritance](./13_Inheritance.md) for details on abstract methods*)
- Methods in interfaces are by default `public` and `abstract`, and these **keywords can be omitted** when defining them in the interface.

## Defining interfaces

Interfaces are defined like classes but using the `interface` keyword (instead of class).

```java
    // Interface
    public interface TheInterfaceName {
        void aMethod();
    }

    // Example:
    public interface Shape {
        double getArea();
        void printArea();
        void doubleLength();
        ...
    }
```

## Default methods

- **Default methods** have a default implementation in the interface, which **can be overridden** by the implementing class
- They are defined using the `default` keyword

```java
    // Interface
    public interface TheInterface {
        public void aMethod(); // Normal, abstract method
        default void anotherMethod() { // Method with default
            // Default implementation
        }
    }

    // Example:
    public interface Shape {
        public double getArea(); // Normal, abstract method
        default void printArea() { // Default method
            System.out.println("The area is " + getArea());
        }
    }
```

<div style="page-break-before: always;"></div>

## Implementing interfaces
> ___
> **IMPORTANT**: A class can **implement multiple interfaces**, but only **extend one superclass**.
> ___

- Implementing an interface is done using the **`implements` keyword**
- **All methods of the interface must be implemented** in the class

```java
// The INTERFACE
public interface Buyable {
/**
* Returns the price of a purchasable object
*/
    // Defining that all Buyable objects must have a getPrice() method
    double getPrice(); 
}

// The CLASS
public class Book implements Buyable {
    private double price;
    public Book(double price) {
        this.price = price;
    }
        
    @Override
    // Implementation of the getPrice() method in the Book class
    public double getPrice() { 
        return price;
    }
}
```

If a class implements multiple interfaces, its instances can be **cast to any of the implemented interfaces**, taking on different roles, allowing for a form of **polymorphism**, (*see chapter [15_Polymorphism](./15_Polymorphism_and_InhVsInt.md)*).

```java
// Pasta can be used as Buyable or Cookable, depending on the context
public class Pasta implements Buyable, Cookable
```

On the other hand, an interface can be **implemented by multiple classes**, allowing for another type of **polymorphism** (*see chapter about [15_Polymorphism](./15_Polymorphism_and_InhVsInt.md)*). This allows interfaces to **make classes "interchangeable" in certain contexts**, as they share a common behavior.

```java
// Buyable can be implemented by multiple classes
public class Book implements Buyable
public class Pasta implements Buyable
```

*Sidenote: **Interfaces can extend other interfaces**, allowing for a hierarchy of interfaces.*

<div style="page-break-before: always;"></div>

## Interfaces of the java API

### Comparable

- The **`Comparable`** interface is used to define a **natural ordering** of objects
- It has one method, `compareTo()`, which compares the object to another object of the same type
- It **returns an integer**, which is negative if the object is smaller than the object in the argument, positive if it is larger, and zero if they are equal

```java
obj1.compareTo(obj2); // ~= obj1 - obj2
```

- The `compareTo()` method takes objects as arguments, and we can parameterize the interface using `<>` to specify the type of objects it can compare to

```java
// method compareTo now expects Pasta objects
public class Pasta implements Comparable<Pasta> 
```

- The `compareTo()` method is used in the static `Collections.sort()` method to sort objects.

### Iterator and Iterable

- The **`Iterator`** interface is used to iterate over a collection of objects.
- It has three methods: `hasNext()`, `next()`, and `remove()`.

```java
// Create a list and add some elements
List<String> list = new ArrayList<>();
list.add("A");
list.add("B");

// Create an iterator (as provided in the List interface)
Iterator<String> iter = list.iterator()
while (iter.hasNext()) { // Check if there is a next element
    String element = iter.next(); // Get the next element
    iter.remove(); // Remove the current element
}
```

- The **`Iterable`** interface is used to define a collection that can be iterated over
- It has one method, `iterator()`, which returns an `Iterator` object
- Iterables can therefore be used in a `for` (each) loop

```java
for (String element : list) {
    // Do something with the element
}
```

***NOTE: An Iterator defines methods used for the iteration, while an Iterable ensures to represent an object that provides an Iterator.***


---

[Next Chapter: Polymorphism](15_Polymorphism_and_InhVsInt.md) | [Back to overview](./00_Java_SyntaxGuide.md)