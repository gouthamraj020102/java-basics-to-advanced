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

#### Super and Subclass

This section covers inheritance relationships:
- Defining superclasses and subclasses
- Method overriding and superclass method calls
- Example package: `classes/superandsubclass/`

#### Nested Classes

- Demonstrates class design and inheritance-based behavior

This section covers nested-class types and examples in the requested order.

1. Static nested classes (`classes/nestedclass/staticnested/`)
   - Belong to the outer class, not to an outer instance.
   - Can be instantiated with `OuterClass.StaticNestedClass nested = new OuterClass.StaticNestedClass();`.
   - Can access only static members of the outer class.

2. Non-static inner classes
   - Member inner classes (`classes/nestedclass/nonstaticnested/`)
     - Declared as members of the outer class and require an outer instance.
     - Example usage: `OuterClass outer = new OuterClass(); OuterClass.InnerClass inner = outer.new InnerClass();`.
   - Local inner classes
     - Declared inside methods and used only within that method.
   - Anonymous inner classes (`classes/nestedclass/nonstaticnested/anonymousinnerclass/`)
     - Used for one-off implementations of interfaces or abstract classes.

3. Nested-class inheritance (`classes/nestedclass/inheritanceinnested/`)
   - Example one: `exampleone/` shows one inner class extending another.
   - Example two: `exampletwo/` shows extending a static nested class.
   - Example three: `examplethree/` shows extending a non-static inner class and binding the outer instance.

#### Generic Classes

This section covers Java generics and type safety:
- Generic class definitions and type parameters
- Generic methods and reusable code patterns
- Generic inheritance and subclassing rules
- Raw type usage and why it should be avoided
- Bounded generics with upper and multiple bounds
- Wildcards for flexible type parameters
- Example package: `classes/genericclass/`

#### POJO Classes

This section describes Plain Old Java Objects:
- Simple classes with fields, constructors, getters, and setters
- Used to model data without business behavior
- Example package: `classes/pojoclass/`

#### Enum Classes

This section covers Java `enum` usage and benefits:
- Basic enum declaration and iteration
- Custom values and methods inside enums
- Overriding methods in enums
- Using abstract methods with enum constants
- Implementing interfaces from enum constants
- Practical benefits of enums for fixed sets of values
- Example package: `classes/enumclass/`

#### Final Classes

This section explains the `final` keyword in Java:
- Final class behavior and why it cannot be subclassed
- Final variables and constants
- Final methods and preventing overriding
- Example package: `classes/finalclass/`

#### Singleton Classes

This section covers singleton design patterns and thread safety:
- Eager initialization singleton
- Lazy initialization singleton
- Thread-safe singleton with synchronization
- Double-checked locking singleton
- Bill Pugh singleton using a static holder class
- Enum-based singleton for serialization safety
- Example package: `classes/singletonclass/`

#### Immutable Classes

This section explains how to create immutable objects:
- Using `final` fields and no setters
- Preventing external modification of internal collections
- Returning defensive copies from getters
- Example package: `classes/immutableclass/`

#### Wrapper Classes

This section explains how wrapper classes work:
- Autoboxing: primitive to wrapper conversion
- Unboxing: wrapper to primitive conversion
- Using wrapper types like `Integer`, `Character`, `Boolean`
- Demonstrates `static final` constant usage in `Employee`
- Example package: `variables/wrapper/`

---

### 8. Interfaces

This section covers Java interfaces and contracts:
- Interface declaration and implementation
- Multiple interface inheritance
- Default and static methods in interfaces
- Example package: `interface/`

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
│      │      ├── boundedgenerics/
│      │      │       ├── upperbound/
│      │      │       └── multibound/
│      │      └── wildcards/
│      ├── pojoclass/
│      ├── enumclass/
│      │      ├── fundamentals/
│      │      ├── customvalues/
│      │      ├── methodoverride/
│      │      ├── abstractmethod/
│      │      ├── enuminterfaces/
│      │      └── benefits/
│      ├── finalclass/
│      ├── singletonclass/
│      │      ├── eager/
│      │      ├── lazy/
│      │      ├── synchronization/
│      │      ├── doublechecklocking/
│      │      ├── billpughsolution/
│      │      └── enumsingleton/
│      └── immutableclass/
├──  interfaces
│      ├── fundamentals/
│      ├── benefits/
│      │      ├── abstraction/
│      │      ├── polymorphism/
│      │      └── multipleinheritance/
│      ├── methods/
│      ├── fields/
│      ├── implementation/
│      ├── nestedinterface/
│      │      ├── withininterface/
│      │      └── withinclass/
│      ├── defaultmethod/
│      │       ├── problem/
│      │       ├── defaultmethod/
│      │       ├── multipleinheritance/
│      │       └── extendinterface/
│      │              ├── wayone/
│      │              ├── waytwo/
│      │              └── waythree/
│      ├── staticmethod/
│      ├── privatemethod/
│      └── functionalinterface/
├──  reflection
├──  annotations
├──  exceptionhandling
├──  operators
├──  controlflow
├──  collections
├──  streams
└──  multithreading

```

## Getting Started

Compile and run Java files using the Java compiler from the project root:

```bash
javac <FileName>.java
java <ClassName>
```