/*
 🎯 Task: Top Scores Tracker using PriorityQueue (Min-Heap)
    🛠 Requirements:
      1️⃣ Create a PriorityQueue<Integer>
      2️⃣ Add 7 scores
      3️⃣ Print all elements
      4️⃣ Fetch the smallest score using .peek()
      5️⃣ Remove the smallest score using .poll()
      6️⃣ Print updated queue and size
*/

import java.util.PriorityQueue;
import java.util.Queue;

public class Problem_02 {
    public static void main(String[] args) {
        // 1️⃣ Create a PriorityQueue<Integer>
        Queue<Integer> scores = new PriorityQueue<>();

        // 2️⃣ Add 7 scores
        scores.offer(340);
        scores.offer(30);
        scores.offer(80);
        scores.offer(70);
        scores.offer(100);
        scores.offer(90);
        scores.offer(40);

        // 3️⃣ Print all scores (note: not sorted order when printed)
        System.out.println("Original Queue (not sorted visually): " + scores);

        // 4️⃣ Peek the smallest score
        System.out.println("Smallest Score (peek): " + scores.peek());

        // 5️⃣ Remove the smallest score
        scores.poll(); // Removes the head (smallest value)
        System.out.println("After removing smallest (poll): " + scores);

        // 6️⃣ Print updated queue and its size
        System.out.println("Updated Queue Size: " + scores.size());
    }
}
