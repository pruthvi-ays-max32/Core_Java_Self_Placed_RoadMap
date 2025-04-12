# Map Interface in Java

## What is the Map Interface?

The `Map` interface in Java (part of `java.util`) represents a collection of **key-value pairs**, where:

- Each **key** is unique
- Each **key maps to at most one value**

It is **not** a subtype of the `Collection` interface.

### Key Features:
- No duplicate keys allowed
- Allows one `null` key and multiple `null` values (varies by implementation)
- Provides methods for adding, retrieving, updating, and removing key-value pairs

---

## Types of Map Implementations

Java provides several commonly used implementations of the `Map` interface:

1. **HashMap**
2. **LinkedHashMap**
3. **TreeMap**

---

## Difference Between HashMap, LinkedHashMap, and TreeMap

| Feature               | HashMap                        | LinkedHashMap                   | TreeMap                          |
|-----------------------|--------------------------------|----------------------------------|----------------------------------|
| **Ordering**          | No ordering                    | Maintains insertion order        | Sorted by keys (natural or custom) |
| **Performance**       | Fast for most operations       | Slightly slower than HashMap     | Slower (due to sorting logic)     |
| **Null Keys**         | Allows one `null` key          | Allows one `null` key            | **Does not** allow `null` key     |
| **Thread Safety**     | Not synchronized               | Not synchronized                 | Not synchronized                 |
| **Sorting**           | Not sorted                     | Not sorted                       | Automatically sorted by key      |

---

## Important Map Methods

| Method                            | Description |
|----------------------------------|-------------|
| `put(K key, V value)`            | Adds a key-value pair |
| `get(Object key)`                | Retrieves the value for a key |
| `remove(Object key)`             | Removes entry for a key |
| `containsKey(Object key)`        | Checks if the key exists |
| `containsValue(Object value)`    | Checks if the value exists |
| `keySet()`                       | Returns a `Set` of all keys |
| `values()`                       | Returns a `Collection` of all values |
| `entrySet()`                     | Returns a `Set` of all key-value pairs |
| `isEmpty()`                      | Checks if map is empty |
| `size()`                         | Returns number of entries |
| `clear()`                        | Removes all entries |

---

## Sorting a Map

### 1. Sort by Keys (Using TreeMap)

```java
Map<String, Integer> map = new TreeMap<>();
map.put("Banana", 10);
map.put("Apple", 5);
map.put("Cherry", 20);

// Output: Keys sorted alphabetically
```

### 2. Sort by Values Using Comparator

```java
Map<String, Integer> map = new HashMap<>();
map.put("Banana", 10);
map.put("Apple", 5);
map.put("Cherry", 20);

List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());

entries.sort(Map.Entry.comparingByValue());

for (Map.Entry<String, Integer> entry : entries) {
    System.out.println(entry.getKey() + ": " + entry.getValue());
}

```

### Sorting Custom Objects by Key Using Comparable

```java
class Student implements Comparable<Student> {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name); // natural sort by name
    }

    @Override
    public String toString() {
        return name + " - " + marks;
    }
}

// Using TreeMap
Map<Student, String> studentMap = new TreeMap<>();
studentMap.put(new Student("Alice", 90), "A");
studentMap.put(new Student("Bob", 80), "B");

```
---
## Searching In Map

### 1. Search by Key
```java
map.containsKey("Apple");
```

### 2. Search by Value
```java
map.containsValue(20);
```

### 3. Search with Stream (Custom Conditions)
```java
boolean found = map.entrySet().stream()
    .anyMatch(e -> e.getKey().equals("Banana") && e.getValue() > 5);
```

---
## Iterating Over a Map

### 1. Using for-each with entrySet()
```java
for (Map.Entry<String, Integer> entry : map.entrySet()) {
    System.out.println(entry.getKey() + ": " + entry.getValue());
}
```
### 2. Using for-each with keySet() and get()
```java
for (String key : map.keySet()) {
    System.out.println(key + ": " + map.get(key));
}
```
### 3. Using Iterator
```java
Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
while (it.hasNext()) {
    Map.Entry<String, Integer> entry = it.next();
    System.out.println(entry.getKey() + ": " + entry.getValue());
}
```
### 4. Using Java 8 forEach with Lambda
```java
map.forEach((key, value) -> System.out.println(key + ": " + value));
```
---

## Summary

- Use **HashMap** for fast access and no need for order.
- Use **LinkedHashMap** if insertion order must be preserved.
- Use **TreeMap** when keys must be sorted (natural or custom).

---

## Example Declaration

```java
Map<String, Integer> hashMap = new HashMap<>();
Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
Map<String, Integer> treeMap = new TreeMap<>();
