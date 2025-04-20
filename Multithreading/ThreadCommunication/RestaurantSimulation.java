class FoodTable {
  boolean foodAvailable = false;

  // Chef puts food
  synchronized void produce(String chefName) {
      while (foodAvailable) {
          try {
              wait(); // Wait if food is already on table
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }
      System.out.println(chefName + " cooked a meal 🍳");
      foodAvailable = true;
      notify(); // Notify the waiter
  }

  // Waiter serves food
  synchronized void consume(String waiterName) {
      while (!foodAvailable) {
          try {
              wait(); // Wait if no food available
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }
      System.out.println(waiterName + " served the meal 🍽️");
      foodAvailable = false;
      notify(); // Notify the chef
  }
}

class Chef extends Thread {
  FoodTable table;

  Chef(FoodTable table) {
      this.table = table;
  }

  public void run() {
      for (int i = 1; i <= 5; i++) {
          table.produce("Chef");
          try { Thread.sleep(1000); } catch (InterruptedException e) {}
      }
  }
}

class Waiter extends Thread {
  FoodTable table;

  Waiter(FoodTable table) {
      this.table = table;
  }

  public void run() {
      for (int i = 1; i <= 5; i++) {
          table.consume("Waiter");
          try { Thread.sleep(1500); } catch (InterruptedException e) {}
      }
  }
}

public class RestaurantSimulation {
  public static void main(String[] args) {
      FoodTable table = new FoodTable();
      new Chef(table).start();
      new Waiter(table).start();
  }
}
