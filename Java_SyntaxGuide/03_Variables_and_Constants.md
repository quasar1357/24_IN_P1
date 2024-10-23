# Variables and Constants
[Back to overview](./00_Java_SyntaxGuide.md)

## Declaration and Assignment
Declaration always with type, assignment of a value with `=`.
```java
int variableOne; // declared
variableOne = 100; // assigned value
// OR
int variableTwo = 100; declare and assign
```
```java
int variableOne, variabelTwo, ... ; // declare multiple at once
// OR
int variableOne = 100, variableTwo; // declare both, assign one
```

### Constants
Constants are declared as `final`, meaning they can be assigned exactly once:
```java
final int ARBITRARY_CONSTANT = 500;
```

## Assigning Literals

**Literals** can be of any primitive Data Type, a String, or Null:
- **Integer**: int a = 10;
- **Floating-point** (decimal numbers): `double pi = 3.1415;` `float f = 2.5f;` (Note the f for float)
- **Character** (single character enclosed in single quotes): `char ch = 'A';`
- **String** (sequence of characters enclosed in double quotes): `String name = "Hello";`
- **Boolean** (true and false): `boolean flag = true;`
- **Null** Literal (variable does not point to anything or to the "empty" object): `String str = null;`

**Strings**: Assigning a String literal to a variable, automatically creates a **String object** (*see chapter [Java API](07_Generics.md)*. This is an exception, as usually objects first need to be explicitly instantiated (*see chapter about [Objects](05_Objects_and_Methods.md)*).

**Primitive Data Types**: When assigning a literal of a primitive Data Type, the variable points **to the value itself**, which cannot be changed. This is different for object references (*see chapter about [Objects](05_Objects_and_Methods.md)*).


## Naming

**Conventions**:
- **Variables**: camelCase, e.g. ```currentSpeed```
- **Constants (static)**: CAPITAL_SNAKE_CASE, e.g. ```MAX_SPEED```
- (Non-static constants: camelCase; *see chapter about [Objects](05_Objects_and_Methods.md)*)
- **Classes**: PascalCase, e.g. ```SpeedSensor```
- **Methods**: camelCase, e.g. ```getCurrentSpeed```


Identifiers belong to one of **three categories**:
1. **Reserved** for a specific purpose in Java (class, int, ...)
2. Designate something from the **Java API** (system, main, println, ...)
3. Designate something from **this program** (own class/method/variable)

---

[Back to overview](./00_Java_SyntaxGuide.md)
