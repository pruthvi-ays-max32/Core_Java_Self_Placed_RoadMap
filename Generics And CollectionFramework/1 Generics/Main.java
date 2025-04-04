/*
📌 Task:
1️⃣ Create a generic class Pair<K, V> that can store two values of any type.
2️⃣ Implement a method display() that prints the values.
3️⃣ Create an instance with Pair<String, Integer> and print it.
*/

public class Pair <K, V> {
  private K key;
  private V value;

  public Pair(K key, V value){
    this.key = key;
    this.value = value;
  }

  public K getKey(){
    return key;
  }

  public V getValue(){
    return value;
  }

  public void display(){
    System.out.println(key + " : " + value);
  }
  
}

public class Main{
  public static void main(String args[]){
    Pair <String, String> hash1 = new Pair<>("Fruit", "Mango");
    hash1.display();

    Pair <String,Integer> hash2 = new Pair<>("Mango", 100);
    hash2.display();
  }
}
