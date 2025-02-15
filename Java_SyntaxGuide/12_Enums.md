[Previous Chapter: Arrays](11_Arrays.md) | [Back to overview](./00_Java_SyntaxGuide.md)

---
# Enum Types

Enum types are **similar to classes**. However, they allow **only a selection of identifiers ("versions") of objects**, thus providing **type safety**.


## Defining enums

- **Identifiers/versions are listed as first thing** in the definition, delimited by `,`
- Thereby they automatically:
    - call the constructor
    - instantiate objects of this enum type and
    - assign them to static variables named as this version

NOTE: The **constructor** of an enum type must be **private**, as it is called above and not from outside. It also does **not take any arguments** besides the ones defined in the enum type definition, as the versions are pre-defined.

```java
public enum AnEnumName {

    // Identifiers: call constructor, instantiate objects, assign to static variables !!!
    VersionOne(valOneForVar), VersionTwo(valTwoForVar), VersionThree(valThreeForVar);

    // instance variable for the objects
    private typeOfVar var;

    // Constructor; must be private, as it is called above and not from outside !!!
    private AnEnumName(typeOfVar argIn) {

        this.var = argIn // Assigning the argument to the instance variable !!!

    }
    ...
```

Identifiers/versions that do not need further specification can be defined in a more **simple way**:

```java
public enum AnEnumName {
    // Note, the semicolon is not needed here (but can be added...)
    VersionOne, VersionTwo, VersionThree 
    // BUT: if you add any more code, the semicolon is needed!
}
```

<div style="page-break-before: always;"></div>

## Using enums

### Instantiating enums

To instantiate an enum object, we just use the `.` operator and **version name on the enum type** (like a static variable):

```java
AnEnumName myEnum = AnEnumName.VersionOne;
```

Remember: enums are built directly as a pre-defined version of the enum type, so they are already instantiated and **do not take any arguments**.


### Methods of enum Objects and of the Enum Class

Enums can have methods and variables, just like classes, and of course these methods may also access and change the values of the variables.

**Enum objects** automatically have the methods and variables defined in the Enum type:

- String `name()`: Returns the **identifier** of the enum object as a string (for example ‘Goalkeeper’)
- int `ordinal()`: Returns the **position** of the enum object within the enumeration

The **Enum class** itself has the following (`static`) methods:

- static E `valueOf(`String `s)`: Returns **object** of enum type E from the enumeration **whose identifier matches s**
- static E[] `values()`: Returns **all objects** of this enumeration **in an array**


<div style="page-break-before: always;"></div>

## Sidenote: mixing enums and classes

To create objects that have both **fixed but also dynamic properties**, we can mix enums and classes. For example, we can define an `enum` where each type has a fixed value for `variableA`, but when creating an instance of the associated `class`, we can allow for `variableB` to be set dynamically:

- Define an `enum` that holds the fixed value for `variableA`.
- Create a `class` that takes an enum constant and a dynamic value for `variableB`.


```java
// Step 1: Define the enum with fixed values for variableA
public enum ConfigType {
    SMALL(10),
    MEDIUM(20),
    LARGE(30);

    private final int variableA;

    ConfigType(int variableA) {
        this.variableA = variableA;
    }

    public int getVariableA() {
        return variableA;
    }
}

// Step 2: Define a class that accepts ConfigType and a dynamic value for variableB
public class Config {
    private final ConfigType configType;
    private final int variableA; // Fixed based on enum
    private int variableB; // Adjustable

    // Constructor uses ConfigType for variableA and accepts dynamic variableB
    public Config(ConfigType configType, int variableB) {
        this.configType = configType;
        this.variableA = configType.getVariableA(); // Fixed based on enum
        this.variableB = variableB; // Dynamic
    }
    // Allow variableB to be adjusted
    public void setVariableB(int variableB) {
        this.variableB = variableB;
    }
    
    ...

}
```

We could then later use this class as follows:

```java
// Create a Config instance of type SMALL, with variableB set to 50
Config config = new Config(ConfigType.SMALL, 50);
// Adjust variableB if needed
config.setVariableB(60);
```

**Explanation**

- `ConfigType` enum defines pre-set values for `variableA`.
- `Config` class allows you to instantiate with a `ConfigType`, which sets `variableA` automatically, and allows `variableB` to be set independently.
- This way, `variableA` is always tied to the `ConfigType`, while `variableB` can vary per instance.

---
[Next Chapter: Inheritance](13_Inheritance.md) | [Back to overview](./00_Java_SyntaxGuide.md)
