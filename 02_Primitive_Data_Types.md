# Primitive Data Types

## 1) Numbers

- (byte: -128 - 127)
- (short: -32'768 - 32767)
- **int: −2'147'483'648 - +2'147'483'647**
- (long ≈ ±9 × 10^18)
- (float ≈ ±3.4 × 10^38)
- **double ≈ ±1.7 × 10^308**


**Convert "up"** (e.g. int to double): no problem
```java
int count = 17;
double num = count; // will be 17.0
```

**Convert "down"** (e.g. double to int): assignment would give err --> need **cast operation**
```java
int count = (int) num; // cast num into int, then assignment works
```
```java
a = (double) (a * b) // (a * b) will be calculated with int logic then type-casted to double
```

**Operations**:
- ```+, -, *, /``` as usual (also priority)
- modulo = ```%``` ; priority as ```*``` and ```/```, also on floats/doubles...
- types: two ints --> int; else --> float/double...
- ```++``` and ```--``` --> + and - 1; e.g. ```arbVar++```
- ```+=``` etc.; e.g. ```arbVar += 10```

## 2) Characters (& the String Class)

A **single character**, declared within **single quotes**
```java
char arbitraryChar = 'a';
```

Note: **string is NOT a primitive data type**, but a class!

However, it is an exception in that it can be created **without "new" command and constructor call**:
```java
String arbitraryString = "arbitrary text"
```
*Details about strings, see below (API classes)*

## 3) Booleans

Only possible values: **true** or **false**
```java
boolean arbitraryBool = false;
```

**Create and combine booleans**:
- **Relational** Operators: ```==, !=, <, >, <=, >=```
- **Logical** Operators: AND = ```&&``` ; OR = ```||``` ; XOR = ```^``` ; NOT = ```!``` (e.g. ```!a```)
- **Priorities**:

    0. () (& artihm. Op.)
    1. NOT
    2. XOR
    3. AND
    4. OR