[Back to overview](./00_Java_SyntaxGuide.md)

---
# Conditions

## if and else Statements
### Simple **if**
```java
if (arbBool)
    ... // single line

// OR

if (arbBool) {
    ... // multiple lines
    ... // multiple lines
}
```

### If with **else**
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

### If with **else if** and else
```java
if (arbBool)
    ...
else if (anotherBool)
    ...
else
    ...

// OR

if (arbBool){
    ...
    ...
} else if (anotherBool) {
    ...
    ...
} else {
    ...
    ...
}
```

<div style="page-break-before: always;"></div>

## Switch Statement
- The `switch` command let's the user go through a block and **enter at positions, depending on the value** of the given variable
- **If we do not `break`** in a given case, it will **go through all following cases**
- The **`default`** case can be used to define what to do **if no other case is true**

```java
switch(anyVar) {
    case valueOne:
        ...
        break; // optional break statement (necessary to only run this case)
    case valueTwo:
        ...
        break; // optional break statement (necessary to only run this case)
    case ...
    ...
    default: // optional default case
        ...
}
```

## Conditional Operator
Given a boolean (or a statement that creates one), the operator **returns one of two values**: the first one if the boolean is true, the second one if it is false.

```java
anyBool ? valOne : valTwo;

// Example
points = (points > MAX) ? points + 1 : points * 2;

// Use-case for printing
System.out.println(tries + (tries == 1 ? " Versuch" : " Versuche"));
```

---

[Back to overview](./00_Java_SyntaxGuide.md)
