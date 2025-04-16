/*
Create a program with:

Three threads with different priorities.

One thread should be a daemon thread.

All threads print numbers from 1 to 5.

Observe the behavior — who prints more/faster. 
*/

public class Test {
  public static void main(String[] args) {
    DThread dt1 = new DThread();
    DThread dt2 = new DThread();
    DThread dt3 = new DThread();

    dt1.setPriority(4);  // setting priority for Threads.
    dt2.setPriority(2);
    dt3.setPriority(8);

    dt1.setName("Thread-1 (Daemon)");
    dt2.setName("Thread-2 (Daemon)");
    dt3.setName("Thread-3 (Daemon)");    
    
    dt1.setDaemon(true);  // set before start
    dt2.setDaemon(true);
    dt3.setDaemon(true);

    dt1.start();
    dt2.start(); // start the threads.
    dt3.start();

    for(int i=1; i<=3; i++){
      System.out.println("Main Thread: " + i);
      try { Thread.sleep(1000); } catch(Exception e){}   // main thread tasks.
    }

    System.out.println("Main Thread Ended...");
  }
}

class DThread extends Thread{  // custom Thread using Thread Class.
  @Override
  public void run(){  // overriden run method.
    System.out.println("Demon Thread Is running ...");
    for(int i=1; i<=5; i++){
      System.out.println(Thread.currentThread().getName() + 
      " Priority: " + Thread.currentThread().getPriority() + 
      " Count: " + i);
    try { Thread.sleep(1000); } catch(Exception e){}
    }
  }
}
