🔹 Q1: What is the difference between abstract class and interface in Java?
-> we can have constructor of abstract class but don't for Interface.
-> we can have concrete + abstract methods in abstract class but in interface we have methods which are by default public and abstract thanks to Java 8 because now interface can have default and static methods also.
-> abstract class provides partial abstraction while interface provides 100% abstraction.
-> we can't extends more than one class but can implements one or more interface to achieve multiple inheritance.
-> interface defines contract which all implemented classes have to follow it. but abstraction provides some common methods and some methods to implement to child class.

🔹 Q2: Can we create an object of an abstract class? If not, how can we use it?
-> No, we can't create object of an abstract class. if we wanted to access the properties and methods of abstract class then we need to create object of child of abstract class (who extends the abstract class.). By creating object of that class we can access the abstract class methods and properties.

🔹 Q3: What are default methods in interfaces? How do they work?
-> Suppose, we have an interface which is implemented by 100 of classes and now we wanted to add one method to interface then logically we have to implement that method inside all those 100 classes. so java 8 onwards to solve this problem they introduced Default methods in interfaces which can have implementation body inside the interface to overcome this problem.

🔹 Q4: Can an abstract class have a constructor? Why or why not?
-> Yes, abstract class has a constructor becasue it can have variables, so to initialize those variables we need constructor. and when we create object of child class then the constructor of child class gets called then we just need to add first line of child constructor to super() so it calls the constructor of parent before its constructor.

🔹 Q5: What is the difference between static methods in interfaces and static methods in classes?
-> In classes, for calling static method we don't need to create object of that class but in interface its not possible to create an object. both the methods can be called using Classname and interface name.
but you provide me cleared answer i am still confused about my answerr.

🔹 Q6: Explain access modifiers in Java and where they can be applied.
-> Access Modifiers in java is used to retrict the access of properties and methods. There are 4 types of access modifiers in java. 1. public 2. private 3. protected 4. default , public is less restrected between above all and private is more restrective. they can be applied to class, variable, methods etc. 

🔹 Q7: What is the purpose of a static block? When does it execute?
-> Static block executes when class gets loaded even before the constructor gets called. it is used to perform some tasks before our application gets started like database connection etc.

🔹 Q8: Can a static method access instance variables? Why or why not?
-> No Static methods can't access instance variables. because for instance variables associated with instances and static methods associated with class.

🔹 Q9: What are inner classes? Name the four types of inner classes in Java.
-> Inner classes defined as classes inside the class. 4 types are 1. Anonymous inner class 2. static inner class 3. member inner class/ non-static inner class 4. LocalInner Class

🔹 Q10: What is an anonymous inner class? Give a real-world example where it's useful.
-> a inner class which doesn't have its name. it is used for quick implementation. mostly used with interfaces and abstract classes. 
