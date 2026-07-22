# Bubble Sort

## Overview

Bubble Sort is a simple comparison-based sorting algorithm that repeatedly compares adjacent elements and swaps them if they are in the wrong order. After each pass, the largest unsorted element "bubbles up" to its correct position at the end of the array.

Although easy to understand and implement, Bubble Sort is inefficient for large datasets.

---

## Prerequisites

- The array can contain any comparable elements.
- No prior sorting is required.

---

## Algorithm

1. Start from the first element.
2. Compare each pair of adjacent elements.
3. Swap them if they are in the wrong order.
4. Continue until the end of the array.
5. Repeat the process for the remaining unsorted portion.
6. Stop when no swaps occur in a complete pass.

---

## Pseudocode

```text
BubbleSort(arr)

for i = 0 to n-2

    swapped = false

    for j = 0 to n-i-2

        if arr[j] > arr[j+1]

            swap(arr[j], arr[j+1])

            swapped = true

    if swapped == false

        break
```

---

## Time Complexity

| Case | Complexity |
|------|------------|
| Best Case | O(n) |
| Average Case | O(n²) |
| Worst Case | O(n²) |

---

## Space Complexity

| Implementation | Complexity |
|---------------|------------|
| Iterative | O(1) |
| Recursive | O(n) |

---

## Advantages

- Easy to understand and implement.
- Stable sorting algorithm.
- Detects an already sorted array using the optimized version.
- Requires no extra memory.

---

## Disadvantages

- Inefficient for large datasets.
- Performs many unnecessary comparisons.
- Much slower than advanced sorting algorithms.

---

## Applications

- Educational purposes.
- Small datasets.
- Detecting nearly sorted arrays.
- Understanding sorting concepts.

---

## Example

### Input Array

```text
[64, 34, 25, 12, 22, 11, 90]
```

### Working

- Compare adjacent elements.
- Swap whenever needed.
- Largest element moves to the end after each pass.
- Continue until the array becomes sorted.

---

## Sample Input

```text
64 34 25 12 22 11 90
```

## Sample Output

```text
11 12 22 25 34 64 90
```

---

## Comparison with Selection Sort

| Feature | Bubble Sort | Selection Sort |
|---------|-------------|----------------|
| Stable | Yes | No |
| Adaptive | Yes (Optimized) | No |
| Swaps | Many | Few |
| Best Case | O(n) | O(n²) |
| Worst Case | O(n²) | O(n²) |

---

## Conclusion

Bubble Sort repeatedly swaps adjacent elements until the array becomes sorted. While it is simple and stable, its quadratic time complexity makes it unsuitable for large datasets. It is mainly used for educational purposes and for understanding the fundamentals of sorting algorithms.