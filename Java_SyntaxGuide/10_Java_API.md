# Using Java API classes
[Back to overview](./00_Java_SyntaxGuide.md)

## Strings

Important: string is **NOT a primitive data type**, but a class!

NOTE: Use **DOUBLE quotes**! (single quotes not supported as in python...)

However, it is an exception in that it can be **created without "new"** command and constructor:
```java
String arbitraryString = "arbitrary text"
```

**Escape** symbol: \\, especially \\" for an actual double quote

Shortcut for **concatenation**: `"abc" + "def" + 1`, other types are auto-converted if **any one** is a String


- `String(`String `p)`: constructor; instantiates together with *new* operator a string object
- char `charAt(`int `index)`: character at position *index*
- String `concat(`String `p)`: object + p
- boolean `equals(`String `p)`: if exactly same characters and order
- boolean `equalsIgnoreCase(`String `p)`
- int `compareTo(`String `p)`: positive if larger than p, negative if smaller, 0 if equal (Unicode stepwise from left to right, see below)
- int `length()`
- String `replace(`char `oldChar, `char `newChar)`
- String `substring(`int `offset, `int `endIndex)`: from (incl.) offset to endIndex (excl.)
- String `toLowerCase()`
- String `toUpperCase()`

Strings are **immutable** --> all methods return a new String object

![unicode](unicode.png)

## System (Output/Input)

Does not need to be imported.

### Output
```java
System.out.println("arbitrary text") // prints with trailing line break
System.out.print("arbitrary text") // prints without line break
// NOTE: System.out = Objekt; repräsentiert Ausgabegerät
```

### Input
`System.in`, usually used together with the Scanner class, see below.
Example:
```java
import java.util.Scanner;
...
    Scanner scan = new Scanner(System.in);
    String arbitraryStringVar = scan.next();
    int arbitraryIntVar = scan.nextInt();
    double arbitraryDoubleVar = scan.nextDouble();
    ...
```

## Scanner
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
Scanner nameScanner = new Scanner(namesFile);
nameScanner.useDelimiter(", ");
String name1 = nameScanner.next();
String name2 = nameScanner.next();
...
```

## Random
```java
import java.util.Random;
```

- `Random()`: constructor
- float `nextFloat()`: float between 0.0 (incl.) and 1.0 (excl.)
- int `nextInt()`: int between -2147483648 and 2147483647
- int `nextInt(`int `max)`: int between 0 and max (excl.)

**Adjust and combine** to the needs (e.g. add and multiply to move boarders and extend range)

## DecimalFormat

```java
import java.text.DecimalFormat;
```

- `DecimalFormat(`String `p)`: constructor; p = pattern for formatting (see below)
- String `format(`double `num)`: format "num" according to pattern
- void `applyPattern(`String `p)`: re-define pattern

**Pattern**:
- "0": enforce to show this position with leading/trailing zeroes
- "#": show only if necessary
- ".": define where decimal
- ",": define where '
- "%": use in % (--> *100 & add "%")
- Other characters: used as is

## Math
Does not need to be imported.

All methods are static, i.e. can be called directly on the class, without instantiating an object.

- static double `abs(`double `num)`: Absolute value
- static double `cos(`double `angle)`: Cosine (also existing: `sin()` und `tan()`)
- static long `round(`double `num)`: Round to closest integer
- static double `ceil(`double `num)`
- static double `floor(`double `num)`
- static double `pow(`double `x, `double `y)`: x^y
static double sqrt(`double `x): x^0.5
- static double `min(`double `x, `double `y)`: (also existing: `max()`)
- static double `random()`: between 0.0 (incl.) and 1.0 (excl.)

## Wrapper Classes

To each primitive data type, there exists a class that wraps them and **can hold and work with values of that type**. They are particularly useful in cases that it is necessary to use objects and not primitive data types.

**Wrapper Class Name: Same as primitivy data type but with capital first letter. Exceptions: Integer instead of Int and Character instead of Char.**

Autoboxing and Unboxing is easy:

```java
Integer obj = 69; // auto-instantiation of Integer object
int num = obj; // auto-extraction of int value
```

**Parsing**: numerical Wrapper functions contain *static* parse methods to read in a number in form of a string.
```java
String strNum = "987";
int num = Integer.parseInt(strNum);
```

The opposite can be done with the *static* **toString methods**.
```java
int num = 987;
String strNum = Integer.toString(num);
```

## ArrayList

Saves a **list of objects of the same type**. Allows access and modifications through **integer indices**.

ArrayList is a **generic** class, meaning the user can instantiate a parametrised type that can hold objects of one defined type.
Importantly, ArrayLists **can only store objects**, NOT primary data types. This suggests using wrapper classes mentioned above.
At the declaration, the user **specifies the type of the objects that can be contained** in the ArrayList.
Naturally, the assigned object must be instantiated with the same type.
Defining an ArrayList without type specification (holding any types) is possible, but not recommended.

```java
ArrayList<aType> aVarName = new ArrayList<aType>(); // Declaration and instantiation with the same type
ArrayList<String> names = new ArrayList<String>(); // Example
```
- ```ArrayList<E>()```: Constructor, instantiates an empty list that can take objects of type E
- boolean `add(`E `obj)`: Adds object `obj` of type "E" at the end, returns `true` if successful
- void `add(`int `i, `E `obj)`: Adds object `obj` of type "E" at position i, shifts object currently at this position and all following objects back by one, returns `true` if successful
- E `set(`int `i, `E `obj)`: Replaces the object at position i with obj, returns the replaced object
- E `get(`int `i)`: Returns the element at position i
- void `clear()`: Removes all elements from the list
- E `remove(`int `i)`: Removes the element at position i from the list and returns it
- int `indexOf(`E `obj)`: Returns the (smallest) index of the object obj in list; returns -1, if obj does not exist in this list
- boolean `contains(`E `obj)`: `true` if object present at least once
- boolean `isEmpty()`
- int `size()`: number of objects saved in list
- String `toString()`: "[X, Y ... ]" where X, Y etc. are the objects in string form

NOTE: methods using an index return a runtime error if the index is not valid

---

[Back to overview](./00_Java_SyntaxGuide.md)
