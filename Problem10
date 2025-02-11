//  Find the factorial of a given number.

import java.util.Scanner;
class Problem10 {
  public static int factorial(int num){
    int fact = 1;
    if(num == 1|| num == 0){
        return 1;
    }
    else{
        while(num>0){
            fact *= num;
            num--;
        }
    }
    return fact;
  }

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int x = factorial(num);
    System.out.printf("The factorial of input number %d is %d", num, x);
    
  }
}
