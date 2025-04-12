/*
✅ 🎯 Task: Employee Attendance Tracker using LinkedHashMap
🛠️ Requirements:
1️⃣ Create a LinkedHashMap<Integer, String> to store Employee ID and Name.
2️⃣ Add 5 employee entries (make sure one ID is added twice with a different name to test overwrite).
3️⃣ Print the full map to verify insertion order is preserved.
4️⃣ Fetch and print the name of a specific employee (e.g., ID = 103).
5️⃣ Remove an employee by ID (e.g., ID = 101).
6️⃣ Print the updated map and its size.


*/

import java.util.*;

class Problem_01 {
  public static void main(String[] args) {
    // 1️⃣ Create a LinkedHashMap<Integer, String> to store Employee ID and Name.
    Map<Integer, String> empTracker = new LinkedHashMap<>();
    // 2️⃣ Add 5 employee entries (make sure one ID is added twice with a different
    // name to test overwrite).
    empTracker.put(101, "Akanksha");
    empTracker.put(102, "Pruthvi");
    empTracker.put(103, "kalavati");
    empTracker.put(104, "Shri");
    // override index 3
    empTracker.put(103, "Hanumant");

    System.out.println("Initial Map Size : " + empTracker.size());

    // 3️⃣ Print the full map to verify insertion order is preserved.
    System.out.println("Initial Values : ");
    for (Map.Entry<Integer, String> entry : empTracker.entrySet()) {
      System.out.print(entry.getKey() + " -> ");
      System.out.println(entry.getValue());
    }

    System.out.println("-----------------------");

    // 4️⃣ Fetch and print the name of a specific employee (e.g., ID = 103).

    System.out.println("Employee Name of id 103 : " + empTracker.get(103));

    System.out.println("-----------------------");
    // 5️⃣ Remove an employee by ID (e.g., ID = 101).
    empTracker.remove(101);

    // 6️⃣ Print the updated map and its size.
    System.out.println("Updated Map : ");
    for (Map.Entry<Integer, String> entry : empTracker.entrySet()) {
      System.out.print(entry.getKey() + " -> ");
      System.out.println(entry.getValue());
    }

    System.out.println("Updated Map Size : " + empTracker.size());

  }
}
