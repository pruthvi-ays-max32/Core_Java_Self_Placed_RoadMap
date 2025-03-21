/*
  🎯 Task Objective:
        Take two integers as input.
        Perform a division operation inside a nested try block.
        Handle these exceptions:
        InputMismatchException – If the user enters invalid input.
        ArithmeticException – If division by zero occurs.
        Add a general exception handler as a fallback.
*/

import java.util.Scanner;
import java.util.InputMismatchException; 

class Main {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    try{
      try{
        System.out.print("Enter first number: ");
        int a = sc.nextInt();   
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Result: " + (a / b));
      } catch (ArithmeticException e) {
          System.out.println("Error: Division by zero is not allowed.");
        } 
        catch (InputMismatchException e) {
          System.out.println("Error: Please enter valid integers.");
          sc.nextLine();
        } 
    } catch (Exception e){
      System.out.println("general exception handler");
    } finally {
      System.out.println("Execution Completed.");
      sc.close();
    }
  }
}
