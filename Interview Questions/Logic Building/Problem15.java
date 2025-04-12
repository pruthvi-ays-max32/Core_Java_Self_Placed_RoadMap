// LCM and GCD

import java.util.Scanner;
class Problem15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        int min = Math.min(num1, num2);
        int gcd = 1;
        for(int i=min; i>=1; i--){
            if(num1%i ==0 && num2%i == 0){
                gcd = i;
                break;
            }
        }
        
        int max = Math.max(num1, num2);
        int lcm = max;
        while(true){
            if(max % num1 ==0 && max % num2==0){
                lcm = max;
                break;
            }
            max++;
        }
        
        System.out.println("GCD is : " + gcd + " LCM is " + lcm); 
    }
}
