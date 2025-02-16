// 📌 Practice Task
// ✅ Take user input for a name, age, and salary
// ✅ Print the formatted output using String.format() and printf()

import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Name, Age, and Salary:");
    String name = sc.nextLine();
    int age = sc.nextInt();
    double salary = sc.nextDouble();

    System.out.printf("Name : %s | age : %d | salary : %.2f %n", name, age, salary);

    String formatedString = String.format("Name : %s | age : %d | salary : %.2f %n", name, age, salary);
    System.out.println(formatedString);
    
  }
}
