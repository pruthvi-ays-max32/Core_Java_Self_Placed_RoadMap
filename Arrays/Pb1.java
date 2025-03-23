/*
    🎯 Quick Practice Task 1:
🔹 Create an array of size 5.
🔹 Take 5 integer inputs from the user.
🔹 Print the array using both for loop and for-each loop.
*/


import java.util.Scanner;

class Main{
  public static void main(String args []){
    try(Scanner sc = new Scanner(System.in)){
        int [] arr = new int [5];
        System.out.println("Enter 5 integer elements of array :");
        for(int i=0; i<arr.length; i++){
          arr[i] = sc.nextInt();
        }
    
        // printing using for loop
       System.out.println("Array elements using for loop:");
        for(int i=0; i<arr.length; i++){
          System.out.println(arr[i]);
        }
    
        // printing using for each loop
       System.out.println("Array elements using for-each loop:");
        for(int i : arr){
           System.out.println(i);
        }
    } catch (InputMismatchException e) {
          System.out.println("Error: Please enter a valid integer index.");
          sc.nextLine();
    } catch (Exception e){
      System.out.println("An unexpected error occurred: " + e.getMessage());
    } finally {
      System.out.println("Execution Completed.");
    }
  }
}
