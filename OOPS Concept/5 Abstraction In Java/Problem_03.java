// ✅ Task for You:
// 💡 Create an example where a class implements two interfaces, one for Swimming and one for Running.

interface Swim{
  void swimming();
}

interface Run{
  void running();
}

class Boy implements Run, Swim {
  void running (){
    System.out.println("Boy is Running in the Marathon.");
  }

  void swimming(){
    System.out.println("Boy is Swimming in the Pool.");
  }
}

class Main{
  public static void main(String args[]){
    Boy praneeth = new Boy();
    praneeth.running();
    praneeth.swimming();
  }
}
