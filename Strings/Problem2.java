/* 
✅ Task:
🔹 Write a Java program to: 1️⃣ Take a sentence input from the user.
2️⃣ Use StringBuffer to reverse the sentence.
3️⃣ Use StringBuilder to append "** - Learning Java**" at the end.

*/
import java.util.Scanner;
class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a sentence: ");
    String str = sc.nextLine();

    // ✅ Reverse using StringBuffer
    StringBuffer sb = new StringBuffer(str);
    System.out.println("Before reverse: " + sb);
    sb.reverse();
    System.out.println("After reverse: " + sb);

    // ✅ Append text using StringBuilder (After reversing)
    StringBuilder sb1 = new StringBuilder(sb);
    sb1.append(" **- Learning Java**");
    System.out.println("Final Output: " + sb1);
  }
}
