# Programmierung 1 - UniBern 2024

This is the repository of *Roman Schwob* for "Programmierung 1" of the Bachelor in "Informatik" at the University of Bern.

In the second part of the readme below is a *Syntax Guide for Java* that I create. The *folders* in the repository contain my solutions to the exercise series.

If you have any questions or suggestions, please contact me through GitHub.




# Java Syntax Guide

## Comments:
```
// comment on one line
```
```
/*
comment until ended with
*/
```
```
/**
* automatic generation of documentation
*/
```

## Objects and Methods

**NOTE**: Class definition vs. object instantiation!

Class & methods **definition**:
```
public class ArbitraryClass{
    ...
    public static void arbitrarMethod(arbitraryArguments){
        ...
    }
    ...
    public static void main(String[] args){
        ... // The main method is mandatory if we want the program to run...
    }
}
```

Object **instantiation**:
```
ArbitraryClass arbitraryObject = new ArbitraryClass(arbitraryParameters);
Circle circle1 = new Circle(40, 40, 10); // Ex.
```

**Call a method**:
```
arbitraryMethod(arbitraryParameters); // method of this class
printQuoteOfSteve(); // Ex. method that is defined in this class

arbitraryObject.arbitraryMethod(arbitraryParameters); // ... of another object
circle1.setCenterX(100); // Ex.
```

## Variables and Constants

**Variables**:
```
int arbitraryVariable; // declared
arbitraryVariable = 100; // assigned value
// OR
int arbitraryVariable = 100; declare and assign
```
```
int variableOne, variabelTwo, ... ; // declare multiple at once
// OR
int variableOne = 100, variableTwo; // declare both, assign one
```

**Constants**:
```
final int ARBITRARY_CONSTANT = 500;
```

## Input and Output

### Output
```
System.out.println("arbitrary text") // prints with trailing line break
System.out.print("arbtrary text") // prints without line break
// NOTE: System.out = Objekt; repräsentiert Ausgabegerät
```

### Input
```
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

## Data Types

### Stings
```
String arbitraryString = "arbitrary text"
```
Note: strings is **NOT a primitive data type**, but a class!

**Concatenate** 2 strings:
```
"abc" + "def"
```

**escape** symbol: "\\", especially \\" for an actual double quote

### Numbers

(byte: -128 - 127)
(short: -32'768 - 32767)
**int: −2'147'483'648, +2'147'483'647**
(long ≈ ±9 × 10 18)
(float ≈ ±3.4 × 10 38)
**double ≈ ±1.7 × 10 308**

convert "up" (e.g. int to double): no problem
```
int count = 17;
double num = count; // will be 17.0
```

convert "down" (e.g. double to int): --> need **cast operation**
```
int count = (int) num; // cast num into int, then assignment works
```

**Operations**:
- +, -, *, / as usual (also priority)
- modulo= %; priority as *and /, also on floats/doubles...
- division: two ints --> int; else --> float/double...
- ++ and -- --> + and - 1; e.g. arbVar++
- += etc.; e.g. arbVar += 10

### Characters

a **single** character, declared within single quotes
```
char arbitraryChar = 'a';
```


### Booleans

only possible values: **true false**
```
boolean arbitraryBool = false;
```

**Use booleans**:
- Relational Operators: ==, !=, <, >, <=, >=
- AND: && ; OR: ||; NOT: ! (e.g. !a)
- Priorities: 1. NOT, 2. AND, 3. OR

## Conditions

```
if (arbVar > 10)
    ... // single line!

// OR

if (arbVar > 10){
    ... // multiple lines!
    ... // multiple lines!
}

```
```
if (arbVar > 10)
    ... // single line!
else
    ...

// OR

if (arbVar > 10){
    ... // multiple lines!
    ... // multiple lines!
} else {
    ... // multiple lines!
    ... // multiple lines!
}

```
