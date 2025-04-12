/*
Problem Statement :
Create a bankAccount class where attributes are ownerName and balance, and add functionality like withdraw, deposite and getter methods and one constructor to create object.
Now create another class Main to make bank account instance. Withdraw a certain amount using the withdraw method. Print out the resulting balance.
*/

class BankAccount {
    private String ownerName;
    private double balance;

    BankAccount(String ownerName, double balance){
      this.ownerName = ownerName;
      this.balance = Math.max(balance, 0);
    }

    public void withdraw(double amt){
      if(amt>0 && amt<balance){
          this.balance -= amt;
          System.out.println("Amount Withdraw Successfully.");
      } else {
          System.out.println("Insufficient Balance Or Invalid Amount.");
      }
    }
    
    public void deposite(double amt){
        if(amt>0){
            this.balance += amt;
            System.out.println("Amount Deposited Successfully.");
        } else{
            System.out.println("Invalid Amount.");
        }
    }
    
    
    public String printBankDetails(){
        StringBuilder sb = new StringBuilder();
        sb.append("Name : ").append(ownerName).append("| balance : ").append(balance);
        return sb.toString();
    }
  
}


public class Main {
  public static void main(String args[]){
    BankAccount b1 = new BankAccount("Kunal", 25000);
    System.out.println(b1.printBankDetails());
    b1.withdraw(2000);
    System.out.println(b1.printBankDetails());
    b1.deposite(2000);
    System.out.println(b1.printBankDetails());
  }
}
