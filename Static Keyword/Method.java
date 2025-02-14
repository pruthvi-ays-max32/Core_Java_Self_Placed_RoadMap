// ✅ Task 2: Static Method in Utility Class
// 🔹 Create a MathUtility class with a static method square(int x).
// 🔹 Call square(5) without creating an object and print the result.

class MathUtility {
  public static int square(int x){
    return x * x;
  }
}

class Main{
  public static void main(String args[]){
    System.out.println(MathUtility.square(5));
  }
}
