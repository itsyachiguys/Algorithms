# Jump Search

## Overview

Jump Search is a searching algorithm used to find an element in a **sorted array**. Instead of checking every element one by one, it jumps ahead by a fixed block size and then performs a linear search within the identified block.

The optimal jump size is **√n**, making Jump Search more efficient than Linear Search for large sorted arrays.

---

## Prerequisites

- The array must be sorted in ascending order.

---

## Algorithm

1. Calculate the optimal jump size as `√n`.
2. Jump ahead by one block at a time until an element greater than or equal to the target is found.
3. Perform a linear search within the identified block.
4. If the target is found, return its index.
5. Otherwise, return `-1`.

---

## Pseudocode

```text
JumpSearch(arr, key)

step = √n
prev = 0

while arr[min(step,n)-1] < key

    prev = step
    step = step + √n

    if prev >= n
        return -1

while prev < min(step,n)

    if arr[prev] == key
        return prev

    prev++

return -1
```

---

## Time Complexity

| Case | Complexity |
|------|------------|
| Best Case | O(1) |
| Average Case | O(√n) |
| Worst Case | O(√n) |

---

## Space Complexity

| Implementation | Complexity |
|---------------|------------|
| Iterative | O(1) |

---

## Advantages

- Faster than Linear Search for sorted arrays.
- Simple to implement.
- Requires only constant extra space.
- Efficient for moderately sized sorted datasets.

---

## Disadvantages

- Requires a sorted array.
- Slower than Binary Search for large datasets.
- Choosing an improper jump size reduces efficiency.

---

## Applications

- Searching in sorted arrays.
- Memory systems where jumping through blocks is efficient.
- Educational comparison with Linear and Binary Search.

---

## Example

### Input Array

```text
[2, 4, 6, 8, 10, 12, 14, 16, 18]
```

### Target Element

```text
12
```

### Working

- Jump size = 3.
- Jump from 2 → 8 → 14.
- Target lies between 8 and 14.
- Perform linear search in that block.
- Element found at index **5**.

---

## Sample Input

```text
Enter element to search: 12
```

## Sample Output

```text
Element found at index 5
```

---

## Comparison with Binary Search

| Feature | Binary Search | Jump Search |
|---------|---------------|-------------|
| Sorted Array Required | Yes | Yes |
| Search Strategy | Divide and Conquer | Block Jump + Linear Search |
| Best Case | O(1) | O(1) |
| Worst Case | O(log n) | O(√n) |
| Practical Performance | Faster | Slower |

---

## Conclusion

Jump Search improves upon Linear Search by skipping blocks of elements before performing a linear search within a smaller range. Although it is generally slower than Binary Search, it is an efficient and easy-to-understand algorithm for searching sorted arrays.