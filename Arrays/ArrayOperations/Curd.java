/*
  🎯 Task 1: Basic Array CRUD Operations
    ✅ Objective:
        Create an array.
        Add/Update/Delete elements dynamically.
        Print the updated array.
    
    🚀 Steps: Array Creation and Basic Operations
    📌 Task:
        Create an array of size 5.
        Add elements at specific positions.
        Update element at index 2.
        Delete an element at index 3.
        Print final array.
*/


import java.util.Scanner;

class Main{
  public static void main(String args []){
    Scanner sc = new Scanner(System.in);
    int [] arr = new int[5];
    
    // Taking input
    System.out.println("Enter 5 integer elements of the array:");
    
    for(int i=0; i<arr.length; i++){
      arr[i] = sc.nextInt();
    }

    // update element at index 2
    System.out.println("Enter new value for index 2:");
    arr[2] = sc.nextInt();;

   // Deleting element at index 3
    System.out.println("Deleting element at index 3...");
    for (int i = 3; i < 4; i++) {
      arr[i] = arr[i + 1];
    }
    arr[4] = 0; // Reset last element after shift

    // Print final array.
    for(int i=0; i<arr.length; i++){
      System.out.println(arr[i]);
    }

    sc.close();
  }
}

