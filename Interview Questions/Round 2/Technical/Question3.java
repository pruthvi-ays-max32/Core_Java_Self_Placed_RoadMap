// 🔹 Q 3: Create a static method in a utility class to check if a given number is prime.

import java.util.Scanner;
public class Main{
  public static void main(String args []){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number to check prime or not");
    int num = sc.nextInt();
    boolean isPrime = Prime.primeOrNot(num);

    if(isPrime){
      System.out.printf("%d is prime number.", num);
    }else {
      System.out.printf("%d is not prime number.", num);
    }
  }
}


class Prime {
  public static boolean primeOrNot (int num){
    int count = 0;
    for(int i=2; i<=num/2;i++){
      if(num%i==0){
        count++;
      }
    }

    if(count>0){
      return false;
    }else{
      return true;
    }
  } 
}
