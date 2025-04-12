// Task: Create a MobilePhone class with properties brand, price, and storage, and a method to display details. Then, create two objects for different mobile brands.

class MobilePhone {
    String brand;
    double price;
    int storage;

    void display() {
        System.out.println("Brand: " + brand + ", Price: $" + price + ", Storage: " + storage + "GB");
    }

    public static void main(String args[]) {
        MobilePhone nokia = new MobilePhone();
        nokia.brand = "Nokia";
        nokia.price = 15000;
        nokia.storage = 64;

        MobilePhone samsung = new MobilePhone();
        samsung.brand = "Samsung";
        samsung.price = 30000;
        samsung.storage = 128;

        nokia.display();
        samsung.display();
    }
}
