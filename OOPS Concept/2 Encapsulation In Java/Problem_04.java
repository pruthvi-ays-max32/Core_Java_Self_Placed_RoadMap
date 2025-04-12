// 🎯 Task: Implement Encapsulation
// 🔹 Create a BankAccount class with private variables: accountNumber, balance.
// 🔹 Provide getter & setter methods to access and modify them.
// 🔹 Ensure balance cannot be negative.

class BankAccount {
  private String accountNumber;
  private double balance; 

  BankAccount(){
    this("Unknown", 0.0);
    System.out.println("Default Constructor Gets Called ... ");
  }

  BankAccount(String accountNumber, double balance){
      setAccountNumber(accountNumber);
      setBalance(balance);
  }

  public void setAccountNumber(String accountNumber){
       if (accountNumber == null || accountNumber.isEmpty()) {
            System.out.println("Invalid Account Number");
            return;
        }
        this.accountNumber = accountNumber;
  }

  public void setBalance(double balance){
      if(balance < 0){
           System.out.println("Invalid Balance Amount");
           this.balance = 0;
           return;
      }
      this.balance = balance;
  }

  public String getAccountNumber(){
      return accountNumber;
  }

  public double getBalance (){
      return balance;
  }


  public static void main(String args[]){
      BankAccount ac1 = new BankAccount("ABC123", 2000);
      System.out.println(ac1.getAccountNumber());
      System.out.println(ac1.getBalance());
      
      BankAccount ac2 = new BankAccount();
      ac2.setBalance(400);
      ac2.setAccountNumber("XYZ456");
      System.out.println(ac2.getAccountNumber());
      System.out.println(ac2.getBalance());
  }
}
