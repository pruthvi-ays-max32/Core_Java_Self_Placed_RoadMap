// 📌 Task: Perform some more operations:
//1️⃣ Add all elements of one list to another using addAll().
// 2️⃣ Sort the list using Collections.sort().
// 3️⃣ Check if a number (say 23) exists using contains().
// 4️⃣ Clear the list using clear().


import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
class Main {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add(34);
        list.add(23);
        list.add(1);
        list.add(54);
        list.add(10);
        
        
        // 1️⃣ Add all elements of one list to another using addAll()
        List <Integer> list2 = new ArrayList<>();
        list2.addAll(list);
        
        // Print complete list.
        System.out.println("Complete List : " + list2);
        
        // 2️⃣ Sort the list using Collections.sort().
        Collections.sort(list2);
        
         // Print complete list.
        System.out.println("Complete Sorted List : " + list2);
        
        // 3️⃣ Check if a number (say 23) exists using contains().
        if(list2.contains(23)){
            System.out.println("Yes 23 is present in list.");
        } else {
            System.out.println("Not Found");
        }
        
        // 4️⃣ Clear the list using clear().
        list2.clear();
        
        System.out.println(list2);
    }
}
