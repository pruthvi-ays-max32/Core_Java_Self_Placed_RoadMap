// ✅ Task : Static Variable Sharing
// 🔹 Create a Student class with a static variable schoolName.
// 🔹 Every student should share the same school name.
// 🔹 Print the school name for multiple students and see if it remains the same.

class Student {
  static String schoolName;
  private String name ;

  Student(String name){
    this.name = name;
  }

  void displayDetails(){
    System.out.printf("Student Name : %s | School : %s %n" , name, schoolName);
  }
}

class Main{
  public static void main(String args[]){
    Student s1 = new Student("Kunal");
    Student s2 = new Student("Akanksha");
    Student.schoolName = "IIT Bombay";
    s1.displayDetails();
    s2.displayDetails();
  }
}
