/*
  🎯 Next Task: Custom Exception Creation
    📌 Task Objective:
    ✅ Create a custom exception class named InvalidAgeException.
    ✅ Throw this exception if the age entered is negative or greater than 120.
    ✅ Catch and handle the exception in main().
    
    ⚡️ Steps to Follow:
    Create a class InvalidAgeException that extends Exception.
    
    Add a constructor to accept and pass the error message.
    
    Modify the checkAge(int age) method to throw this exception.
    
    Handle the exception in the main() method.
*/


public class InvalidAgeException extends Exception {
  public InvalidAgeException(String msg){
    super(msg);
  }
}


import java.util.Scanner;

class Main{
  public static void main(String args []){
    
    try(Scanner sc = new Scanner(System.in)){
        int age = sc.nextInt();
        checkAge(age); 
    }  catch (InputMismatchException e){
          System.out.println("Error: Please enter a valid integer index.");
          sc.next();
      } catch (InvalidAgeException e){
         System.out.println("Error: " + e.getMessage());
      } catch (Exception e){
           System.out.println("Error: " + e.getMessage());
      } finally {
           System.out.println("completed successfully...");
      }
  }

  public static void checkAge(int age) throws InvalidAgeException {
    if(age < 0 || age > 120 ) {
        throw new InvalidAgeException("Age must be between 0 to 120 years old.");
      }
  }
}

