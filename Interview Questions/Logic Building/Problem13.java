// Given Number is palindrom or not.

import java.util.Scanner;

class Problem13 {     

  public static boolean isPalindrom(int num){
    int og = num;
    int rev = 0;

    while(num>0){
      int x = num % 10;
      rev = rev * 10 + x;
      num = num/10;
    }

    if(rev == og){ return true;}
    else {return false;}
  }

  
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int num = sc.nextInt();
    boolean x = isPalindrom(num);
    if(x){
      System.out.printf("%d is a palindrome. ", num);
    }
    else{
      System.out.printf("%d is not a palindrome. ", num);
    }
  }
}
