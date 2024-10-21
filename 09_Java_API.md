# Using Java API classes

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
- boolean `equals(`String `p)`: exactly same chaaracters and order?
- boolean `equalsIgnoreCase(`String `p)`
- int `length()`
- String `replace(`char `oldChar, `char `newChar)`
- String `substring(`int `offset, `int `endIndex)`: from (incl.) offset to endIndex (excl.)
- String `toLowerCase()`
- String `toUpperCase()`

Strings are **immutable** --> all methods return a new String object

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
