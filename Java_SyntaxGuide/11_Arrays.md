[Back to overview](./00_Java_SyntaxGuide.md)

---
# Arrays

## Creating arrays

- Arrays are **part of Java** (not "written in Java")
- Arrays in Java **are Objects**
- At instantiation we **have to define the length**
- An array's **length can not be changed** afterwards

```java
aType[] aVarName; // Declaration
aVarName = new int[aNum]; // Instantiation with length aNum
// Example:
int[] numbersArr = new int[8]; // int array of length 8
```

- Arrays can also be instantiated using **initialization lists**, i.e. lists of elements of the same type, separated by `,` and enclosed in `{}`
- The **`new` operator is not necessary** in this case
- **Type and length are inferred** automatically by Java, but types must be same as for declaration

```java
aType[] aVarName = {elOne, elTwo, elThree}; // will be of length 3
// Example
int[] scores = {5, 3, 22, 31, 5, 18, 12, 55, 17, 17};
```

- Elements can be **objects or primitive data types**
- When the array is instantiated, it reserves space for the objects, but **does NOT instantiate the objects** themselves
- **For primitive data types, default values** are assigned, e.g. `0` for numericals and `false` for booleans

```java
// Example:
String[] names = new String[4]; // Array instantiated, NO Strings instantiated yet
String name1 = new String("Sebastian");
names[0] = name1;
names[1] = new String("Louis");
names[2] = "Hannes";
```

## Accessing Elements

Use **square brackets and an index** to access elements

```java
int myEl = numbersArr[3]; // get fourth element (remember indices start @ 0)
```

## Getting the length

The **variable ".length" is public** and can be accessed directly on array objects

```java
// Example:
int maxIndex = numbersArr.length - 1; // Example...
```

## multi-dimensional arrays

- Multi-dimensional arrays are achieved by creating **arrays of arrays** (of arrays of ...)
- To instantiate the arrays and to access elements, we just use **multiple square brackets** (one for each dimension)
- To access properties of dimensions, we just use them on elements of the "layer before" (which are arrays themselves)

```java
// Example:
int[][] table = new int[4][5];
int value = table[2][3];
table.length; // = height (# rows)
table[0].length; // = width (# columns)
```

- We can also use **initialization lists** for instantiation, again they are just used in a nested way
- Importantly, this can cause a **ragged array**, i.e. arrays with different lengths in the same dimension

```java
// Example "normal" array:
int[][] results = { {1, 2, 0},
                    {2, 0, 1},
                    {1, 1, 1},
                    {1, 0, 2} };
```

```java
// Example "ragged" array:
int[][] ragged = { {1, 2, 0},       // row length 3
                   {2, 0},          // row length 2
                   {1, 1, 1, 2} };  // row length 4

```

## Comparison Arrays vs. ArrayLists

Property | Arrays | ArrayLists
-|-|-
**Code** | *Part of* Java | *Written in* Java (Java API)
**Size** | Fixed | Flexible
**Elements management** | Manual | Automatic
**Access** | Index | Methods
**Types** | Prim. data types OR objects | Only objects
**Dimensions** | Any | One


---

[Back to overview](./00_Java_SyntaxGuide.md)
