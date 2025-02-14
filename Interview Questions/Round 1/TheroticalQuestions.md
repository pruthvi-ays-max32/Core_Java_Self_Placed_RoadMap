
Here are the perfected answers to each theoretical question in a clear and structured way.

##########################🔹 Q1: What is the difference between an abstract class and an interface in Java?

Feature	                            Abstract Class	                                          Interface

Methods	                Can have both abstract & concrete methods	        Only abstract methods (till Java 7). From Java 8, can have default & static methods
Variables	              Can have instance, static, final variables	      Can only have public static final (constants)
Constructor	            ✅ Can have a constructor	                        ❌ Cannot have a constructor
Multiple Inheritance	  ❌ Not supported	                              ✅ Supported using multiple interfaces
Keyword Used	                extends	                                      implements
Purpose	                Used for code reuse & partial abstraction	      Used for 100% abstraction (contract)

✔ Example:
abstract class Animal {
    abstract void makeSound(); // Abstract method
    void sleep() { System.out.println("Sleeping..."); } // Concrete method
}

interface Vehicle {
    void drive(); // By default, public and abstract
}


##########################🔹 Q2: Can we create an object of an abstract class? If not, how can we use it?
❌ No, we cannot create an object of an abstract class.
👉 This is because an abstract class is incomplete (it has at least one abstract method).


##########################🔹 Q3: What are default methods in interfaces? How do they work?
✅ Default methods in interfaces (introduced in Java 8) allow adding new methods to interfaces without breaking existing implementations.

✔ Example:
interface Animal {
    default void sleep() { // Default method with implementation
        System.out.println("Sleeping...");
    }
}
class Dog implements Animal { }
public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sleep(); // ✅ Calls the default method from interface
    }
}

📌 Why do we need default methods?

Suppose 100 classes implement an interface and you need to add a new method.
Instead of modifying all classes, you define a default method in the interface.


##########################🔹 Q4: Can an abstract class have a constructor? Why or why not?
✅ Yes, an abstract class can have a constructor.
📌 Reason:
An abstract class may have instance variables, which need to be initialized through a constructor.
When a subclass object is created, the abstract class constructor is called first.
✔ Example:

abstract class Animal {
    String name;
    Animal(String name) { this.name = name; } // Constructor
}
class Dog extends Animal {
    Dog(String name) { super(name); } // Calling parent constructor
}
public class Main {
    public static void main(String[] args) {
        Dog d = new Dog("Tommy");
        System.out.println(d.name); // ✅ Output: Tommy
    }
}


##########################🔹 Q5: What is the difference between static methods in interfaces and static methods in classes?

Feature	            Static Methods in Classes	                        Static Methods in Interfaces

Definition	      Declared with static keyword	                 Declared with static keyword
Inheritance    	  ✅ Inherited by subclasses	                  ❌ Not inherited by implementing classes
Accessing	          ClassName.methodName()	                      InterfaceName.methodName()
Override	          ❌ Cannot be overridden	                  ❌ Cannot be overridden
✔ Example:

interface A {
    static void show() { System.out.println("Static method in interface"); }
}
class B implements A { }
public class Main {
    public static void main(String[] args) {
        A.show(); // ✅ Allowed
        // B.show(); ❌ Not Allowed
    }
}


##########################🔹 Q6: Explain access modifiers in Java and where they can be applied.
Modifier	          Class	 Package	Subclass	World
public	            ✅ Yes	✅ Yes	✅ Yes	✅ Yes
protected	          ✅ Yes	✅ Yes	✅ Yes	❌ No
default	            ✅ Yes	✅ Yes	❌ No	  ❌ No
private	            ✅ Yes	❌ No	  ❌ No  	❌ No


##########################🔹 Q7: What is the purpose of a static block? When does it execute?
✅ A static block executes when the class is loaded into memory (before object creation).
📌 Use Case:
Initializing static variables
Setting up database connections
✔ Example:
class DatabaseConnection {
    static {
        System.out.println("Database Loaded"); // ✅ Executes when class is loaded
    }
}
public class Main {
    public static void main(String[] args) {
        DatabaseConnection db = new DatabaseConnection(); // ✅ Static block executes first
    }
}


##########################🔹 Q8: Can a static method access instance variables? Why or why not?
❌ No, a static method cannot access instance variables.
📌 Reason:
Static methods belong to the class, not to objects.
Instance variables belong to objects.
A static method doesn’t know which object’s instance variable to access.
✔ Example:
class Example {
    int a = 10; // Instance variable
    static void show() {
        // System.out.println(a); ❌ Error (Cannot access instance variable)
    }
}


##########################🔹 Q9: What are inner classes? Name the four types of inner classes in Java.
✅ Inner Class = A class inside another class

📌 4 Types of Inner Classes:
1️⃣ Member Inner Class → Regular class inside another class
2️⃣ Static Inner Class → Static nested class inside another class
3️⃣ Local Inner Class → Class inside a method
4️⃣ Anonymous Inner Class → Class without a name

✔ Example:
class Outer {
    class Inner { void display() { System.out.println("Member Inner Class"); } }
}


##########################🔹 Q10: What is an anonymous inner class? Give a real-world example where it's useful.
✅ Anonymous Inner Class = Inner class without a name
📌 Use Case: When you need a class only once (e.g., Event Handling).

✔ Example:

abstract class Animal {
    abstract void makeSound();
}
public class Main {
    public static void main(String[] args) {
        Animal obj = new Animal() { // Anonymous Inner Class
            void makeSound() { System.out.println("Meow!"); }
        };
        obj.makeSound();
    }
}
