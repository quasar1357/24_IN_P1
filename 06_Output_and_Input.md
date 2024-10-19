# Simple CMD Output (and Input)

## Output
```java
System.out.println("arbitrary text") // prints with trailing line break
System.out.print("arbtrary text") // prints without line break
// NOTE: System.out = Objekt; repräsentiert Ausgabegerät
```

## Input (more details, see Scanner class of java API)
```java
import java.util.Scanner;
...
    Scanner scan = new Scanner(System.in);
    String arbitraryStringVar = scan.next();
    int arbitraryIntVar = scan.nextInt();
    double arbitraryDoubleVar = scan.nextDouble();
    ...
```
