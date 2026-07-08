# Fibonacci Search

## Overview

Fibonacci Search is an efficient searching algorithm used to locate an element in a **sorted array**. Instead of dividing the array into equal halves like Binary Search, it uses **Fibonacci numbers** to determine the search positions.

The algorithm repeatedly narrows the search interval using Fibonacci numbers until the target element is found or the search space becomes empty.

---

## Prerequisites

- The array must be sorted in ascending order.

---

## Algorithm

1. Generate the smallest Fibonacci number greater than or equal to the array size.
2. Compare the target element with the element at the calculated Fibonacci index.
3. If the target is greater, eliminate the left portion.
4. If the target is smaller, eliminate the right portion.
5. Repeat until the element is found or no elements remain.

---

## Pseudocode

```text
Initialize fibMMm2 = 0
Initialize fibMMm1 = 1
fibM = fibMMm1 + fibMMm2

while fibM < n
    fibMMm2 = fibMMm1
    fibMMm1 = fibM
    fibM = fibMMm1 + fibMMm2

offset = -1

while fibM > 1

    i = min(offset + fibMMm2, n - 1)

    if arr[i] < key
        fibM = fibMMm1
        fibMMm1 = fibMMm2
        fibMMm2 = fibM - fibMMm1
        offset = i

    else if arr[i] > key
        fibM = fibMMm2
        fibMMm1 = fibMMm1 - fibMMm2
        fibMMm2 = fibM - fibMMm1

    else
        return i

if fibMMm1 == 1 and arr[offset + 1] == key
    return offset + 1

return -1
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
|---------------|------------|
| Iterative | O(1) |

---

## Advantages

- Efficient for searching sorted arrays.
- Requires no division operation.
- Useful on systems where arithmetic operations are expensive.
- Comparable performance to Binary Search.

---

## Disadvantages

- Works only on sorted arrays.
- More complex than Binary Search.
- Less commonly used in practice.

---

## Applications

- Searching in sorted arrays.
- Large databases.
- Memory-efficient searching.
- Systems with slow division operations.

---

## Example

### Input Array

```text
[10, 20, 30, 40, 50, 60, 70, 80, 90]
```

### Target Element

```text
70
```

### Working

- Generate Fibonacci numbers until one exceeds the array size.
- Compare the target using Fibonacci offsets.
- Narrow the search interval.
- Element found at index **6**.

---

## Sample Input

```text
Enter element to search: 70
```

## Sample Output

```text
Element found at index 6
```

---

## Comparison with Binary Search

| Feature | Binary Search | Fibonacci Search |
|---------|---------------|------------------|
| Requires Sorted Array | Yes | Yes |
| Uses Division | Yes | No |
| Best Case | O(1) | O(1) |
| Worst Case | O(log n) | O(log n) |
| Practical Usage | Very Common | Less Common |

---

## Conclusion

Fibonacci Search is a divide-and-conquer searching algorithm that uses Fibonacci numbers to determine the search range. It provides logarithmic search time and is particularly useful where division operations are expensive or inefficient.