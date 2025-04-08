/* 
  📌 Task 3: Iteration using forEach() + Lambda
      ✅ Objective:
      Create an ArrayList of Strings.
      Add 5 items (e.g., fruits).
      Use a lambda expression to print each item using forEach().
      Add bonus: Print items whose length > 5.
*/


import java.util.ArrayList;
import java.util.List;

class Main {
  public static void main(String args[]){

    // Create an ArrayList of Strings.
    // Add 5 items (e.g., fruits).
    List <String> list = new ArrayList<>();
    list.add("Banana");
    list.add("Apple");
    list.add("Graphes");
    list.add("Anjeer");
    list.add("chickoo");

    // Use a lambda expression to print each item using forEach().
    list.forEach(fruit-> System.out.print(fruit + " "));

    // Print items whose length > 5.
    list.forEach((fruit)->{
      if(fruit.length()>5){
        System.out.println(fruit);
      }
    });
  }
}
