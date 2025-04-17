// package SolveRACE Condition;


class BankAccount {
  int balance = 100;

  synchronized void withdraw(String user, int amount) {
      if (balance >= amount) {
          System.out.println(user + " is going to withdraw ₹" + amount);
          try {
              Thread.sleep(1000); // Simulate processing time
          } catch (Exception e) {
              e.printStackTrace();
          }
          balance -= amount;
          System.out.println(user + " completed withdrawal. Remaining: ₹" + balance);
      } else {
          System.out.println(user + " can't withdraw. Not enough balance.");
      }
  }
}

// Runnable implementation for withdrawing money
class WithdrawTask implements Runnable {
  BankAccount account;
  String user;
  int amount;

  // Constructor to accept BankAccount and user info
  public WithdrawTask(BankAccount account, String user, int amount) {
      this.account = account;
      this.user = user;
      this.amount = amount;
  }

  // What the thread will run
  @Override
  public void run() {
      account.withdraw(user, amount);
  }
}

public class Test {
  public static void main(String[] args) {
      BankAccount account = new BankAccount();

      // Create Runnable tasks
      WithdrawTask task1 = new WithdrawTask(account, "User1", 80);
      WithdrawTask task2 = new WithdrawTask(account, "User2", 80);

      // Create threads with the Runnable tasks
      Thread t1 = new Thread(task1);
      Thread t2 = new Thread(task2);

      // Start the threads
      t1.start();
      t2.start();
  }
}

