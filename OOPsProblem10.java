// 🔥 Task: Implement Abstraction Using Abstract Class
//🔹 Create an abstract class Shape with an abstract method calculateArea().
//🔹 Extend it in three classes: Circle, Triangle and Rectangle.
//🔹 Implement calculateArea() differently in both classes.
//🔹 Test the functionality using a main method.


abstract class Shape {
  abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double height;

    Rectangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return length * height;
    }
}
  
class Square extends Shape {
    private double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }
}

class Main {
  public static void main(String args []){
        Shape c = new Circle(10.00);
        Shape r = new Rectangle(10, 20.00);
        Shape sq = new Square(20);

        System.out.printf("Area of Circle: %.2f%n", c.calculateArea());
        System.out.printf("Area of Rectangle: %.2f%n", r.calculateArea());
        System.out.printf("Area of Square: %.2f%n", sq.calculateArea());

  }
}
