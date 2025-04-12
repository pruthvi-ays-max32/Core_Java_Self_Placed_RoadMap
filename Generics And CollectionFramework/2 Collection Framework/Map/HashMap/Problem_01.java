/*
🛠️ Task 1: Student Marks Register using HashMap
    🛠️ Requirements:
1️⃣ Create a Map<String, List<String>> to store student names and their subjects.
2️⃣ Add 3 students with 2–3 subjects each.
3️⃣ Print all students and their subjects in a clean format.
4️⃣ Add one more subject to a specific student (e.g., "Amit").
5️⃣ Remove a subject from another student.
6️⃣ Print the final map clearly with formatting.
*/

import java.util.*;

class Problem_01 {
  public static void main(String[] args) {

    // 1️⃣ Create a Map<String, List<String>> to store student names and their subjects.
    Map<String, List<String>> map = new HashMap<>();

    // 2️⃣ Add 5 students with 2–3 subjects each.
    map.put("Shri", new ArrayList<>(Arrays.asList("Java", "React")));
    map.put("Kalu", new ArrayList<>(Arrays.asList("Database", "React", "TechSupport")));
    map.put("Akki", new ArrayList<>(Arrays.asList("React", "MySQL")));
    map.put("Pruthvi", new ArrayList<>(Arrays.asList("Java", "React", "MySQL")));
    map.put("Shri", new ArrayList<>(Arrays.asList("React", "Database")));

    // 3️⃣ Print all students and their subjects in a clean format.
    System.out.println("Initial Values : ");
    for (Map.Entry<String, List<String>> entry : map.entrySet()) {
      System.out.print(entry.getKey() + " -> | ");
      for (String sub : entry.getValue()) {
        System.out.print(sub + " | ");
      }
      System.out.println();
    }

    System.out.println("-----------------------");

    // 4️⃣ Add one more subject to a specific student (e.g., "Shri").
    if (map.containsKey("Shri")) {
      map.get("Shri").add("NodeJs");
    }

    // 5️⃣ Remove a subject MySQL from Akki.
    map.get("Akki").remove("MySQL");

    // 6️⃣ Print the final map clearly with formatting.
    System.out.println("Final Values : ");
    for (Map.Entry<String, List<String>> entry : map.entrySet()) {
      System.out.print(entry.getKey() + " -> | ");
      for (String sub : entry.getValue()) {
        System.out.print(sub + " | ");
      }
      System.out.println();
    }
  }
}