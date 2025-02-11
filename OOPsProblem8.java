// 💡 Task:
// 1️⃣ Create a Person class with a method showDetails() to print "Person details".
// 2️⃣ Create a Student class extending Person and override showDetails().
// 3️⃣ Use super.showDetails(); in Student to call the parent method.
// 4️⃣ Print student-specific details after calling super.showDetails().

class Person {
  String name;
  int age;
  Person (String name, int age){
    this.name = name;
    this.age = age;
  }
  void showDetails(){
    System.out.printf("Name : %s | Age : %d %n", name , age);
  }
}

class Student extends Person {
  String course;

  Student(String name, int age, String course){
    super(name, age);
    this.course = course;
  }
  
  void showDetails(){
    super.showDetails();
    System.out.printf("I am Enrolled in : %s %n", course);
  }
}

class Main {
  public static void main(String args[]){
      Student s1 = new Student("Kunal", 23, "BE Computer Science");
      s1.showDetails();
  }
}
