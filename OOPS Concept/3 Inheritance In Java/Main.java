/*
  Problem Statement : If we call the get method in arraylist it will return the data at this index.
  if index is negative or invalid then also it should return a value from array list based on the absolute value of mod of that index by the size of that array list.
*/

import java.util.*;

class ModArrayList <E> extends ArrayList <E> {
    public E getUsingMod(int index){
        int validIndex = Math.abs(index) % this.size();
        return this.get(validIndex);
    }
}

class Main {
    public static void main(String[] args) {
        ModArrayList list = new ModArrayList();
        list.add(20);
        list.add(10);
        list.add(50);
        list.add(100);
        
        System.out.println(list.getUsingMod(2));
        System.out.println(list.getUsingMod(-1));
        System.out.println(list.getUsingMod(40));

    }
}
