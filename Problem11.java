// Swap two numbers without using third variable.

import java.util.Scanner;
class Problem11 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the two numbers");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    System.out.printf("Before swap %d %d %n", num1, num2);
    num1 = num1 + num2;
    num2 = num1 - num2;
    num1 = num1 - num2;
    System.out.printf("After swap %d %d", num1, num2);
  }
}
