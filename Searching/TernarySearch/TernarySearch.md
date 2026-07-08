# Ternary Search

## Overview

Ternary Search is a divide-and-conquer searching algorithm used to find a target element in a **sorted array**. Unlike Binary Search, which divides the search space into two parts, Ternary Search divides it into **three parts** using two middle indices.

It repeatedly narrows the search range until the target element is found or the search interval becomes empty.

---

## Prerequisites

- The array must be sorted in ascending order.

---

## Algorithm

1. Initialize `left = 0` and `right = n - 1`.
2. Calculate two middle indices:
   - `mid1 = left + (right - left) / 3`
   - `mid2 = right - (right - left) / 3`
3. Compare the target with `arr[mid1]` and `arr[mid2]`.
4. If the target matches either middle element, return its index.
5. If the target is smaller than `arr[mid1]`, search the left third.
6. If the target is greater than `arr[mid2]`, search the right third.
7. Otherwise, search the middle third.
8. Repeat until the element is found or the search interval becomes empty.

---

## Pseudocode

```text
TernarySearch(arr, left, right, key)

while left <= right

    mid1 = left + (right-left)/3
    mid2 = right - (right-left)/3

    if arr[mid1] == key
        return mid1

    if arr[mid2] == key
        return mid2

    if key < arr[mid1]
        right = mid1 - 1

    else if key > arr[mid2]
        left = mid2 + 1

    else
        left = mid1 + 1
        right = mid2 - 1

return -1
```

---

## Time Complexity

| Case | Complexity |
|------|------------|
| Best Case | O(1) |
| Average Case | O(log₃ n) |
| Worst Case | O(log₃ n) |

---

## Space Complexity

| Implementation | Complexity |
|---------------|------------|
| Iterative | O(1) |
| Recursive | O(log₃ n) |

---

## Advantages

- Efficient for searching sorted arrays.
- Divide-and-conquer approach.
- Simple recursive implementation.

---

## Disadvantages

- Requires a sorted array.
- Performs more comparisons than Binary Search.
- Binary Search is generally faster in practice.

---

## Applications

- Searching in sorted arrays.
- Divide-and-conquer algorithms.
- Educational purposes for search algorithm comparison.

---

## Example

### Input Array

```text
[5, 10, 15, 20, 25, 30, 35, 40, 45]
```

### Target Element

```text
30
```

### Working

- mid1 = 15
- mid2 = 35
- Target lies between them.
- Search the middle third.
- Element found at index **5**.

---

## Sample Input

```text
Enter element to search: 30
```

## Sample Output

```text
Element found at index 5
```

---

## Comparison with Binary Search

| Feature | Binary Search | Ternary Search |
|---------|---------------|----------------|
| Number of Divisions | 2 | 3 |
| Sorted Array Required | Yes | Yes |
| Best Case | O(1) | O(1) |
| Worst Case | O(log n) | O(log₃ n) |
| Practical Performance | Faster | Slightly Slower |

---

## Conclusion

Ternary Search divides the search space into three equal parts using two middle indices. Although its asymptotic complexity is logarithmic, Binary Search is generally preferred because it performs fewer comparisons and is usually more efficient in practice.