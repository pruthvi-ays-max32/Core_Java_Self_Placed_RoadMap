// package Multithreading.ThreadPriority;

class MyThread extends Thread {
  @Override
  public void run(){

    for(int i=1; i<=5; i++){
      System.out.println(Thread.currentThread().getName() + "  " + i);
    }
    
  }
}


public class Test {
  public static void main(String[] args) {
    MyThread t1 = new MyThread();
    MyThread t2 = new MyThread();
    MyThread t3 = new MyThread();

    t1.setPriority(Thread.MAX_PRIORITY);
    t2.setPriority(Thread.MIN_PRIORITY);
    t3.setPriority(Thread.NORM_PRIORITY);

    t1.setName("thread-1");
    t2.setName("thread-2");
    t3.setName("thread-3");

    t1.start();
    t2.start();
    t3.start();

  }
}
