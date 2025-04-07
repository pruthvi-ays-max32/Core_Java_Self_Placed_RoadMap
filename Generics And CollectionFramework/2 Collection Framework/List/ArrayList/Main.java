/*
First Task
🔹 Create an ArrayList<Integer> and perform the following operations: 
1️⃣ Add 5 numbers.
2️⃣ Print all elements.
3️⃣ Remove an element at index 2.
4️⃣ Print the updated list.
*/


import java.util.ArrayList;
import java.util.List;
class Main {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        // 1️⃣ Add 5 numbers.
        list.add(34);
        list.add(23);
        list.add(1);
        list.add(54);
        list.add(10);
        
        // 2️⃣ Print complete list.
        System.out.println("Complete List : " + list);
        
        // Print each element seperately.
        for(int i=0; i<list.size(); i++){
            System.out.println("Element at index " + i + " is " + list.get(i));
        }
        
        // 3️⃣ Remove an element at index 2.
        list.remove(2);
        
        // 4️⃣ Print the updated list.
        System.out.println("Updated List : " + list);
    }
}
