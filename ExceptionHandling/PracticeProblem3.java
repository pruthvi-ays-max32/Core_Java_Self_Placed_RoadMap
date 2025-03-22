/*
    🎯 Task Objective:
      ✅ Take an array of integers as input from the user.
      ✅ Handle the following exceptions:     
      InputMismatchException: If the user enters a non-integer value.      
      ArrayIndexOutOfBoundsException: If the user tries to access an invalid array index.     
      ✅ Use try-catch to manage these exceptions effectively.
      ✅ Print a message to indicate successful array input.
*/

import java.util.Scanner;
import java.util.InputMismatchException; 
import java.util.ArrayIndexOutOfBoundsException;
class Main{
  public static void main(String args []){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int size = sc.nextInt();
    int arr [] = new int [size];
    System.out.println("Enter " + size + " integers :");
    try{
      for(int i=0; i<size; i++){
        arr[i] = sc.nextInt();
      }
      System.out.println("Enter the index you want to access:");
      int ind = sc.nextInt();
      System.out.println("Element at index " + ind + ": " + arr[ind]);  
    } catch (ArrayIndexOutOfBoundsException e){
      System.out.println("Error: Tries to access an invalid array index");
    } catch (InputMismatchException e){
      System.out.println("Error: Invalid input! Please enter integers only.");
      sc.nextLine();
    } catch (Exception e){
      System.out.println("Exception occured...");
    } finally {
      sc.close();
      System.out.println("Execution Completed");
    }
  }
}

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// chatgpt solution 

/*
    import java.util.Scanner;
import java.util.InputMismatchException;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    
    int size = 0;
    try {
      size = sc.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("Error: Please enter a valid integer for array size.");
      return; // Exit if size is invalid
    }

    int arr[] = new int[size];
    System.out.println("Enter " + size + " integers:");

    for (int i = 0; i < size; i++) {
      try {
        arr[i] = sc.nextInt();
      } catch (InputMismatchException e) {
        System.out.println("Error: Invalid input. Enter a valid integer.");
        sc.next(); // Consume invalid input
        i--; // Retry the same index
      }
    }

    try {
      System.out.println("Enter the index you want to access:");
      int ind = sc.nextInt();
      System.out.println("Element at index " + ind + ": " + arr[ind]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Error: Tries to access an invalid array index.");
    } catch (InputMismatchException e) {
      System.out.println("Error: Please enter a valid integer for the index.");
    } catch (Exception e) {
      System.out.println("An unexpected exception occurred.");
    } finally {
      sc.close();
      System.out.println("Execution Completed.");
    }
  }
}

*/
