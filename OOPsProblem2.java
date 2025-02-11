// 1️⃣ Create a Laptop class with properties brand, RAM (GB), and price.
// 2️⃣ Write a parameterized constructor to set these values when creating an object.
// 3️⃣ Write a method to display the laptop details.
// 4️⃣ Create two objects with different values and display their details.


class Laptop {
  String brand;
  int RAM;
  long price;

  Laptop(String b, int r, long p){
    brand = b;
    RAM = r;
    price = p;
  }

  void display(){
    System.out.printf("Brand of laptop %s | RAM is %d | price is %d %n", brand, RAM, price);
  }

  public static void main(String args[]){
    Laptop l1 = new Laptop("Lenovo", 8, 72000);
    Laptop l2 = new Laptop("Dell", 6, 56000);

    l1.display();
    l2.display();
  }
  
}
