
/*

 Thread Creation using Thread Class.

*/

public class Test {
  public static void main(String[] args) {
    A t1 = new A('#');
    A t2 = new A('$');
    t1.start();
    t2.start();
  }
}

class A extends Thread{
  private final char ch;
  A(char ch){
      this.ch = ch;
  }
  @Override
  public void run(){
    System.out.println(Thread.currentThread().getName() + "Thread Is Running .... ");
    for(int i=0; i<100; i++){
      System.out.print(ch + " ");
    }
  }
}

