// 🔹 Practice Task: Convert a given string into a character array and print each character separately.

// Here’s what you’ll do:
// ✅ Take a string input from the user.
// ✅ Convert it into a char array.
// ✅ Print each character one by one.

import java.util.Scanner;
class Main {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    char [] array = str.toCharArray();

    for(char ch : array){
      System.out.println(ch);
    }
  }
}
