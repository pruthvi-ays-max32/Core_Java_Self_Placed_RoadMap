// ✅ Task 3: Static Block Execution Order
// 🔹 Create a DatabaseConnection class with a static block.
// 🔹 Print a message in the static block saying Database Loaded.
// 🔹 Create an object of DatabaseConnection and see the execution order.

class DatabaseConnection {
  static {
    System.out.println("Static Block: Database Loaded");
  }

  DatabaseConnection() {
    System.out.println("Constructor: Connection Established");
  }
}

class Main{
  public static void main(String args[]){
    DatabaseConnection db = new DatabaseConnection();
  }
}
