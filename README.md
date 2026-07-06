# java-basics-to-advanced

A comprehensive Java learning repository covering core concepts from basics to advanced topics.

## Documentation

### 1. Object-Oriented Programming (OOPS)

This section covers the core concepts of object-oriented programming:

- **Fundamentals** (`oops/fundamentals/`)
  - Basic OOP principles and simple class examples

- **Abstraction** (`oops/abstraction/`)
  - Abstract classes and interfaces
  - Implementing abstract methods

- **Encapsulation** (`oops/encapsulation/`)
  - Data hiding and access modifiers
  - Getter and setter methods

- **Inheritance** (`oops/inheritance/`)
  - Parent-child relationships
  - Method overriding

- **Polymorphism** (`oops/polymorphism/`)
  - Method overloading and overriding
  - Compile-time and runtime polymorphism

---

### 2. Java Virtual Machine (JVM)

This section explains how Java programs run on the JVM:

- **JVM concepts** (`jvm/`)
  - Class loading and execution
  - Object creation and method execution
  - Bytecode-based runtime behavior

---

### 3. Variables

This section focuses on Java variable types and usage:

- **Primitive types** (`variables/primitive/`)
  - `int`, `float`, `double`, `boolean`, `char`, `byte`, `short`, `long`

- **Reference types** (`variables/reference/`)
  - Objects and references
  - Working with class instances

- **Wrapper classes** (`variables/wrapper/`)
  - Boxing and unboxing
  - Conversion between primitives and objects

---

### 4. Methods

This section covers method declarations, calls, and usage:

- **Basic methods** (`methods/`)
  - Return types and parameters
  - Method overloading and reuse

- **Department-based examples** (`methods/HumanResource/`, `methods/SalesDepartment/`)
  - Practical usage of methods in business logic

---

### 5. Constructors

This section demonstrates how objects are initialized:

- **Default constructors**
- **Parameterized constructors**
- **Constructor overloading**
- Examples in the `constructors/` package

---

### 6. Memory Management

This section explains how Java manages memory:

- **Stack vs Heap**
- **Object lifecycle**
- **Garbage collection basics**
- Examples in the `memorymanagement/` package

---

### 7. Classes

This section introduces additional class-based Java concepts:

- **Abstract classes** (`classes/abstractclass/`)
- **Concrete classes** (`classes/concreteclass/`)
- Demonstrates class design and inheritance-based behavior

#### Nested Classes

This section covers nested-class types and examples in the requested order.

1. Static nested classes (`classes/nestedclass/staticnested/`)
   - Belong to the outer class, not to an outer instance.
   - Can be instantiated with `OuterClass.StaticNestedClass nested = new OuterClass.StaticNestedClass();`.
   - Can access only static members of the outer class.
   - Example files: `OuterClass.java`, `Main.java` in `classes/nestedclass/staticnested/`.

2. Non-static inner classes
   - Member inner classes (`classes/nestedclass/nonstaticnested/`)
     - Declared as members of the outer class; require an outer instance to create.
     - Example usage: `OuterClass outer = new OuterClass(); OuterClass.InnerClass inner = outer.new InnerClass();`.
   - Local inner classes
     - Declared inside methods; scope is limited to the method.
   - Anonymous inner classes (`classes/nestedclass/nonstaticnested/anonymousinnerclass/`)
     - Inline class implementations used for single-use behavior (e.g., listeners or runnable instances).

3. Inheritance (inheritanceNeeded)
   - Example 1: `classes/nestedclass/inheritanceinnested/exampleone/`
     - `InnerClass2` extends `InnerClass1` (subclass inherits fields and behavior from superclass).
   - Example 2: `classes/nestedclass/inheritanceinnested/exampletwo/`
     - Extending a `static` nested class from a top-level class (remember to call `super()` appropriately).
   - Example 3: `classes/nestedclass/inheritanceinnested/examplethree/`
     - Extending a non-static inner class from a top-level class, using `new OuterClass().super();` in the subclass constructor to bind an enclosing instance.

---

## Project Structure

```text
src/com/javaconcepts/
├── oops/
│      ├── fundamentals/
│      ├── encapsulation/
│      ├── inheritance/
│      ├── polymorphism/
│      └── abstraction/
├── jvm/
├── variables/
│      ├── primitive/
│      ├── reference/
│      └── wrapper/
├── methods/
├── constructors/
├── memorymanagement/
├── classes/
│      ├── abstractclass/
│      ├── concreteclass/
│      ├── superandsubclass/
│      ├── nestedclass/
│      │      ├── staticnested/
│      │      ├── nonstaticnested/
│      │      │      ├── memberinnerclass/
│      │      │      ├── localinnerclass/
│      │      │      └── anonymousinnerclass/
│      │      └── inheritanceinnested/
│      │              ├── exampleone/
│      │              ├── exampletwo/
│      │              └── examplethree/
│      ├── genericclass/
│      │      ├── fundamentals/
│      │      ├── genericmethods/
│      │      ├── inheritance/
│      │      │       ├── genericsubclass/
│      │      │       └── nongenericsubclass/
│      │      ├── rawtype/
│      │      └── boundedgenerics/
│      │              ├── upperbound/
│      │              └── multibound/
│      ├── pojoclass/
│      ├── enumclass/
│      ├── finalclass/
│      ├── singletonclass/
│      ├── immutableclass/
│      └── wrapperclass/
└── interface
```

## Getting Started

Compile and run Java files using the Java compiler from the project root:

```bash
javac <FileName>.java
java <ClassName>
```