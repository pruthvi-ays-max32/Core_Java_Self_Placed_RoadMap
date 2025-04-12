/*
🛠️ Task 1: Student Marks Register using HashMap
    📌 Requirements:
    Create a HashMap<String, Integer> to store student name and marks.
    Add 5 entries ("Amit" → 55, etc. with 1 duplicate name).
    Print all key-value pairs.
    Fetch marks of a specific student "Amit".
    Remove "Kalu" from the map.
    Print the final map and its size.
*/

import java.util.Map;
import java.util.HashMap;
class Main {
    public static void main(String[] args) {

      // create a Hashmap.
       Map<String, Integer> map = new HashMap<>();

      // add key-pair values in map.
       map.put("Amit", 45);
       map.put("Kalu", 50);
       map.put("Akki", 55);
       map.put("Shri", 49);
       map.put("Pruthvi", 60);

      // it will update value because key is duplicate.
       map.put("Amit", 55);
       
       System.out.println(map);

      // To get specific key's value
       System.out.println("Marks of Amit : " + map.get("Amit"));

      // it will check given key is present or not in map.
       if(map.containsKey("Kalu")){

         // it will remove this key-value pair using key.
           map.remove("Kalu");
           System.out.println("Kalu Founded and Removed..");
       } else{
           System.out.println("Kalu Not Found");
       }

      // to print map.
       System.out.println("Final Map : " + map);

      // to print map size.
       System.out.println("size of final map" + map.size());
       
    }
}
