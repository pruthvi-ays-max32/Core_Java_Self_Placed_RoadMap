# Set Interface in Java

## What is the Set Interface?

The `Set` interface in Java is part of the `java.util` package and extends the `Collection` interface. It represents a collection of **unique elements**, meaning it does **not allow duplicate values**.

### Key Features:
- Does **not allow duplicates**
- May or may not maintain insertion order
- Provides methods for basic operations like add, remove, search, etc.

---

## Types of Set Implementations

Java provides three commonly used implementations of the `Set` interface:

1. **HashSet**
2. **LinkedHashSet**
3. **TreeSet**

---

## Difference Between HashSet, LinkedHashSet, and TreeSet

| Feature               | HashSet                          | LinkedHashSet                    | TreeSet                          |
|-----------------------|----------------------------------|----------------------------------|----------------------------------|
| **Order**             | No ordering                      | Maintains insertion order        | Sorted in natural or custom order |
| **Performance**       | Fastest (O(1) for basic ops)     | Slightly slower than HashSet     | Slower (O(log n) due to sorting) |
| **Duplicates**        | Not allowed                      | Not allowed                      | Not allowed                      |
| **Null Values**       | Allows one null element          | Allows one null element          | Does **not** allow nulls         |
| **Thread Safety**     | Not synchronized                 | Not synchronized                 | Not synchronized                 |
| **Sorting**           | Not sorted                       | Not sorted                       | Automatically sorted             |

---

## Important Set Methods

| Method                          | Description |
|----------------------------------|-------------|
| `add(E e)`                      | Adds an element to the set if not already present |
| `remove(Object o)`              | Removes the specified element |
| `contains(Object o)`            | Checks if the element exists in the set |
| `size()`                        | Returns the number of elements |
| `isEmpty()`                     | Checks if the set is empty |
| `clear()`                       | Removes all elements from the set |
| `iterator()`                    | Returns an iterator over the elements |
| `addAll(Collection c)`          | Adds all elements from another collection |
| `retainAll(Collection c)`       | Keeps only elements also in another collection |
| `removeAll(Collection c)`       | Removes all elements found in another collection |
| `toArray()`                     | Converts the set to an array |

---

## Sorting in Set

### 1. Using `TreeSet` (Natural Ordering)

```java
Set<Integer> numbers = new TreeSet<>();
numbers.add(10);
numbers.add(5);
numbers.add(20);

// Output: [5, 10, 20]
```

### 2. Custom Sorting with Comparator

```
Set<String> names = new TreeSet<>((a, b) -> b.compareTo(a)); // Descending
names.add("Alice");
names.add("Bob");
names.add("Charlie");

// Output: [Charlie, Bob, Alice]
```
---

## Searching in a Set

1. Using contains():
```
if (set.contains("item")) {
    System.out.println("Found");
}

```

3. Using Stream:
```
boolean exists = set.stream().anyMatch(e -> e.equals("value"));
```

---

## Iterating Over a Set

1. Enhanced For Loop
```
for (String item : set) {
    System.out.println(item);
}

```

2. Using Iterator
```
Iterator<String> it = set.iterator();
while (it.hasNext()) {
    System.out.println(it.next());
}

```

3. Java 8 forEach with Lambda
```
set.forEach(item -> System.out.println(item));

```

---
## Summary

- Use **HashSet** when you need the best performance and **don't care about ordering**.
- Use **LinkedHashSet** when you want to maintain **insertion order** while still preventing duplicates.
- Use **TreeSet** when you need to keep elements **sorted** (in natural or custom order), and **nulls are not needed**.

---

## Example Declaration

```java
Set<String> hashSet = new HashSet<>();
Set<String> linkedHashSet = new LinkedHashSet<>();
Set<String> treeSet = new TreeSet<>();
