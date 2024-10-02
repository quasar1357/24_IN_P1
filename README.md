# Programmierung 1 - UniBern 2024

This is the repository of *Roman Schwob* for "Programmierung 1" of the Bachelor in "Informatik" at the University of Bern.

In the second part of the readme below is a *Syntax Guide for Java* that I create based on the script used in the lecture. The *folders* in the repository contain my solutions to the exercise series.

If you have any questions or suggestions, please contact me through GitHub.


# Java Syntax Guide

## Comments:
```java
// comment on one line
```
```java
/*
comment until ended with
*/
```
```java
/**
* automatic generation of documentation
*/
```
## Variables and Constants

**Variables**:
```java
int arbitraryVariable; // declared
arbitraryVariable = 100; // assigned value
// OR
int arbitraryVariable = 100; declare and assign
```
```java
int variableOne, variabelTwo, ... ; // declare multiple at once
// OR
int variableOne = 100, variableTwo; // declare both, assign one
```

**Constants**:
```java
final int ARBITRARY_CONSTANT = 500;
```

## Simple Input and Output

### Output
```java
System.out.println("arbitrary text") // prints with trailing line break
System.out.print("arbtrary text") // prints without line break
// NOTE: System.out = Objekt; repräsentiert Ausgabegerät
```

### Input (more details, see Scanner class below)
```java
import java.util.Scanner;
...
    Scanner scan = new Scanner(System.in);
    String arbitraryStringVar = scan.nextLine();
    String arbitraryIntVar = scan.nextInt();
    String arbitraryDoubleVar = scan.nextDouble();
    ...
```


## Conventions

Examples:
- classes: StudentActivity
- variables: currentSpeed
- methods: getCurrentSpeed
- constants: MAX_SPEED

## Primitive Data Types

### 1) Numbers

- (byte: -128 - 127)
- (short: -32'768 - 32767)
- **int: −2'147'483'648, +2'147'483'647**
- (long ≈ ±9 × 10 18)
- (float ≈ ±3.4 × 10 38)
- **double ≈ ±1.7 × 10 308**


**Convert "up"** (e.g. int to double): no problem
```java
int count = 17;
double num = count; // will be 17.0
```

**Convert "down"** (e.g. double to int): would give err --> need **cast operation**
```java
int count = (int) num; // cast num into int, then assignment works
```

**Operations**:
- +, -, *, / as usual (also priority)
- modulo= %; priority as *and /, also on floats/doubles...
- division: two ints --> int; else --> float/double...
- ++ and -- --> + and - 1; e.g. arbVar++
- += etc.; e.g. arbVar += 10

### 2) Characters (& the String Class)

a **single** character, declared within single quotes
```java
char arbitraryChar = 'a';
```

Note: **string is NOT a primitive data type**, but a class!

However, it is an exception in that it can be created without "new" command:
```java
String arbitraryString = "arbitrary text"
```
*Details about strings, see below (API classes)*

### 3) Booleans

Only possible values: **true** or **false**
```java
boolean arbitraryBool = false;
```

**Create and combine booleans**:
- Relational Operators: ==, !=, <, >, <=, >=
- AND: && ; OR: ||; NOT: ! (e.g. !a)
- Priorities: 1. NOT, 2. AND, 3. OR

**Simple Conditions**

Simple **if**:
```java
if (arbBool)
    ... // single line!

// OR

if (arbBool{
    ... // multiple lines!
    ... // multiple lines!
}
```

If with **else**:
```java
if (arbBool)
    ...
else
    ...

// OR

if (arbBool){
    ...
    ...
} else {
    ...
    ...
}
```

## Objects and Methods

**NOTE**: Class definition vs. object instantiation (vs. variable assignment)

### Class & Methods **Definition**
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

### Class **Use**: Create Objects

- Can interpret class of an object like its data type...
- BUT variables for objects are only **references** to the object (not the value itself)
- **Declare** variable of that Class --> no object yet
- **Instantiate** ("new") --> object created (calls constructor)
- **Assign** to variable --> points to that object
- **Reassign --> points to different object (= Aliases)!**
- **Change object --> all variables pointing to it change!**

---

**Create object - declare (left), instantiate (right) and assign (=)**:
![alt text](creating_objects.png)

```java
ArbitraryClass arbitraryObject = new ArbitraryClass(arbitraryParameters);
Circle circle1 = new Circle(40, 40, 10); // Ex.
```
---
### Objects **Use**: Call Methods

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


## Using Java API classes

### 1) Strings

Note: string is **NOT a primitive data type**, but a class!

However, it is an exception in that it can be created without "new" command:
```java
String arbitraryString = "arbitrary text"
```

**Escape** symbol: \\, especially \\" for an actual double quote

Shortcut for **concatenation**: `"abc" + "def"`


- `String(`String `p)`: constructor; instantiates together with *new* operator a string object
- char `charAt(`int `index)`: character at position *index*
- String `concat(`String `p)`: object + p
- boolean `equals(`String `p)`: exactly same chaaracters and order?
- boolean `equalsIgnoreCase(`String `p)`
- int `length()`
- String `replace(`char `oldChar, `char `newChar)`
- String `substring(`int `offset, `int `endIndex)`: from (incl.) offset to endIndex (excl.)
- String `toLowerCase()`
- String `toUpperCase()`

Strings are **immutable** --> all methods return a new String object

### 2) Scanner
```java
import java.util.Scanner
```

- `Scanner(`InputStream `source)`: constructor for a stream (e.g. System.in); other types: (File source) or (String source)
- String`next()`: next element; default delimiter = space
- String `nextLine()`
- int `nextInt()`; double `nextDouble()`; boolean `nextBoolean()`: error if type msimatch
- Scanner `useDelimiter(`String `pattern)`: define delimiter (in this Scanner object)
- boolean `hasNext()`: any more items?

```java
Scanner lineScanner = new Scanner(names);
lineScanner.useDelimiter(", ");
String name1 = lineScanner.next();
```

### 3) Random
```java
import java.util.Random;
```

- `Random()`: constructor
- float `nextFloat()`: float between 0.0 (incl.) and 1.0 (excl.)
- int `nextInt()`: int between -2147483648 and 2147483647
- int `nextInt(`int `max)`: int between 0 and max (excl.)

**Adjust and combine** to the needs (e.g. add and multiply to move boarders and extend range)

### 4) DecimalFormat

```java
import java.text.DecimalFormat;
```

- `DecimalFormat(`String `p)`: constructor; p = pattern for formatting (see below)
- String `format(`double `num)`: format "num" according to pattern
- void `applyPattern(`String `p)`: re-define pattern

**Pattern**:
- "0": enforce to show this position
- "#": show leading/trailing zeroes
- ".": define where decimal
- "'": define where '
- "%": use in % (--> *100 & add "%")
- Other characters: used as is
