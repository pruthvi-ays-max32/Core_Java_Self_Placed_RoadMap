// package Multithreading.Mini Challenges On MultiThreadingBasics.Challenge_03;

/*
 🔸 Challenge 3: Daemon Cleaner Thread
  🔹 Goal:
      Create:
      A daemon thread that keeps printing "Auto Clean Up Running..." every second.
      A main thread that prints "User Working..." 3 times, then exits.
      Observe: the daemon thread will die automatically when the main thread ends. 
*/
public class Challenge_03 {
  public static void main(String[] args) {
    MyThread t1 = new MyThread();
    t1.setName("Deamon Thread - 1");
    t1.setDaemon(true);
    t1.start();

    try{
      for(int i=1; i<4; i++){
        System.out.println("User Working..."+ i);
        Thread.sleep(500);
      }
    } catch (InterruptedException e){
      System.out.println("The Thread is sleepin.");
    }
    System.out.println("Main Thread Finished its Working...");
  }
}


class MyThread extends Thread {
  @Override
  public void run(){
    try{
      while(true){
        System.out.println("Auto Clean Up Running...");
        Thread.sleep(500);
      }
    } catch(InterruptedException e){
      System.out.println("Thread Is Sleeping...");
    }  
  }
}