# Primitive Data Types
[Back to overview](./00_Java_SyntaxGuide)

## 1) Numbers

- (byte: -128 - 127)
- (short: -32'768 - 32767)
- **int: −2'147'483'648 - +2'147'483'647**
- (long ≈ ±9 × 10^18)
- (float ≈ ±3.4 × 10^38)
- **double ≈ ±1.7 × 10^308**


**Convert "up"** (e.g. assign int to double): no problem
```java
int count = 17;
double num = count; // will be 17.0
```

**Convert "down"** (e.g. assign double to int): assignment would give err --> need **cast operation**
```java
int count = (int) num; // cast num into int, then assignment works
```
**Casting**:
```java
int c = (int) (a * b) // (a * b) calculated with double logic then type-casted to int
double c = (int) a * b // a casted to int and then converted to double through multiplication
```

**Operations**:
- types: two ints --> int; else --> float/double...
- ```+, -, *, /``` as usual (also priority)
- modulo = ```%``` ; priority as ```*``` and ```/```, also on floats/doubles...
- ```++``` and ```--``` --> + and - 1; e.g. ```arbVar++```
- ```+=``` etc.; e.g. ```arbVar += 10```

## 2) Characters (& the String Class)

A **single character**, declared within **single quotes**
```java
char aCharVar = 'a';
```

Note: **string is NOT a primitive data type**, but a class!

However, it is an exception in that it can be created **without "new" command and constructor call**:
```java
String aStringVar = "arbitrary text"
```
*Details about strings, see  chapter [Java API](10_Java_API.md).*

## 3) Booleans

Only two possible values: **true** or **false**
```java
boolean aBoolVar = false;
```

**Create and combine booleans**:
- **Relational** Operators: ```==, !=, <, >, <=, >=```
- **Logical** Operators: AND = ```&&``` ; OR = ```||``` ; XOR = ```^``` ; NOT = ```!``` (e.g. ```!a```)
- **Priorities**:

    0. () (and artihmetic Operations)
    1. NOT
    2. XOR
    3. AND
    4. OR

---

[Back to overview](./00_Java_SyntaxGuide)
