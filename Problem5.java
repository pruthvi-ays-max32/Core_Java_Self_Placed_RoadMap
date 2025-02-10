//  Write a Java program to find the largest of three numbers using if-else.

import java.util.Scanner;

class Problem5{
  public static void main(String args []){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int fnum = sc.nextInt();
    System.out.print("Enter second number: ");
    int snum = sc.nextInt();
    System.out.print("Enter third number: ");
    int tnum = sc.nextInt();

    if(fnum == snum && snum == tnum){
      System.out.println("ALL Numbers are Equal");
    }
    else{
        if(fnum >= snum){
            if(fnum>=tnum){
            System.out.println(fnum + " Is greater Number.");
          } else{
            System.out.println(tnum + " Is greater Number.");
          }
        }
        else {
          if(snum >= tnum){
            System.out.println(snum + " Is greater Number.");
          }
          else{
            System.out.println(tnum + " Is greater Number.");
          }
        }
    }
  }
}
