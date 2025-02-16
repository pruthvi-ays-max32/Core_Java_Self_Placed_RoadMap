// 🔥 Next Task: Count Vowels and Consonants in a String
/* 📌 Steps:
✅ Take a string input from the user.
✅ Convert it to lowercase (to avoid case sensitivity).
✅ Count the number of vowels (a, e, i, o, u).
✅ Count the number of consonants (excluding spaces and special characters).
✅ Print the vowel and consonant count separately.
*/

import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine().replaceAll("\\s", "").toLowerCase();
    int vowels = 0;
    int consonants = 0;

    for(int i=0; i<str.length(); i++){
      if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
        vowels++;
      } else {
        consonants++;
      }
    }

    System.out.printf("Vowels : %d | Consonants : %d %n", vowels, consonants);
  }
}
