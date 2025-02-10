// Check if a given number is prime or not.

import java.util.Scanner;

class Main {

  public static boolean isPrime(int x){
    int count = 0;

    for(int i=2; i<(x/2); i++){
      if(x%i==0){
        count++;
      }
    }

    if(count == 0){
      return true;
    }
    else{
      return false;
    }
  }
  
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number to find it is prime or not");
    int num = sc.nextInt();

    boolean x = isPrime(num);
    if(x){
      System.out.println("Given Number is Prime");
    }
    else{
      System.out.println("Given Number is Not Prime");
    }
  }
}
