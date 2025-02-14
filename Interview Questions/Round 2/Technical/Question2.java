//🔹 Q12: Implement an abstract class "Animal" with an abstract method makeSound(). Create two subclasses (Dog & Cat) that implement this method.

abstract class Animal {
  abstract void makeSound();
}

class Dog extends Animal {
  void makeSound(){
    System.out.println("Dog is Barking");
  }
}

class Cat extends Animal {
  void makeSound(){
    System.out.println("Cat is doing Meow Meow");
  }
}

class Main {
  public static void main(String args[]){
    Cat c1 = new Cat();
    Dog d1 = new Dog();

    c1.makeSound();
    d1.makeSound();
  }
}
