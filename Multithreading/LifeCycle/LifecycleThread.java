package Multithreading.LifeCycle;

public class LifecycleThread extends Thread {

  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName() + " is RUNNING");
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println(Thread.currentThread().getName() + " is TERMINATED");
  }

  public static void main(String args[]) {
    LifecycleThread t1 = new LifecycleThread();
    System.out.println("Before Start Thread State" + t1.getState());
    t1.start();
    System.out.println("After Start Thread State" + t1.getState());

    try {
      t1.join(); // Main thread WAITING for t1 to complete
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("Thread state after completion: " + t1.getState());
  }
}
