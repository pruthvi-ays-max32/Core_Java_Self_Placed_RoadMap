// Write a Java program to find the sum of digits of a given number.

import java.util.Scanner;

class Problem8 {

  public static int sumOfDigits(int x){
    int og = x;
    int sum = 0;
    while(og>0){
      int digit = og % 10;
      sum += digit;
      og = og/10;
    }
    return sum;
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number ");
    int num = sc.nextInt();
    int x = sumOfDigits(num);
    System.out.printf("The sum of digits of give number will be %d", x);
    
  }
}
