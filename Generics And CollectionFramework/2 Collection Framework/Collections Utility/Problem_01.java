/*
 🎯 Task: Student Score Utilities using Collections Class
    🧠 Objective:
    Use Collections utility methods to manipulate a list of student scores.

    🛠 Requirements:
        1️⃣ Create a List<Integer> to store student scores.
        2️⃣ Add at least 8 random scores.
        3️⃣ Sort the scores in ascending order.
        4️⃣ Reverse the list to get descending order.
        5️⃣ Shuffle the scores.
        6️⃣ Find min and max scores.
        7️⃣ Count the frequency of a specific score.
        8️⃣ Print each result clearly.
*/

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Problem_01 {
  public static void main(String[] args) {
    List <Integer> list = new ArrayList<>();
    list.add(90);
    list.add(85);
    list.add(95);
    list.add(80);
    list.add(70);
    list.add(75);
    list.add(65);
    list.add(60);

    System.out.println(list);

    Collections.sort(list);
    System.out.println("Sorted Scores: " + list);

    Collections.reverse(list);
    System.out.println("Descending Order: " + list);

    Collections.shuffle(list);
    System.out.println("Shuffled Scores: " + list);

    int max = Collections.max(list);
    int min = Collections.min(list);
    System.out.println("Min Score: " + min + " | Max Score: " + max);

    int frequency = Collections.frequency(list, 65);
    System.out.println("Frequency of 65: " + frequency);

    for(Integer i : list){
      System.out.println(i);
    }
  }
}
