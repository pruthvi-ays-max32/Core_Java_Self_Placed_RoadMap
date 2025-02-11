// 💡 Task:
// 1️⃣ Create a Car class with:
// A static variable wheels = 4 (shared by all cars).
// Instance variables: brand and price.
// 2️⃣ Create a static method showWheels() to print the number of wheels.
// 3️⃣ Create two Car objects and display their details.


class Car {
  static int wheels = 4;
  String brand;
  long price;

  Car(String b, long p){
    brand = b;
    price = p;
  }

  static void showWheels(){
    System.out.println("No of Wheels of car is " + wheels);
  }

  void display(){
    System.out.printf("The Brand of Car is %s | The Price of Car is ₹ %d %n", brand, price);
  }

  public static void main(String args[]){
    Car c1 = new Car("Enova", 2000000);
    Car c2 = new Car("Creta" , 4000000);

    Car.showWheels();
    c1.display();
    c2.display();
  }
}
