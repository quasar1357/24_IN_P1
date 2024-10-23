# Combinations of final vs. non-final, public vs. private, and static vs. non-static
[Back to overview](./00_Java_SyntaxGuide.md)

## 1. Private Instance Variable: private + non-final + non-static

This is a **standard private instance variable** that can be changed by methods within the class.

Use Case: This **allows encapsulated, modifiable state per instance** of the class.

```java
private int variable;
```

## 2. Private Class Variable: private + non-final + static

A private static variable that belongs to the class, not any instance, and can be modified.

Use Case: Used for class-level variables that should be hidden but modifiable, **like a class-wide counter**.

```java
private static int classVariable;
```

## 3. Private Instance Constant: private + final + non-static

A private constant that is tied to an instance but can't be changed once initialized (usually in the constructor).

Use Case: Useful for fields that must be initialized per instance but should never be modified after construction, **like fixed properties of that specific object**.

```java
private final int constant;
```

## 4. Private Class Constant: private + final + static

A private static constant that belongs to the class and can't be changed.

Use Case: This is used for **class-wide constants that are hidden** from outside access.

```java
private static final int CLASS_CONSTANT = 100;
```

## 5. Public Instance Constant: public + final + non-static

A public constant that is tied to an instance but cannot be modified.

Use Case: This is **rare** but can be useful when a constant value specific to an instance needs to be publicly visible.

```java
public final int instanceConstant;
```

## 6. Public Class Constant: public + final + static

A public static constant that belongs to the class and cannot be changed.

Use Case: This is used for **global constants** that are available publicly, such as Math.PI.

```java
public static final int MAX_SIZE = 50;
```

Summary Table:

Visibility | final | static | Combination Description
-|-|-|-
private | non-final | non-static | Private instance variable (standard)
private | non-final | static | Private class variable (like obj. counter)
private | final | non-static | Private instance constant (fixed object property)
private | final | static | Private class constant (hidden constants)
public | final | non-static | Public instance constant (rare)
public | final | static | Public class constant (global "service" constants)

**Excluded** Combinations, because violate **encapsulation**:
- **public + non-final** + non-static
- **public + non-final** + static

---

[Back to overview](./00_Java_SyntaxGuide.md)
