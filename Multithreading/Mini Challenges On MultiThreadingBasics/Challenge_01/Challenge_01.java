// package Multithreading.Mini Challenges On MultiThreadingBasics;

/*
 🔸Challenge 1: Print Even & Odd Numbers Using Two Threads
  🔹 Goal:
    Create 2 threads:
    EvenThread prints even numbers from 0 to 10
    OddThread prints odd numbers from 1 to 9
  🔹 Use Thread.sleep(500) to simulate processing delay.
  🔹 Both should run concurrently.
 */

public class Challenge_01 {
  public static void main(String[] args) {
    EvenThread t1 = new EvenThread();
    OddThread t2 = new OddThread();

    t1.start();
    t2.start();
  }
}

class EvenThread extends Thread {
  @Override
  public void run() {
    System.out.println("Even Thread is Running...");
    try {
      for (int i = 0; i <= 10; i++) {
        if (i % 2 == 0) {
          System.out.println(i + " Even ");
          Thread.sleep(500);
        }
      }
    } catch (InterruptedException e) {
      System.out.println("Thread is Sleeping ... ");
    }
  }
}

class OddThread extends Thread {
  @Override
  public void run() {
    System.out.println("Odd Thread is Running...");
    try {
      for (int i = 0; i <= 10; i++) {
        if (i % 2 != 0) {
          System.out.println(i + " Odd ");
          Thread.sleep(500);
        }
      }
    } catch (Exception e) {
      System.out.println("Thread is Sleeping ...");
    }
  }
}
