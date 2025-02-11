// Given Number is Armstrong Or Not

import java.util.Scanner;

class Problem14{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        
        int noOfDigits = 0;
        int og = num;
        int x = num;
        int sum = 0;
        
        while(num>0){
            num = num/10;
            noOfDigits++;
        }
        
       while(x>0){
           int digit = x%10;
           sum += (int) Math.pow(digit, noOfDigits);
           x = x/10;
       }
       
       if(sum == og) System.out.println("Given Number is Armstrong Number");
       else System.out.println("Given Number is not Armstrong Number");
    }
}
