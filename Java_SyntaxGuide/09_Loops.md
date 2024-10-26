[Back to overview](./00_Java_SyntaxGuide.md)

---
# Loops

## While Loops
```java
while ( boolExpre­ssion ) {
 ­ ... ­st­ate­ments
}
```

![while](while.png)

## Do While Loops

```java
do {
 ­ ... ­st­ate­ments
} while ( boolExpre­ssion );
```
![doWhile](doWhile.png)

## For Loops
![for](for.png)

### For with a variable

- **Inititalization** of the variable (executed *once*)
- **Condition** (checked *before* each entry into loop)
- **Update** of variable (executed *after* each iteration; can basically be *any change* to the variable)

NOTE: The variable used for the loop **should not be changed in the loop**!

```java
for (loopVar = initVal; boolWithVar; updateOfVar)
    ...

for (int count = 1; count <= 3; count++)
    System.out.println(count);

int count; // can use variable that we declared before
for (count = 1; count <= 3; count++)
    System.out.println(count);

for (int count = 100; count > 0; count--) // Can also decrement
    System.out.println(count);
```

### For-each (with iterable)

```java
for (elementType tempElementName : objWithIterator)
    ...

// Example:    
for (String bandMember : band)
    System.out.println(bandMember);
```

---

[Back to overview](./00_Java_SyntaxGuide.md)
