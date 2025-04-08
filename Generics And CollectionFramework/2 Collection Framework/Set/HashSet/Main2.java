/*
  🎯 Task: Student ID Filter using HashSet
    ✅ Objective:
    Take student IDs as input.
    Ensure no duplicate IDs are stored.
    Print all unique IDs and perform basic set operations.

  🛠️ Requirements:
    1️⃣ Create a HashSet<Integer> for student IDs.
    2️⃣ Add 6 student IDs (some should be duplicates).
    3️⃣ Print all unique IDs.
    4️⃣ Check if a specific ID (e.g., 101) exists.
    5️⃣ Remove an ID.
    6️⃣ Print the final set and its size.
*/

import java.util.HashSet;
import java.util.Set;

class Main {
  public static void main(String args[]){
    //1️⃣ Create a HashSet<Integer> for student IDs.
    Set <Integer> studentIds = new HashSet<>();
    
    // 2️⃣ Add 6 student IDs (some should be duplicates).
    studentIds.add(2);
    studentIds.add(21);
    studentIds.add(12);
    studentIds.add(32);
    studentIds.add(22);
    studentIds.add(2);

    // 3️⃣ Print all unique IDs.
    System.out.println("All Unique Ids : " + studentIds);

    // 4️⃣ Check if a specific ID (e.g., 101) exists.
    System.out.println("Student Id 21 Is exits : " + studentIds.contains(21));

    // 5️⃣ Remove an ID.
    studentIds.remove(Integer.valueOf(2));

    // 6️⃣ Print the final set and its size.
    System.out.println("Updated Set is " + studentIds);
    System.out.println("Size of updated Set is " + studentIds.size());
    
  }
}
