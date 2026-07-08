# Exponential Search

## Overview

Exponential Search is an efficient searching algorithm used to find a target element in a **sorted array**. It works by first identifying a range where the target element may exist using exponential jumps (1, 2, 4, 8, ...), and then applying **Binary Search** within that range.

It is particularly useful for searching in **large** or **unbounded (infinite)** sorted arrays.

---

## Prerequisites

- The array must be **sorted** in ascending order.
- Binary Search is used after determining the search range.

---

## Algorithm

1. Check if the first element is the target.
2. Initialize `i = 1`.
3. Double the index (`i = i × 2`) until:
   - `i` becomes greater than or equal to the array size, or
   - `arr[i]` becomes greater than the target.
4. Perform Binary Search between:
   - `i / 2`
   - `min(i, n - 1)`
5. If the element is found, return its index; otherwise, return `-1`.

---

## Pseudocode

```text
ExponentialSearch(arr, key)

if arr[0] == key
    return 0

i = 1

while i < n and arr[i] <= key
    i = i * 2

return BinarySearch(arr, i/2, min(i, n-1), key)
```

---

## Time Complexity

| Case | Complexity |
|------|------------|
| Best Case | O(1) |
| Average Case | O(log n) |
| Worst Case | O(log n) |

---

## Space Complexity

| Implementation | Complexity |
|----------------|------------|
| Iterative | O(1) |
| Recursive Binary Search | O(log n) |

---

## Advantages

- Faster than Linear Search on sorted arrays.
- Efficient for large datasets.
- Suitable for infinite or unbounded sorted arrays.
- Reduces the search space quickly.

---

## Disadvantages

- Works only on sorted arrays.
- Requires Binary Search as a subroutine.
- Less efficient than Binary Search for small arrays.

---

## Applications

- Searching in large sorted datasets.
- Infinite or unbounded arrays.
- Database indexing.
- Search engines.
- Memory-efficient searching.

---

## Example

**Input Array**

```text
[2, 4, 6, 8, 10, 12, 14, 16, 18]
```

**Target Element**

```text
14
```

### Working

- Compare with first element (2).
- Jump to indices: 1 → 2 → 4 → 8.
- Target lies between indices **4** and **8**.
- Perform Binary Search in this range.
- Element found at index **6**.

---

## Sample Input

```text
Enter element to search: 14
```

## Sample Output

```text
Element found at index 6
```

---

## Comparison with Binary Search

| Feature | Binary Search | Exponential Search |
|---------|---------------|--------------------|
| Requires Sorted Array | Yes | Yes |
| Search Technique | Divide and Conquer | Exponential Range + Binary Search |
| Best Case | O(1) | O(1) |
| Worst Case | O(log n) | O(log n) |
| Suitable for Infinite Arrays | No | Yes |

---

## Conclusion

Exponential Search is an efficient searching algorithm that combines exponential range expansion with Binary Search. It is especially useful for searching in very large or infinite sorted arrays, while maintaining a logarithmic time complexity.