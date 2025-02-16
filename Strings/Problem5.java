// ✅ Quick Practice Task
//🔹 Write a Java program to:
// Create strings using both new and "" notation.
// Check memory locations using ==.
// Use .intern() to move a heap string to SCP.
// Print results.

class Main{
  public static void main(String args[]){
    String str1 = new String("Hello");
    String str2 = "Hello";
    String str3 = str1.intern();

    System.out.println(str1 == str2);
    System.out.println(str1 == str3);
    System.out.println(str2==str3);
  }
}


// output 

/*
false  // str1 is in heap, str2 is in SCP (Different memory locations)
false  // str1 (heap) and str3 (SCP) are different
true   // str2 and str3 both point to SCP (Same reference)
*/
