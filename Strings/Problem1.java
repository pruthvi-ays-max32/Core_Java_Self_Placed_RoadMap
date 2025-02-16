/* 📌 Quick Practice Task
🔹 Write a Java program to:
✅ Take a string input from the user.
✅ Convert it to uppercase.
✅ Check if it contains "JAVA".
✅ Replace "JAVA" with "PYTHON".
*/

import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner sc = new  Scanner(System.in);
    System.out.println("Enter the String : ");
    String str = sc.nextLine();
    System.out.println("Before converting in uppercase : "+str);
    str = str.toUpperCase();
    System.out.println("After converting in uppercase : "+str);
    System.out.println("String contains \"JAVA\" : " + str.contains("JAVA"));
    str = str.replace("JAVA", "PYTHON");
    System.out.println("after replacing 'java' with 'python' : "+ str);
  }
}
