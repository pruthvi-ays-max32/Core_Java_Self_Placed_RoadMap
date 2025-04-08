/*
✅ 🎯 Task: Maintain Ordered Unique Items with LinkedHashSet

🛠 Requirements:
  1️⃣ Create a LinkedHashSet<String> to store names of fruits.
  2️⃣ Add 6 fruits (include some duplicates).
  3️⃣ Print the set to show insertion order is preserved and duplicates are not added.
  4️⃣ Check if "Mango" is present.
  5️⃣ Remove "Apple" if it exists.
  6️⃣ Print the final set and its size.
*/

import java.util.LinkedHashSet;
import java.util.Set;

class Main {
  public static void main(String  args[]){
    
    // 1️⃣ Create a LinkedHashSet<String> to store names of fruits.
    Set <String> set = new LinkedHashSet<>();

    // 2️⃣ Add 6 fruits (include some duplicates).
    set.add("Mango");
    set.add("Banana");
    set.add("Pineapple");
    set.add("Orange");
    set.add("Apple");
    set.add("Mango");
    
    // 3️⃣ Print the set to show insertion order is preserved and duplicates are not added.
    System.out.println(" LinkedHashSet : " + set);

    // 4️⃣ Check if "Mango" is present.
    System.out.println("Set Contains Mango ? " + set.contains("Mango"));

    // 5️⃣ Remove "Apple" if it exists.
    set.remove("Apple");

    // 6️⃣ Print the final set and its size.
    System.out.println(" Final Set : " + set + " Size of Set : " + set.size());
  }
}
