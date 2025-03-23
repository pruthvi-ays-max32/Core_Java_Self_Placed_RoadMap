/*
🎯 Task 2: Search and Sort Operations in Array ✅ Objective: 1. Search for an element in an array using Linear Search. 2. Sort the array in ascending order.

🚀 **Step 1: Search Operation**
📌 **Task:**
    - Take an array as input from the user.
    - Ask the user for a number to search.
    - Implement Linear Search to find the element.
    - Print whether the element is found or not.

🚀 **Step 2: Sort Operation**
📌 **Task:**
    - Sort the array in ascending order.
    - Print the sorted array.
*/


import java.util.Scanner;

class Main{
  public static void main(String args []){
      Scanner sc = new Scanner(System.in);
      int [] arr = new int [5];
    
    // Taking input
      System.out.println("Enter 5 integer elements of the array:");
      for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
      }


    // Linear Search
      System.out.println("Enter an integer elements to search in the array:");
      int x = sc.nextInt();
      boolean found = false;
    
      for (int i = 0; i < arr.length; i++) {
         if(arr[i]==x){
           found = true;
           System.out.printf("Element %d found at index %d", x, i);
           break;
         }
      }

    if(!found){
      System.out.printf("Element %d not present in given array.", x);
    }


    // Sorting
    for(int i=0; i<arr.length-1; i++){
      for(int j=0; j<arr.length-i-1; j++){
        if(arr[j+1]<arr[j]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }

    // Print Sorted Array
    System.out.println("Sorted Array (Ascending Order):");
    for(int i : arr){
      System.out.print(i + " ");
    }

    sc.close();

  }
}
