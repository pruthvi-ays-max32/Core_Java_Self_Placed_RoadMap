//🔹 Q 4: Write a Java program demonstrating multiple inheritance using interfaces (Example: A class implementing "Flyable" and "Swimmable").

interface Flyable {
  void fly();
  void run();
}

interface Swimmable {
  void swim();
  void run();
}

class Animal implements Swimmable, Flyable {
  public void run(){
    System.out.println("Some animals are running");
  }
  public void swim(){
    System.out.println("Some animals are Swimming");
  }
   public void fly(){
    System.out.println("Some animals are fly.");
  }
}

public class Main{
  public static void main(String args []){
    Animal ani = new Animal();
    ani.fly();
    ani.swim();
    ani.run();
  }
}
