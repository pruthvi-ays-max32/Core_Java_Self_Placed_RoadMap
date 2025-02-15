// 🔹 💡 Quick Task:
// ✅ Take two strings from the user and compare them using all three methods.


class Main{
  public static void main(String args[]){
    String str1 = "Hello";
    String str2 = "hello";

    // using ==
    System.out.println(str1 == str2);

    // using .equals()
    System.out.println(str1.equals(str2));
    System.out.println(str1.equalsIgnoreCase(str2));

    // using compareTo
    System.out.println(str1.compareTo(str2));
  }
}
