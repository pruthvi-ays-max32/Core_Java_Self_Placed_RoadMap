# List Interface in Java

## What is the List Interface?

The `List` interface in Java is a part of the `java.util` package and is a subinterface of `Collection`. It represents an **ordered collection** (also known as a sequence) that can contain **duplicate elements**. Lists allow precise control over where each element is inserted and can be accessed by their integer index (position in the list).

### Key Features:
- Maintains **insertion order**.
- Allows **duplicate elements**.
- Provides **positional access** and **insertion** of elements.

---

## Types of List Implementations

Java provides several classes that implement the `List` interface, the most commonly used ones are:

1. **ArrayList**
2. **LinkedList**
3. **Vector**

---

## Difference Between ArrayList, LinkedList, and Vector

| Feature                | ArrayList                         | LinkedList                        | Vector                            |
|------------------------|-----------------------------------|-----------------------------------|-----------------------------------|
| **Data Structure**     | Dynamic array                     | Doubly linked list                | Dynamic array                     |
| **Performance**        | Fast in accessing elements        | Fast in manipulation (insert/delete) | Slower compared to ArrayList     |
| **Insertion/Deletion** | Slower (due to shifting elements) | Faster (no shifting, just pointer changes) | Slower due to synchronization    |
| **Thread Safety**      | Not synchronized (not thread-safe) | Not synchronized (not thread-safe) | Synchronized (thread-safe)       |
| **Memory**             | Less memory usage                 | More memory usage (due to pointers) | More memory (due to synchronization overhead) |
| **When to Use**        | When frequent access is needed    | When frequent insertions/deletions are needed | When thread-safe operations are needed |

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
| `lastIndexOf(Object o)`         | Returns the index of the last occurrence of the element. |
| `clear()`                       | Removes all elements from the list. |
| `toArray()`                     | Converts the list into an array. |
| `iterator()`                    | Returns an iterator over the elements. |
| `listIterator()`                | Returns a list iterator starting at the beginning. |
| `subList(int from, int to)`     | Returns a portion of the list between the specified indexes. |

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
