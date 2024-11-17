[Back to overview](./00_Java_SyntaxGuide.md)

---

# Interfaces

- **Interfaces** are similar to abstract classes, but they can't have any implementation, only method headers.
- They are used to define a **set of methods** that a class must implement, thereby **ensuring a certain behavior**.
- A class can **implement multiple interfaces**, but only **extend one superclass**.


## Defining interfaces

- Interfaces are defined using the `interface` keyword.

```java
    // Interface
    public interface TheInterface {
        public void aMethod();
    }

    // Example:
    public interface Shape {
        public double getArea();
    }
```


## Implementing interfaces

- **Implementing an interface** is done using the `implements` keyword, and all methods of the interface must be implemented in the class.

```java
// The INTERFACE
public interface Buyable {
/**
* Returns the price of a purchasable object
*/
double getPrice(); // Defining that all Buyable objects must have a getPrice() method
}

// The CLASS
public class Book implements Buyable {
    private double price;
    public Book(double price) {
        this.price = price;
    }
        
    @Override
    public double getPrice() { // Implementation of the getPrice() method in the Book class
        return price;
    }
}
```

- If a class implements multiple interfaces, its instances can be **cast to any of the implemented interfaces**, taking on different roles.

```java
public class Pasta implements Buyable, Cookable
```

- On the other hand, an interface can be implemented by multiple classes, allowing for **polymorphism** (as seen for class [Inheritance](./13_Inheritance.md)).
- This allows interfaces to **make classes "interchangeable" in certain contexts**, as they share a common behavior.

- Sidenote: **Interfaces can extend other interfaces**, allowing for a hierarchy of interfaces.


## Default methods

- **Default methods** are methods that have a default implementation in the interface, which can be overridden by the implementing class.
- They are defined using the `default` keyword.

```java
    // Interface
    public interface TheInterface {
        public void aMethod();
        default void anotherMethod() {
            // Default implementation
        }
    }

    // Example:
    public interface Shape {
        public double getArea();
        default void printArea() {
            System.out.println("The area is " + getArea());
        }
    }
```

## Interfaces of the java API

### Comparable

- The `Comparable` interface is used to define a **natural ordering** of objects.
- It has one method, `compareTo()`, which compares the object to another object of the same type.
- It returns an integer, which is negative if the object is smaller than the object in the argument, positive if it is larger, and zero if they are equal.

```java
obj1.compareTo(obj2); // ~= obj1 - obj2
```

- `compareTo()` takes objects as arguments, and we can parameterize the interface using `<>` to specify the type of objects it can compare.

```java
public class Pasta implements Comparable<Pasta> // method compareTo noe expects Pasta objects
```

- The `compareTo()` method is used in the static `Collections.sort()` method to sort objects.

### Iterator and Iterable

- The `Iterator` interface is used to iterate over a collection of objects.
- It has three methods: `hasNext()`, `next()`, and `remove()`.

```java
List<String> list = new ArrayList<>();
// Add elements to the list
list.add("A");
list.add("B");
Iterator<String> iter = list.iterator(); // Create an iterator (as provided in the List interface)
while (iter.hasNext()) {
    String element = iter.next(); // Get the next element
    iter.remove(); // Remove the current element
}
```

- The `Iterable` interface is used to define a collection that can be iterated over.
- It has one method, `iterator()`, which returns an `Iterator` object.
- Iterables can therefore be used in a `for` (each) loop.

```java
for (String element : list) {
    // Do something with the element
}
```

***NOTE: An Iterator defines methods used for the iteration, while an Iterable ensures to represent an object that provides an Iterator.***


---

[Back to overview](./00_Java_SyntaxGuide.md)
