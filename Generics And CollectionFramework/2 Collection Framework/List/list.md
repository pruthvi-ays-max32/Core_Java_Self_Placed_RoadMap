# List Interface in Java

## What is the List Interface?

The `List` interface is part of the `java.util` package and extends the `Collection` interface. It represents an **ordered collection** of elements that may contain **duplicates**. Lists allow elements to be inserted or accessed based on their position (index).

### Key Features:
- Maintains **insertion order**
- Allows **duplicate** elements
- Supports **index-based** operations
- Can be iterated in various ways

---

## Types of List Implementations

Java provides several commonly used implementations of the `List` interface:

1. **ArrayList**
2. **LinkedList**
3. **Vector**

---

## Difference Between ArrayList, LinkedList, and Vector

| Feature                | ArrayList                         | LinkedList                        | Vector                            |
|------------------------|-----------------------------------|-----------------------------------|-----------------------------------|
| **Data Structure**     | Dynamic array                     | Doubly linked list                | Dynamic array                     |
| **Performance**        | Fast access, slow insert/delete   | Slow access, fast insert/delete   | Slower due to synchronization     |
| **Thread Safety**      | Not thread-safe                   | Not thread-safe                   | Thread-safe (synchronized)        |
| **Memory Usage**       | Less                              | More (extra pointers)             | More (sync overhead)              |
| **When to Use**        | When access is frequent           | When modifications are frequent   | When thread safety is required    |

---

## Important List Methods

| Method                          | Description |
|----------------------------------|-------------|
| `add(E e)`                      | Adds an element to the end of the list. |
| `add(int index, E element)`     | Inserts element at the specified index. |
| `get(int index)`                | Returns the element at the specified index. |
| `set(int index, E element)`     | Replaces the element at the specified position. |
| `remove(int index)`             | Removes the element at the specified index. |
| `remove(Object o)`              | Removes the first occurrence of the specified element. |
| `size()`                        | Returns the number of elements in the list. |
| `isEmpty()`                     | Checks if the list is empty. |
| `contains(Object o)`            | Returns true if the list contains the specified element. |
| `indexOf(Object o)`             | Returns the index of the first occurrence of the element. |
| `clear()`                       | Removes all elements from the list. |
| `toArray()`                     | Converts the list into an array. |
| `iterator()`                    | Returns an iterator over the elements. |
| `listIterator()`                | Returns a list iterator for bidirectional traversal. |
| `subList(int from, int to)`     | Returns a view of a portion of the list. |

---

## Sorting Objects in a List

### 1. Using `Comparable` (Natural Ordering)

```java
class Student implements Comparable<Student> {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student s) {
        return this.marks - s.marks; // Ascending
    }
}

// Usage
List<Student> students = new ArrayList<>();
students.add(new Student("Alice", 85));
students.add(new Student("Bob", 92));
students.add(new Student("Charlie", 78));

Collections.sort(students); // Uses compareTo

```
### 2. Using Comparator (Custom Ordering)
```java
class NameComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

// Usage
Collections.sort(students, new NameComparator());

// OR Using Lambda
students.sort((s1, s2) -> s1.name.compareTo(s2.name));
```


---

## Searching In List 

1. Using contains():
```
     list.contains("item");
```
2. Using indexOf():
```
     int index = list.indexOf("item");
```
3. Using Stream (for complex objects):
```
     boolean found = students.stream().anyMatch(s -> s.name.equals("Alice"));
```


---

## Iterating Over a List
1. Normal for loop
```
    for (int i = 0; i < list.size(); i++) {
        System.out.println(list.get(i));
    }
```
2. Enhanced for-each loop
```
   for (String item : list) {
    System.out.println(item);
    }
```
3. Iterator
```
    Iterator<String> it = list.iterator();
    while (it.hasNext()) {
        System.out.println(it.next());
    }
```

4. ListIterator (Bi-directional)

```
    ListIterator<String> listIt = list.listIterator();
    while (listIt.hasNext()) {
        System.out.println(listIt.next());
    }
    while (listIt.hasPrevious()) {
        System.out.println(listIt.previous());
    }
```

5. Java 8 forEach with Lambda

```
    list.forEach(item -> System.out.println(item));
```


---

## Summary

- Use **ArrayList** when you need fast random access and minimal insert/delete operations.
- Use **LinkedList** when insertions and deletions are frequent.
- Use **Vector** when thread-safety is required and synchronization overhead is acceptable.

---

## Example Declaration

```java
List<String> arrayList = new ArrayList<>();
List<String> linkedList = new LinkedList<>();
List<String> vector = new Vector<>();
