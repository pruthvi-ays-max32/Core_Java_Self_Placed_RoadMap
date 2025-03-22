/*
📌 Task: Exception Handling with Multiple Catch Blocks
✅ Goal:
    Write a Java program that:
    Takes two numbers as input from the user.
    Performs division and prints the result.
    Use multiple catch blocks to handle:
    ArithmeticException if division by zero occurs.
    InputMismatchException if a non-integer is entered.
    Finally block should print "Execution Completed."
*/


import java.util.Scanner;
import java.util.InputMismatchException;
class Main {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    try{
      int a = sc.nextInt();
      int b = sc.nextInt();
      System.out.println(a/b);
    } catch(ArithmeticException e){
      System.out.println("Error: Cannot divide by zero.");
    } catch(InputMismatchException e){
      System.out.println("Error: Invalid input. Please enter integers.");
    }
    finally {
      System.out.println("Execution Completed");
      sc.close();
    }
  }
}
