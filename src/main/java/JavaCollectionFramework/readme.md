# Java Collection Framework

The Java Collection Framework provides a set of interfaces and classes to manage and manipulate groups of objects. It includes several core interfaces, each with its own implementations, to cater to different types of collections.

## Interfaces

### 1. List
- Represents an ordered collection (also known as a sequence).
- Allows duplicate elements.
- Provides methods to access elements by index.

**Classes:**
- ArrayList: Resizable-array implementation. [Things learnt here are applicable for LinkedList as well]
- LinkedList: Doubly-linked list implementation.
- Stack: Stacks for last in first out implementation.
- Vector: Synchronized resizable-array implementation (legacy).

### 2. Set
- Represents a collection that does not allow duplicate elements.
- Does not maintain insertion order.

**Classes:**
- HashSet: Implements the set interface using a hash table. O(n) constant for operation but non-sorted.
- TreeSet: Implements a set stored in a tree structure. O(log(n)) for operation but sorted order.
- LinkedHashSet: 

### 3. Queue
- Represents a collection used to hold multiple elements prior to processing.
- Typically, follows FIFO (First-In-First-Out) order.

**Classes:**
- LinkedList: Also implements the Queue interface.
- ArrayDeque: Resizable-array implementation. Double ended queue. Supports insertion and removal at both ends.
- PriorityQueue:

### 4. Map
- Represents a collection of key-value pairs.
- Each key is associated with exactly one value.

**Classes:**
- HashMap: Implements the map interface using a hash table.
- TreeMap: Implements a map stored in a tree structure.
- LinkedHashMap: Maintains insertion order.


### 5. Collection
- Root interface for all the collections in the Java Collection Framework.

## Key Concepts

- Generics: Introduced to provide compile-time type safety for collections.
- Iterators: Allow iterating through elements of a collection.
- Concurrency: Some collection classes have synchronized counterparts for thread-safe operations.

## Usage

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Example of using ArrayList
        List<String> list = new ArrayList<>();
        list.add("Element 1");
        list.add("Element 2");
        System.out.println(list.get(0));  // Output: Element 1

        // Example of using HashMap
        Map<String, Integer> map = new HashMap<>();
        map.put("Key 1", 1);
        map.put("Key 2", 2);
        System.out.println(map.get("Key 1"));  // Output: 1
    }
}
