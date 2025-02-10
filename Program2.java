// Basic calculator for operations on integer numbers. (ASMD)

import java.util.Scanner;

class Program2 {
  public static void main(String args []){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter Integer Numbers to be calculated ");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    System.out.println("Enter 1 for addition 2 for subtraction 3 for multiplication and 4 for division " );
    int op = sc.nextInt();
    switch(op){
      case 1 : System.out.println("The result is : " + (num1+num2));
        break;
      case 2 : System.out.println("The result is : " + (num1 - num2));
        break;
      case 3 : System.out.println("The result is : " + (num1 * num2) ) ;
        break;
      case 4 : System.out.println("The result is : " + (num1 / num2) );
        break;
      default : System.out.println("Invalid Operation Number ");
    }
  }
}
