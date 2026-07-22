# Selection Sort

## Overview

Selection Sort is a simple comparison-based sorting algorithm that repeatedly selects the smallest element from the unsorted portion of the array and places it at the beginning. After each pass, the sorted portion of the array grows while the unsorted portion shrinks.

Although Selection Sort performs fewer swaps than Bubble Sort, it still has quadratic time complexity and is inefficient for large datasets.

---

## Prerequisites

- The array can contain any comparable elements.
- No prior sorting is required.

---

## Algorithm

1. Assume the first unsorted element is the minimum.
2. Traverse the remaining unsorted elements to find the actual minimum.
3. Swap the minimum element with the first unsorted element.
4. Move the boundary of the sorted portion one position to the right.
5. Repeat until the array is completely sorted.

---

## Pseudocode

```text
SelectionSort(arr)

for i = 0 to n-2

    minIndex = i

    for j = i+1 to n-1

        if arr[j] < arr[minIndex]

            minIndex = j

    swap(arr[i], arr[minIndex])
```

---

## Time Complexity

| Case | Complexity |
|------|------------|
| Best Case | O(n²) |
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
- Performs fewer swaps than Bubble Sort.
- Works well for small datasets.
- Requires constant extra space.

---

## Disadvantages

- Inefficient for large datasets.
- Not adaptive to already sorted arrays.
- Not a stable sorting algorithm.

---

## Applications

- Small datasets.
- Educational purposes.
- Situations where minimizing swaps is important.
- Embedded systems with limited memory.

---

## Example

### Input Array

```text
[64, 25, 12, 22, 11]
```

### Working

- Find the smallest element (11) and swap it with the first element.
- Repeat for the remaining unsorted portion.
- Continue until the entire array is sorted.

---

## Sample Input

```text
64 25 12 22 11
```

## Sample Output

```text
11 12 22 25 64
```

---

## Comparison with Bubble Sort

| Feature | Bubble Sort | Selection Sort |
|---------|-------------|----------------|
| Stable | Yes | No |
| Adaptive | Yes (Optimized) | No |
| Swaps | Many | Few |
| Best Case | O(n) | O(n²) |
| Worst Case | O(n²) | O(n²) |

---

## Conclusion

Selection Sort repeatedly selects the smallest element from the unsorted portion of the array and places it in its correct position. While it performs fewer swaps than Bubble Sort, its quadratic time complexity makes it suitable only for small datasets and educational purposes.