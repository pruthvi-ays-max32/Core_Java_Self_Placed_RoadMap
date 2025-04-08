# Generics in Java : 
  - Generics allows us to write more flexible and reusable code by enabling types to be parameters while defining classes, methods etc.
  - Provide compile-time type safety.
  - A generic class allows us to define a class with placeholder type <T> which is determined at runtime.

# What is the difference between working with generics and not working with generics :

1. working without Generics :
   - It means that we are using Object class to provide multiple Types support in class or method.
   - it will work but everytime we need to type cast before storing it or using it.
   - it will store any type of data so there is no #TypeSafety because Object is parent of all so it will allow anybody to get stored.

2. working with Generics :
     - public class Record <E>{}
     - Here E represents generics which can be replaced with any Type.
     - but here we can't instatentiate with Type E because it is generic we need to use Object class for instatention(creating constructor).
     - eg. Record (){
             this.items = (E []) new Object[10];  // type cast to E array.
           }

  # Generic Methods : A single method works for multiple types.
        public static <T> void printArray(T[] arr){
          for (T item : arr){
            Sysout(item);
          }
        }

  # Bounded Type Parameters : Restrict The generic type to only certain subclasses using extends keyword.
      class Num <T extends Number> {
      
      }

      - above class will accept the only Number subtypes like Number, Integer, Float, Double etc.

  # WildCards : (? , super, extends)

  1. ? extends T -> it will accept any subclasses of T Type.
    -> Useful for reading data.  eg. (List <? extends Number> list) -> now this list can hold Number , Integer , Float, Double etc....

  2. ? super T -> it will accept any superClasses of T type.
    -> Useful for writing data. eg. (List <? super Integer> list) -> now this list can hold Integer, Number and Object Type Data.
    
  3. ? -> it will accept any Type.
     -> Works with any Type but we can't modify it.
     -> Best Use Case : To read Data.
