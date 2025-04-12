// Create a Java program where:

// 1️⃣ Create an interface Animal with a method sound().
// 2️⃣ Create another interface Eatable with a method eat().
// 3️⃣ Create a class Dog that implements both interfaces and provides implementations.
// 4️⃣ Create a Main class to test the functionality.

interface Animal {
  void sound();
}

interface Eatable{
  void eat();
}

class Dog implements Eatable, Animal {
  public void sound(){
    System.out.println("Dog is barking ...");
  }
  public void eat(){
    System.out.println("Dog can eat");
  }
}

class Main {
  public static void main(String args[]){
    Dog tommy = new Dog();
    tommy.sound();
    tommy.eat();
  }
}
