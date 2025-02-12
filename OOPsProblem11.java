// 2️⃣ Create an interface Playable that has a method play(). Implement it in Cricket and Football classes.

interface Playable {
  void play();
}

class Cricket implements Playable {
  public void play(){
    System.out.println("Cricket is a game of 2 teams which played with help of bat and ball");
  }
}

class Football implements Playable {
  public void play(){
    System.out.println("Football is very Popular game played by many countries");
  }
}

class Main {
  public static void main(String args[]){
    Playable cric = new Cricket();
    Playable foot = new Football();

    cric.play();
    foot.play();
  }
}


// 3️⃣ Create an abstract class Employee with attributes name and salary. Implement it in Manager and Developer classes.

abstract class Employee {
  private String name;
  private long salary;

  Employee(String name, long salary){
    this.name = name;
    this.salary = salary;
  }
  
  String getName (){
    return name;
  }
  long getSalary(){
    return salary;
  }
}

class Manager extends Employee {
  Manager(String name, long salary){
    super(name, salary);
    System.out.println("Manager constructor run...");
    System.out.printf("Manger Name : %s | Manager Salary : %d %n", super.getName(), super.getSalary());
  }
}

class Developer extends Employee {
  Developer(String name, long salary){
    super(name, salary);
    System.out.println("Developer constructor run...");
    System.out.printf("Developer Name : %s | Developer Salary : %d %n", super.getName(), super.getSalary());
  }
}

class Test {
  public static void main(String args[]){
    Employee manager = new Manager("Manager1" , 30000);
    Employee dev = new Developer("Dev1" , 40000);
  }
}


