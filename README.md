# java-basics-to-advanced

A comprehensive Java learning repository covering core concepts from basics to advanced topics.

## Documentation

### 1. Object-Oriented Programming (OOPS)

The OOPS section covers fundamental object-oriented programming principles:

- **Fundamentals** (`oops/fundamentals/`)
  - Basic OOP concepts and Student class examples

- **Abstraction** (`oops/abstraction/`)
  - Abstract classes and interfaces
  - Implementing abstract methods
  - Examples: Car interface with Audi and BMW implementations
  
- **Encapsulation** (`oops/encapsulation/`)
  - Data hiding and access modifiers
  - Getter and setter methods
  - Examples: BankAccount, Dog classes demonstrating private fields
  
- **Inheritance** (`oops/inheritance/`)
  - Parent-child class relationships
  - Method overriding
  - Examples: Vehicle as parent class with Car as child class
  
- **Polymorphism** (`oops/polymorphism/`)
  - Method overloading and overriding
  - Runtime and compile-time polymorphism
  - Examples: Sum class with multiple add methods, A and B classes

---

### 2. Java Virtual Machine (JVM)

Understanding how Java runs on the JVM:

- **Employee.java** - Demonstrates JVM memory allocation and object creation
- **Student.java** - Shows how the JVM handles class instances and method execution
- Focuses on bytecode compilation and JVM execution model

---

### 3. Variables

Comprehensive coverage of Java variable types:

- **Primitive Types** (`variables/primitive/`)
  - int, float, double, boolean, char, byte, short, long
  - Examples: Employee class using primitive data types
  
- **Reference Types** (`variables/reference/`)
  - Objects and references
  - Examples: Employee, Engineer, Person, Student, Teacher classes
  - Understanding object references vs primitive values
  
- **Wrapper Classes** (`variables/wrapper/`)
  - Converting between primitive and object types
  - AutoBoxing and unboxing
  - Examples: WrapperClass demonstrating Integer, Double, Boolean wrappers

---

### 4. Methods

Working with methods in Java:

- **Basic Methods** (`methods/`)
  - Method definition and calling
  - Parameters and return types
  - Examples: Calculation, Doctor, Nurse, Person, Surgeon classes
  
- **HumanResource Department** (`methods/HumanResource/`)
  - JobPortal.java - Demonstrates method usage in business logic
  
- **SalesDepartment** (`methods/SalesDepartment/`)
  - Invoice.java - Working with methods for invoice operations
  - Order.java - Order processing using methods

---

### 5. Constructors

Object initialization and constructor patterns:

- **Default Constructors** - Constructor without parameters
- **Parameterized Constructors** - Constructor with parameters
- **Constructor Overloading** - Multiple constructors in same class
- Examples:
  - Calculation class - Mathematical operations
  - Person, Manager classes - Demonstrating person/role concepts
  - Main class - Showcasing constructor usage

---

### 6. Memory Management

Understanding Java memory management:

- **Memory Allocation** (`memorymanagement/`)
  - Stack memory for primitive types and references
  - Heap memory for objects
  - Garbage collection concepts
  
- **Topics Covered:**
  - Memory regions (Stack, Heap, Metaspace)
  - Object lifecycle and garbage collection
  - Memory leaks and best practices
  - Weak and soft references

---

## Project Structure

```
src/
├── com/javaconcepts/
│   ├── constructors/      # Constructor examples
│   ├── jvm/               # JVM-related concepts
│   ├── memorymanagement/  # Memory management topics
│   ├── methods/           # Method examples
│   ├── oops/              # Object-oriented programming
│   └── variables/         # Variable types
```