// Count the number of digits in a number.

import java.util.Scanner;
class Problem9 {

  public static int noOfDigits(int num){
    int og = num;
    int count = 0;
    while(og>0){
      count++;
      og /= 10;
    }
    return count;
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number ");
    int num = sc.nextInt();
    int x = noOfDigits(num);
    System.out.printf("The No of digits in input number %d is %d", num, x);
    
  }
}
