import java.util.HashSet;
import java.util.Set;

class Main {
  public static void main(String[] args) {
    // 1️⃣ Create a HashSet
    Set<String> fruits = new HashSet<>();

    // 2️⃣ Add elements
    fruits.add("Mango");
    fruits.add("Banana");
    fruits.add("Apple");
    fruits.add("Banana");  // Duplicate - won't be added

    // 3️⃣ Print the Set
    System.out.println("Fruits Set: " + fruits);  // Unordered

    // 4️⃣ Check if element exists
    System.out.println("Contains Apple? " + fruits.contains("Apple"));

    // 5️⃣ Remove an element
    fruits.remove("Banana");

    // 6️⃣ Iterate over Set
    for(String fruit : fruits){
      System.out.println("Fruit: " + fruit);
    }

    // 7️⃣ Size
    System.out.println("Set Size: " + fruits.size());
  }
}
