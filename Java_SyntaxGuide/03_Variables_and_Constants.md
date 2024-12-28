[Back to overview](./00_Java_SyntaxGuide.md)

---
# Variables and Constants

## Declaration and Assignment
Declaration always with type; assignment of a value with `=`.
```java
int variableOne; // declare
variableOne = 100; // assign value
// OR
int variableTwo = 100; // declare and assign in one
```
```java
int variableOne, variabelTwo, ... ; // declare multiple at once
// OR
int variableOne = 100, variableTwo; // declare both, assign one
```

### Constants
Constants are declared as `final`, meaning they can be assigned exactly once:
```java
final int arbitraryConstant = 500; // non-static constant
final static int MAX_SPEED = 120; // static constant
```

## Assigning Literals

**Literals** can be of any primitive Data Type, a String, or `null`:
- **Integer**: `int a = 10`;
- **Floating-point** (decimal numbers): `double piApprox = 3.1415;` `float myF = 2.5f;` (note the f for float)
- **Character** (single character enclosed in single quotes): `char ch = 'A';` (case sensitive; 'A' != 'a')
- **String** (sequence of characters enclosed in double quotes): `String name = "Hello";`
- **Boolean** (true and false): `boolean aFlag = true;`
- **Null** Literal (variable does not point to anything or to the "empty" object): `String str = null;`

**Strings**: Assigning a String literal to a variable, automatically creates a **String object** (*see chapter [Java API](07_Generics.md)*). This is an exception, as usually objects first need to be explicitly instantiated (*see chapter about [Objects](05_Objects.md)*).

**Primitive Data Types**: When assigning a literal of a primitive Data Type, the variable points **to the value itself**, which cannot be changed. This is different for object references (*see chapter about [Objects](05_Objects.md)*).


## Naming

**Conventions**:
- **Variables**: camelCase, e.g. ```currentSpeed```
- **Constants (static)**: CAPITAL_SNAKE_CASE, e.g. ```MAX_SPEED```
- (Non-static constants: camelCase; *see chapter about [Objects](05_Objects.md)*)
- **Classes**: PascalCase, e.g. ```SpeedSensor```
- **Methods**: camelCase, e.g. ```getCurrentSpeed```


Identifiers belong to one of **three categories**:
1. **Reserved** for a specific purpose in Java (class, int, ...)
2. Designate something from the **Java API** (system, main, println, ...)
3. Designate something from **this program** (own class/method/variable)

---

[Back to overview](./00_Java_SyntaxGuide.md)
