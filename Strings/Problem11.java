// 🔥 Next Task: Check if a string is a palindrome
/* 📌 Steps:
✅ Take a string input from the user.
✅ Remove any spaces (to check words like "madam" and "nurses run").
✅ Reverse the string.
✅ Compare the original and reversed strings.
✅ Print whether it's a Palindrome or not.

*/

import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String ogStr = sc.nextLine();
    String originalString = ogStr.replaceAll("\\s", "").toLowerCase();

    // Method 1 : using Normal Method.
     String rev = "";
    for (int i = originalString.length() - 1; i >= 0; i--) {
      rev += originalString.charAt(i);
    }

    // Method 2 : Using StringBuilder.
    // String rev = new StringBuilder(originalString).reverse().toString();

    if(rev.equals(originalString)){
      System.out.println("Given String is Palindrome.");
    } else{
      System.out.println("Given String is not a palindrome.");
    }
  }
}
