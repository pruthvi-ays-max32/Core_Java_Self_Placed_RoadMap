// Reverse a Number 

import java.util.Scanner;
class Problem12 {

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number to reverse: ");
    int num = sc.nextInt();
    int rev = 0;
    while(num>0){
        int x = num%10;
        rev = rev * 10 + x;
        num = num / 10;
    }
    System.out.println("Reversed Number is " + rev);
  }
}
