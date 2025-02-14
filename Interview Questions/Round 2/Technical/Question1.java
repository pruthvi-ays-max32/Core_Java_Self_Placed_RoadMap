// 🔹 Q1 : Write a Java program where an interface "Vehicle" has a method drive(), and two classes (Car & Bike) implement this interface differently.

interface Vehicle {
  void drive();
}

class Bike implements Vehicle {
  public void drive(){
    System.out.println("Bike is running on the road");
  }
}

class Car implements Vehicle {
  public void drive(){
    System.out.println("Car is running on the road");
  }
}

public class Main {
  public static void main(String args[]){
    Car c1 = new Car();
    Bike b1 = new Bike();

    c1.drive();
    b1.drive();
  }
}
