package Multithreading.LifeCycle;

public class LifeCycleDemo extends Thread {
  public void run() {
      System.out.println(Thread.currentThread().getName() + " is RUNNING");
      try {
          Thread.sleep(2000);  // TIMED_WAITING
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
      System.out.println(Thread.currentThread().getName() + " is TERMINATED");
  }

  public static void main(String[] args) {
      LifeCycleDemo t1 = new LifeCycleDemo(); // NEW
      System.out.println("Thread state before start: " + t1.getState());
      
      t1.start(); // RUNNABLE
      System.out.println("Thread state after start: " + t1.getState());

      try {
          t1.join(); // Main thread WAITING for t1 to complete
      } catch (InterruptedException e) {
          e.printStackTrace();
      }

      System.out.println("Thread state after completion: " + t1.getState());
  }
}

