// 💡 Task:
// 1️⃣ Create a Multiply class with a method multiply().
// 2️⃣ Overload the multiply() method:
// Multiply two integers.
// Multiply three integers.
// Multiply two double values.
// 3️⃣ Call all three methods and print the results.


class Multiply {

  static int multiply (int a, int b){
    return a*b;
  }

  static int multiply(int a, int b, int c){
    return a*b*c;
  }

  static double multiply(double a, double b){
    return a*b;
  }

  public static void main(String args[]){
    int x = Multiply.multiply(2,3);
    int y = Multiply.multiply(8,10,10);
    double z = Multiply.multiply(2.3,4.2);

    System.out.printf("Multiplication results of all 3 are %d %d %.2f respectively.%n", x, y, z);
  }
}
