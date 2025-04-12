/* 
Problem Statement : 
Create an Employee class with attributes like name, age, salary and location and property raiseSalary. 
now create another class Main to create 2 instances of employee class and raise salary of one employee using raiseSalary property and print details of both the employees.
*/
class Employee {
    private String name;
    private int age;
    private String location;
    private double salary;

    Employee(String name, int age, String location, double salary){
      this.name = name;
      this.age = age;
      this.location = location;
      this.salary = salary;
    }

    public void raiseSalary(){
      this.salary = salary * 2;
    }
    
    public String printEmpDetails(){
        StringBuilder sb = new StringBuilder();
        sb.append("Name : ").append(name).append("| age : ").append(age).append("| Location : ").append(location).append("| salary : ").append(salary);
        return sb.toString();
    }
  
}

public class Main {
  public static void main(String args[]){
    Employee emp1 = new Employee("Kunal", 23, "Pune", 23000);
    Employee emp2 = new Employee("Akanksha", 23, "Nanded", 21000);
    emp2.raiseSalary();
    System.out.println(emp1.printEmpDetails());
    System.out.println(emp2.printEmpDetails());
  }
}
