/*
✅ 🎯 Task: Unique Sorted City Names using TreeSet
📌 Objective:
Use TreeSet to store city names and ensure automatic sorting and no duplicates.

    🛠 Requirements:
    1️⃣ Create a TreeSet<String> to store names of cities.
    2️⃣ Add 7 city names (include some duplicates).
    3️⃣ Print the set to confirm that:
    It’s sorted in natural order (A-Z). 
    Duplicates are automatically removed.
    4️⃣ Check if "Delhi" is present.
    5️⃣ Remove "Mumbai" if it exists.
    6️⃣ Print the final set and its size.
*/

import java.util.Set;
import java.util.TreeSet;

class Main {
  public static void main(String args[]){
    // 1️⃣ Create a TreeSet<String> to store names of cities.
    Set <String> cities = new TreeSet<>();
    // 2️⃣ Add 7 city names (include some duplicates).
    cities.add("Pune");
    cities.add("Mumbai");
    cities.add("Kolhapur");
    cities.add("Delhi");
    cities.add("Chennai");
    cities.add("Mumbai");
    cities.add("Kolhapur");

    /* 
    3️⃣ Print the set to confirm that:
        - It’s sorted in natural order (A-Z). 
        - Duplicates are automatically removed.
    */

    System.out.println("Lists of City : " + cities);

    //  4️⃣ Check if "Delhi" is present.
    System.out.println("Delhi Contains ? " + cities.contains("Delhi"));

    // 5️⃣ Remove "Mumbai" if it exists.
    if(cities.contains("Mumbai")){
      cities.remove("Mumbai");
    } else{
      System.out.println("City Not Found");
    }

    // 6️⃣ Print the final set and its size.
    System.out.println("The Size of final Set : " + cities.size());
    System.out.println("The final Set : " + cities);
  }
}
