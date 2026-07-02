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

---

## Project Structure

```text
src/
├── com/javaconcepts/
│   ├── classes/
│   │   ├── abstractclass/
│   │   └── concreteclass/
│   ├── constructors/
│   ├── jvm/
│   ├── memorymanagement/
│   ├── methods/
│   ├── oops/
│   └── variables/
```

## Getting Started

Compile and run Java files using the Java compiler from the project root:

```bash
javac <FileName>.java
java <ClassName>
```