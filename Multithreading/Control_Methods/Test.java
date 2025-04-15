/*
Task :
     1. Implement a program with:
     2. Two threads that print numbers 1–5.
     3. Use sleep() between prints.
     4. Call yield() when a specific condition (like i == 3) is met.
     5. Use join() to ensure main thread waits for both to finish.
 */

public class Test {
  public static void main(String[] args) throws InterruptedException {
    MyThread t1 = new MyThread();
    MyThread t2 = new MyThread();

    t1.setName("Thread-1");
    t2.setName("Thread-2");

    t1.start();
    t2.start();

    t1.join();
    t2.join();

    System.out.println("Main Thread Ended");
  }
}

class MyThread extends Thread {
  @Override
  public void run() {
    try {
      for (int i = 1; i <= 5; i++) {
        System.out.println(i + " - " + Thread.currentThread().getName());
        if (i == 3)
          Thread.yield();
        Thread.sleep(1000);
      }
    } catch (InterruptedException e) {
      System.out.println("⚠️ Interrupted");
    }
  }
}
