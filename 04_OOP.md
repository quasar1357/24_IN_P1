# OOP: Classes, Objects & Methods
**NOTE**: Class definition vs. object instantiation (vs. variable assignment)

## Classes & Method Definitions

**Constructor** method: called when new instance created, name always same as class, no data type (as it returns address of instance)

- Variables inside classes: private/instance and public/constants
- Visibility
- Data Type (special case constructor; void as "return nothing")
- Static... --> called on Class !
- Getter/Setter

```java
public class ArbitraryClass{
    ...
    public static void arbitraryMethod(arbitraryArguments){
        ...
    }
    ...
    public static void main(String[] args){
        ... // The main method is mandatory if we want the program to run...
    }
}
```

## Objects & Method Calls

### Create Objects from Classes

- Can interpret class of an object like its data type...
- BUT variables for objects are only **references** to the object (not the value itself)
- **Declare** variable of that Class --> no object yet
- **Instantiate** ("new") --> object created (calls constructor)
- **Assign** to variable --> points to that object
- **Reassign** --> points to **different object (= Aliases)**!
- **Change** object --> **all** variables pointing to it change!

---

**Create object - declare (left), instantiate (right) and assign (=)**:
![alt text](creating_objects.png)

```java
ArbitraryClass arbitraryObject = new ArbitraryClass(arbitraryParameters);
Circle circle1 = new Circle(40, 40, 10); // Ex.
```
---
### Call Methods on Objects

Call methods of an object: use **dot**

```java
arbitraryObject.arbitraryMethod(arbitraryParameters); // ... of another object
circle1.setCenterX(100); // Ex.
```

Call methods inside class itself:
```java
arbitraryMethod(arbitraryParameters);
printQuoteOfSteve(); // Ex. method that is defined in this class
```

### Import Classes

```java
// Examples:
import java.util.Scanner; // import specific Class
import java.util.*; // import all Classes from a Package
```

## Generics