// package Multithreading.Sychronization.ReentrantLockProblem;

import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 150;
    private final ReentrantLock lock = new ReentrantLock();

    public void withdraw(String user, int amount) {
        lock.lock();  // 🔒 Acquire lock
        try {
            System.out.println(user + " is trying to withdraw ₹" + amount);
            Thread.sleep(1000); // Simulate delay

            if (balance >= amount) {
                balance -= amount;
                System.out.println(user + " successfully withdrew ₹" + amount);
                System.out.println("Remaining balance: ₹" + balance);
            } else {
                System.out.println(user + " failed to withdraw. Not enough balance.");
            }
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted.");
        } finally {
            lock.unlock();  // 🔓 Release lock
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread user1 = new Thread(new UserThread(account, "User-1"));
        Thread user2 = new Thread(new UserThread(account, "User-2"));

        user1.start();
        user2.start();
    }
}

class UserThread implements Runnable {
    private final BankAccount account;
    private final String name;

    UserThread(BankAccount account, String name) {
        this.account = account;
        this.name = name;
    }

    @Override
    public void run() {
        account.withdraw(name, 100);
    }
}

