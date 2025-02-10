// Write a java program which takes input from user and identify is it positive or negative number.

import java.util.Scanner;
class Program1 {
    public static void main(String args []){
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      if(x==0){
        System.out.println("You have Enterd the Number 0 ");
      }
      else if(x>0){
        System.out.println("You have Entered Positive Number");
      }
      else{
        System.out.println("You have Entered Negative Number");
      }
    }
}
