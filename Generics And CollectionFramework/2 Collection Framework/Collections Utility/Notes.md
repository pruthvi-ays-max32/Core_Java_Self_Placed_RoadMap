# 📚 Java Collections Utility Class - `java.util.Collections`

The `Collections` class in Java is a part of the **Java Collections Framework** and provides **static utility methods** to operate on or return collections. It contains methods for **sorting**, **searching**, **shuffling**, **synchronizing**, and **modifying** collections.

---

## 🚀 Why Use Collections Utility Class?

- Provides **ready-to-use algorithms** for common collection operations
- Offers **thread-safe wrappers**
- Saves time and improves code **readability and maintainability**

---

## 🧠 Key Features

- Works only with **Collection types**
- All methods are `static`
- Cannot be instantiated
- Introduced in Java 1.2

---

## 🧪 Commonly Used Methods

| Method | Description |
|--------|-------------|
| `sort(List<T> list)` | Sorts the list in ascending order |
| `sort(List<T> list, Comparator)` | Sorts the list based on custom comparator |
| `reverse(List<?> list)` | Reverses the order of the list |
| `shuffle(List<?> list)` | Randomly permutes the elements |
| `swap(List<?> list, int i, int j)` | Swaps elements at specified positions |
| `max(Collection<? extends T> coll)` | Returns the maximum element |
| `min(Collection<? extends T> coll)` | Returns the minimum element |
| `frequency(Collection<?> c, Object o)` | Returns number of elements equal to `o` |
| `disjoint(Collection<?> c1, Collection<?> c2)` | Returns `true` if two collections have no elements in common |
| `fill(List<? super T> list, T obj)` | Replaces all elements with specified value |
| `copy(List<? super T> dest, List<? extends T> src)` | Copies elements from source to destination |
| `replaceAll(List<T> list, T oldVal, T newVal)` | Replaces all occurrences of `oldVal` with `newVal` |
| `synchronizedList(List<T> list)` | Returns a thread-safe list |
| `unmodifiableList(List<? extends T> list)` | Returns a read-only list |

---

## 🧑‍💻 Example Code Snippets

### ✅ Sorting a List
```java
List<String> names = Arrays.asList("John", "Alice", "Bob");
Collections.sort(names);
System.out.println(names); // [Alice, Bob, John]
```

### 🔄 Reversing a List

```java
Collections.reverse(names);
System.out.println(names); // [John, Bob, Alice]
```

### 🎲 Shuffling a List

```java
Collections.shuffle(names);
System.out.println(names); // Random order
```

### 🔁 Swapping Elements

```java
Collections.swap(names, 0, 2);
System.out.println(names);
```

### 🔒 Making List Thread-Safe

```java
List<String> syncList = Collections.synchronizedList(new ArrayList<>());
```

### 🧵 Thread-Safety and Immutability

- Use `synchronizedList()`, `synchronizedSet()`, etc., for thread-safe operations.
- Use `unmodifiableList()` to return read-only views of a collection.

### 📌 Notes
- Most methods throw `NullPointerException` if the collection contains `null` and the operation does not permit it.
- Many methods are generic and work with any type of objects.

### 📬 When to Use
- Need to quickly manipulate data structures (sort, reverse, shuffle).
- Need a synchronized or immutable version of your collection.
- Want to reduce boilerplate code using built-in utilities.

