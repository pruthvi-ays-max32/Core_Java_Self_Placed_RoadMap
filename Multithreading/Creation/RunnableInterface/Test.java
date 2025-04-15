
/*
    Thread Creation Using Runnable Interface.
*/

package Multithreading.Creation.RunnableInterface;

public class Test {
  public static void main(String[] args) {
    A obj1 = new A('%');
    A obj2 = new A('@');

    Thread t1 = new Thread(obj1);
    Thread t2 = new Thread(obj2);

    t1.start();
    t2.start();
  }
}

class A implements Runnable {

  private final char ch ;

  A(char ch){
    this.ch = ch;
  }

  @Override
  public void run(){
    for(int i=0; i<100; i++){
      System.out.print(ch + " ");
    }
  }
}
