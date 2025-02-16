// 📌 Substring Extraction
// 🔹 Task: Take a string input and extract a substring using substring() method.
/*
Steps:
✅ Take a string from the user.
✅ Ask for the start and end index.
✅ Extract the substring and print it.
*/

import java.util.Scanner;
class Main {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string:");
    String str = sc.nextLine();

    System.out.println("Enter start index:");
    int start = sc.nextInt();
    System.out.println("Enter end index:");
    int end = sc.nextInt();

    String substring = str.substring(start, end);
    System.out.println("Extracted substring: " + substring);
  }
}
