# Insertion Sort

## Overview

Insertion Sort is a comparison-based sorting algorithm that builds the sorted array one element at a time. It picks an element from the unsorted portion and inserts it into its correct position within the sorted portion of the array.

It is efficient for small datasets and performs particularly well on nearly sorted arrays.

---

## Prerequisites

- The array can contain any comparable elements.
- No prior sorting is required.

---

## Algorithm

1. Assume the first element is already sorted.
2. Pick the next element as the key.
3. Compare the key with elements in the sorted portion.
4. Shift larger elements one position to the right.
5. Insert the key into its correct position.
6. Repeat until all elements are sorted.

---

## Pseudocode

```text
InsertionSort(arr)

for i = 1 to n-1

    key = arr[i]
    j = i - 1

    while j >= 0 and arr[j] > key

        arr[j + 1] = arr[j]
        j--

    arr[j + 1] = key
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

- Simple and easy to implement.
- Stable sorting algorithm.
- Adaptive for nearly sorted arrays.
- Efficient for small datasets.
- In-place sorting algorithm.

---

## Disadvantages

- Inefficient for large datasets.
- Quadratic time complexity in the average and worst cases.
- Performs many element shifts.

---

## Applications

- Small datasets.
- Nearly sorted arrays.
- Online sorting.
- Educational purposes.

---

## Example

### Input Array

```text
[12, 11, 13, 5, 6]
```

### Working

- Assume 12 is sorted.
- Insert 11 before 12.
- Insert 13 after 12.
- Insert 5 at the beginning.
- Insert 6 between 5 and 11.

---

## Sample Input

```text
12 11 13 5 6
```

## Sample Output

```text
5 6 11 12 13
```

---

## Comparison with Selection Sort

| Feature | Selection Sort | Insertion Sort |
|---------|----------------|----------------|
| Stable | No | Yes |
| Adaptive | No | Yes |
| Best Case | O(n²) | O(n) |
| Worst Case | O(n²) | O(n²) |
| Swaps/Shifts | Few Swaps | Many Shifts |

---

## Conclusion

Insertion Sort builds the sorted array one element at a time by inserting each new element into its proper position. It is a stable, adaptive, and in-place sorting algorithm that performs well for small or nearly sorted datasets but becomes inefficient for large collections due to its quadratic time complexity.