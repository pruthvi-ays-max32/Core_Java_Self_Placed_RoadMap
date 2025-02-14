// 🔹 Q15: Create a local inner class inside a method and use it.

class Outer {
  public void outerMethod1(){
    class LocalInner{
      void showLove(){
        System.out.println("I love You !!");
      }
    }
    LocalInner li = new LocalInner();
    li.showLove();
  }
}

class Main{
  public static void main (String args[]){
    Outer ot = new Outer();
    ot.outerMethod1();
  }
}
