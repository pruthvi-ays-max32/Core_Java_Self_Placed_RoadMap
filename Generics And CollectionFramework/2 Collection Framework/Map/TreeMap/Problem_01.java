/*
    ✅ 🎯 Task: Product Price Catalog using TreeMap
    
    🛠 Requirements:
      1️⃣ Create a TreeMap<Integer, String> to store product price (key) and name (value).
      2️⃣ Add 6 products with different prices (use at least one duplicate price to test overwriting).
      3️⃣ Print the map to show that entries are automatically sorted by price.
      4️⃣ Fetch and print the product with price = 299.
      5️⃣ Remove a product using a specific price key.
      6️⃣ Print the final map and its size.
      7️⃣ Print lowest and highest priced products
*/

import java.util.*;

public class Problem_01 {
  public static void main(String[] args) {
    // 1️⃣ Create a TreeMap<Integer, String> to store product price (key) and name
    // (value).
    Map<Integer, String> product = new TreeMap<>();

    // 2️⃣ Add 6 products with different prices (use at least one duplicate price to
    // test overwriting).
    product.put(199, "P1");
    product.put(399, "P2");
    product.put(299, "P3");
    product.put(399, "P4");
    product.put(699, "P5");
    product.put(599, "P6");

    // 3️⃣ Print the map to show that entries are automatically sorted by price.
    System.out.println("Product Price Catalog:");
    for (Map.Entry<Integer, String> entry : product.entrySet()) {
      System.out.println("Product : " + entry.getValue() + " | Price : " + entry.getKey());
    }

    System.out.println("-----------------------");

    // 4️⃣ Fetch and print the product with price = 299.
    if (product.containsKey(299)) {
      System.out.println("Product with price 299 is : " + product.get(299));
    } else {
      System.out.println("Product not found with given key.");
    }

    System.out.println("-----------------------");

    // 5️⃣ Remove a product using a specific price key.
    if (product.containsKey(599)) {
      product.remove(599);
      System.out.println("Product with price 599 is removed.");
    } else {
      System.out.println("Product not found with given key.");
    }

    System.out.println("-----------------------");

    // 6️⃣ Print the final map and its size.
    System.out.println("Final Product Price Catalog:");
    for (Map.Entry<Integer, String> entry : product.entrySet()) {
      System.out.println("Product : " + entry.getValue() + " | Price : " + entry.getKey());
    }
    System.out.println("Size of Product Map : " + product.size());

    // 7️⃣ Print lowest and highest priced products
    Map.Entry<Integer, String> lowest = ((TreeMap<Integer, String>) product).firstEntry();
    Map.Entry<Integer, String> highest = ((TreeMap<Integer, String>) product).lastEntry();

    if (lowest != null && highest != null) {
      System.out.println("🔽 Lowest Price Product: " + lowest.getKey() + " -> " + lowest.getValue());
      System.out.println("🔼 Highest Price Product: " + highest.getKey() + " -> " + highest.getValue());
    } else {
      System.out.println("⚠️ Product catalog is empty.");
    }

  }
}
