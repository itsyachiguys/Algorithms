# Binary Search

## Overview

Binary Search is a searching algorithm used to find the position of a target element in a **sorted array or list**. It works by repeatedly dividing the search interval in half, making it much faster than Linear Search for sorted data.

---

## Prerequisites

* The array/list **must be sorted** in ascending or descending order.
* Random access to elements should be available (such as arrays).

---

## Algorithm

1. Initialize:

   * `low = 0`
   * `high = n - 1`
2. Find the middle index:

   ```
   mid = low + (high - low) / 2
   ```
3. Compare the middle element with the target.

   * If equal, return the index.
   * If the target is smaller, search the left half.
   * If the target is larger, search the right half.
4. Repeat until the element is found or the search space becomes empty.

---

## Time Complexity

| Case         | Complexity |
| ------------ | ---------- |
| Best Case    | O(1)       |
| Average Case | O(log n)   |
| Worst Case   | O(log n)   |

---

## Space Complexity

| Version   | Complexity                        |
| --------- | --------------------------------- |
| Iterative | O(1)                              |
| Recursive | O(log n) (due to recursion stack) |

---

## Advantages

* Very fast for sorted data.
* Requires fewer comparisons than Linear Search.
* Efficient for large datasets.

---

## Disadvantages

* Works only on sorted data.
* Sorting may add extra overhead if the data is initially unsorted.
* Not suitable for linked lists because random access is required.

---

## Applications

* Searching in sorted arrays.
* Dictionary and phonebook lookups.
* Database indexing.
* Library management systems.
* Searching in large datasets.
* Competitive programming.

---

## Example

Array:

```
[10, 20, 30, 40, 50, 60, 70]
```

Target:

```
50
```

Steps:

1. Middle = 40
2. 50 > 40 → Search right half
3. Middle = 60
4. 50 < 60 → Search left half
5. Middle = 50 → Element found.

Output:

```
Element found at index 4
```
