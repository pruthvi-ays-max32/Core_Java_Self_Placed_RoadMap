/*
  🎯 Quick Practice Task 2:
🔹 Create a 2D array (3x3).
🔹 Fill it with values from the user.
🔹 Print the matrix using a nested for loop.

*/

import java.util.Scanner;

class Main{
  public static void main(String args []){
    int [][] arr = new int [3][3];
    try( Scanner sc = new Scanner(System.in)){
      for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
          arr[i][j] = sc.nextInt();
        }
      }

      // printing the matrix using for loop
      for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
          System.out.print(arr[i][j] + " ");
        }
        System.out.println();
      }
    } catch (InputMismatchException e) {
          System.out.println("Error: Please enter a valid integer index.");
    } catch (Exception e){
      System.out.println("An unexpected error occurred: " + e.getMessage());
    } finally {
      System.out.println("Execution Completed.");
    }
  }
}
