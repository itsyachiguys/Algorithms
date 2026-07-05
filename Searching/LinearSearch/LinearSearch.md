# Linear Search

## Overview

Linear Search (Sequential Search) is the simplest searching algorithm. It checks each element of a collection one by one until the target is found or the end of the collection is reached.

It works on both **sorted** and **unsorted** data.

---

## Algorithm

1. Start from the first element.
2. Compare the current element with the target.
3. If they match, return the index.
4. Otherwise, move to the next element.
5. If the end is reached without finding the target, return `-1`.

---

## Example

**Array**

```text
[10, 25, 7, 42, 15]
```

**Target**

```text
42
```

**Search Process**

```text
10 ❌
25 ❌
7  ❌
42 ✅
```

**Output**

```text
Index = 3
```

---

## Pseudocode

```text
for each element in array
    if element == target
        return index

return -1
```

---

## Time Complexity

| Case | Complexity |
|------|------------|
| Best | O(1) |
| Average | O(n) |
| Worst | O(n) |

---

## Space Complexity

```text
O(1)
```

---

## Advantages

- Simple to implement
- Works on sorted and unsorted data
- No extra memory required
- Suitable for small datasets

---

## Disadvantages

- Slow for large datasets
- Checks elements one by one
- Less efficient than Binary Search on sorted data

---

## Applications

- Searching in small datasets
- Searching in unsorted arrays
- Linked lists
- Simple lookup operations

---

## Python

```python
index = linear_search(arr, target)
```

---

## Java

```java
int index = linearSearch(arr, target);
```

---

## Summary

- Sequential searching algorithm
- No sorting required
- Easy to understand and implement
- Best for small or unsorted collections
- Returns the index if found, otherwise `-1`