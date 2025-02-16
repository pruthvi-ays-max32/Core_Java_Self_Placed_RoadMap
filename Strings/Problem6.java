// 🔥 Quick Task
// ✅ Take a sentence input from the user and split it into words using both split() and StringTokenizer.

import java.util.Scanner;
import java.util.StringTokenizer;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a sentence: ");
    String str = sc.nextLine();
    String [] words = str.split(" ");
    StringTokenizer st = new StringTokenizer(str, " ");

    System.out.println("\nUsing split():");
    for(String word : words){
      System.out.println(word);
    }

     System.out.println("\nUsing StringTokenizer:");
    while(st.hasMoreTokens()){
      System.out.println(st.nextToken());
    }
  }
}
