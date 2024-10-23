# Generics
[Back to overview](./00_Java_SyntaxGuide)

A class can be defined in a way that it **can use objects of multiple types**. For this, it uses a "formal type variable/parameter" (e.g. T). When an object is instatiated, it has to be declared for a certain type through an "type argument" (e.g. <int>). In that object, **any occurence of the formal type variable is then replaced by that type argument**. Generics provide type safety by ensuring that the type used is consistent at compile time.

```java
public class MyGenericClass<T> {
    private T aVar; // Define a variable that can be of various types
    public MyGenericClass(T anyArg) { // constructor
    this.aVar = anyArg; // Set this variable (given an input of the chose type)
    }
    public void setVar(T anyArg) {
        this.aVar = anyArg; // Setter
    }
    ...
}

// Outside, instantiation:
MyGenericClass<aType> objectName = new MyGenericClass<aType>(anyArg);
```

Example:
```java
public class Rocket<T> { // A rocket that can transport different things
    private T cargo; // Instance variabel
    public Rocket(T cargo) { // Constructor
        this.cargo = cargo;
    }

    public void set(T cargo) { // Setter
        this.cargo = cargo;
    }

    public T getCargo() { // Getter
        return this.cargo;
    }
}

// Outside:
Rocket<Dog> dogRocket = new Rocket<Dog>();
Rocket<Human> humanRocket = new Rocket<Human>();
```

![generics](generics.png)

---

[Back to overview](./00_Java_SyntaxGuide)
