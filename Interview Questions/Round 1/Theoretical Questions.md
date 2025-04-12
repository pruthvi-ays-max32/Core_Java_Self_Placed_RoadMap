# 💡 Core Java Interview Questions & Answers

---

###  Q1: What is the difference between abstract class and interface in Java?

| Feature                  | Abstract Class                             | Interface                                           |
|--------------------------|--------------------------------------------|-----------------------------------------------------|
| Constructors             | Can have constructors                      | Cannot have constructors                            |
| Method Types             | Can have both concrete and abstract methods| Only public & abstract methods (default/static from Java 8) |
| Abstraction              | Provides partial abstraction               | Provides 100% abstraction                           |
| Multiple Inheritance     | Cannot extend more than one class          | Can implement multiple interfaces                   |
| Design Purpose           | Provides some common behavior              | Defines a contract that must be followed            |

---

###  Q2: Can we create an object of an abstract class? If not, how can we use it?

- ❌ No, we cannot instantiate an abstract class directly.
- ✅ To use it, create a subclass that extends the abstract class, then instantiate the subclass to access the abstract class's members.

```java
abstract class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
    }
}
```
---
### Q3 : What are default methods in interfaces? How do they work?

- Introduced in Java 8.
- Allows you to add new methods to interfaces without breaking existing implementations.
- Helpful when many classes implement the same interface and you want to add a new method.

```java
interface Vehicle {
    default void start() {
        System.out.println("Vehicle is starting...");
    }
}

```
---
### Q4: Can an abstract class have a constructor? Why or why not?

- ✅ Yes, an abstract class can have a constructor.
- It is used to initialize instance variables.
- When the subclass is instantiated, the super() constructor is implicitly or explicitly called.

```java
abstract class Shape {
    Shape() {
        System.out.println("Shape constructor called.");
    }
}

class Circle extends Shape {
    Circle() {
        super(); // Optional
        System.out.println("Circle constructor called.");
    }
}
```
---
### Q5: Difference Between Static Methods in Class vs Interface

| Aspect       | Static Method in Class                      | Static Method in Interface                  |
|--------------|----------------------------------------------|---------------------------------------------|
| Inheritance  | Not inherited by subclass                   | Not inherited by implementing class         |
| Access       | Accessed via class name                     | Accessed via interface name                 |
| Overridable  | Cannot be overridden                        | Cannot be overridden                        |

---
###  Q6: Explain Access Modifiers in Java and Where They Can Be Applied

Access Modifiers control the visibility of **classes**, **methods**, **variables**, and **constructors** in Java.

| Modifier   | Class | Package | Subclass | World |
|------------|:-----:|:-------:|:--------:|:-----:|
| `public`   | ✅     | ✅      | ✅       | ✅     |
| `protected`| ❌     | ✅      | ✅       | ❌     |
| `default`  | ❌     | ✅      | ❌       | ❌     |
| `private`  | ❌     | ❌      | ❌       | ❌     |

### ✅ Access Modifiers Can Be Applied To:

- **Classes**
- **Methods**
- **Variables**
- **Constructors**
---
###  Q7: What is the Purpose of a Static Block? When Does It Execute?

- A **static block** is used for static initialization of a class.
- It is executed **once** when the class is **loaded**, before constructors or objects are created.
- Often used for tasks like loading configurations or connecting to a database.

```java
class App {
    static {
        System.out.println("Static block executed!");
    }

    App() {
        System.out.println("Constructor called.");
    }
}
```
---
###  Q8: Can a Static Method Access Instance Variables? Why or Why Not?

❌ **No**, static methods **cannot** access instance variables **directly**.

- Static methods belong to the **class**, while instance variables belong to an **object**.
- To access instance variables, you must use an **object reference**.

```java
class Example {
    int count = 10;

    static void display() {
        // System.out.println(count); // ❌ Error: Cannot make a static reference to the non-static field 'count'
    }
}
```
--- 
###  Q9: What Are Inner Classes? Name the Four Types of Inner Classes in Java

**Inner classes** are classes defined **inside another class**.

📌 **Types of Inner Classes**:

1. **Member (Non-static) Inner Class**
2. **Static Nested Class**
3. **Local Inner Class** (defined inside methods)
4. **Anonymous Inner Class** (no name, used for one-time use)
---
###  Q10: What is an Anonymous Inner Class? Give a Real-World Example Where It's Useful

An **anonymous inner class** is a class **without a name** and is **defined and instantiated in a single statement**.

✅ **Commonly used** for quick implementations of **interfaces** or **abstract classes**.

🎯 **Useful in event handling**, such as in **GUI programming**.

```java
Button b = new Button("Click Me");

b.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button clicked!");
    }
});




