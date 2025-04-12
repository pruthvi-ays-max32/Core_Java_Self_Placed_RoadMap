// 💡 Task:
// 1️⃣ Create a Student class with private variables name and age.
// 2️⃣ Provide getter & setter methods to access and modify them.
// 3️⃣ Create an object, set values using the setter, and display them using the getter.


class Student {
  
  // 1️⃣ Create a Student class with private variables name and age.
  private String name;
  private int age;

  // 2️⃣ Provide getter & setter methods to access and modify them.
  public void setName(String s){
    name = s;
  }
  public void setAge(int a){
    age = a;
  }
  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }

  // 3️⃣ Create an object, set values using the setter, and display them using the getter.
  public static void main(String args[]){
    Student s1 = new Student();
    s1.setName("Kunal");
    s1.setAge(23);

    System.out.printf("Name of Student %s | Age of Student %d %n" , s1.getName(), s1.getAge());
  }
  
}
