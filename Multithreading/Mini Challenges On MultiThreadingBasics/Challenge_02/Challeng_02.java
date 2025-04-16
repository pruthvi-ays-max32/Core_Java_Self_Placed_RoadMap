// package Multithreading.Mini Challenges On MultiThreadingBasics.Challenge_02;

/*
 🔸 Challenge 2: Thread Naming + Priority Visualizer
    🔹 Goal:
      Create 3 threads with:
      Custom names like "FastThread", "SlowThread", "MediumThread"
      Different priorities (10, 1, 5)
      All threads print numbers from 1 to 3 and include thread name + priority.

      output : 
      FastThread [Priority 10] - 1
 */
public class Challeng_02 {
    public static void main(String[] args) {
      Thread t1 = new Thread(new MyThread());
      Thread t2 = new Thread(new MyThread());
      Thread t3 = new Thread(new MyThread());

      t1.setPriority(10);
      t2.setPriority(1);
      t3.setPriority(5);

      t1.setName("FastThread");
      t2.setName("SlowThread");
      t3.setName("MediumThread");

      t1.start();
      t2.start();
      t3.start();
    }
}

class MyThread implements Runnable {
  @Override
  public void run(){

    try{
      for(int i=1;i<4;i++){
        System.out.println(Thread.currentThread().getName() + " [" + Thread.currentThread().getPriority() + "] - " + i);
        Thread.sleep(1000);
      }
    } catch(InterruptedException e){
      System.out.println("Thread Is Sleeping ...");
    }
  }
}