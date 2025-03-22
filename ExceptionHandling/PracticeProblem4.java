/*
  🎯 Next Task: Throw and Throws Demonstration
      📌 Task Objective:
      ✅ Create a method that takes an age as input.
      ✅ If age is below 18, throw an ArithmeticException with a custom message.
      ✅ Use throws in the method declaration to handle possible exceptions.
      ✅ Handle the exception in the main() method and print an appropriate message.
      
      🔥 Task Requirements:
      Create a method checkAge(int age) that checks the age.
      Throw an exception if the age is below 18.
      Catch and handle the exception in the main() method. 
      Print "Access Granted" if the age is valid.
*/

import java.util.Scanner;

class Main{
  public static void main(String args []){
    try(Scanner sc = new Scanner(System.in)){
      System.out.println("Enter your age:");
      int age = sc.nextInt();
      checkAge(age);
    } catch(ArithmeticException e){
        System.out.println(e.getMessage());
    } catch (Exception e) { 
      System.out.println("An unexpected error occurred: " + e.getMessage());
    }
  }

  public static void checkAge(int age) throws ArithmeticException{
    if(age<18){
      throw new ArithmeticException("Exception caught: Access denied - You must be at least 18 years old.");
    }
  }
}
