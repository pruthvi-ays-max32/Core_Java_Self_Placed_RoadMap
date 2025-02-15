// ✅ Quick Task (Final Practice)
// 🔹 Take two strings from the user and compare them using all three methods (==, .equals(), .compareTo()).

import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 2 strings to compare " );
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();

    // using ==
    System.out.println(str1 == str2);

    // using .equals()
    System.out.println(str1.equals(str2));
    System.out.println(str1.equalsIgnoreCase(str2));

    // using compareTo
    System.out.println(str1.compareTo(str2));
  }
}
