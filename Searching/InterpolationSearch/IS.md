# Interpolation Search

## Overview

Interpolation Search is an efficient searching algorithm used to locate a target element in a **sorted and uniformly distributed array**. Unlike Binary Search, which always examines the middle element, Interpolation Search estimates the probable position of the target based on its value.

It works similarly to searching for a name in a telephone directory, where you estimate the approximate location instead of starting from the middle.

Interpolation Search performs exceptionally well when the values in the array are **evenly distributed**, making it faster than Binary Search in average cases.

---

## Prerequisites

- The array must be sorted in ascending order.
- The elements should be uniformly (or nearly uniformly) distributed for optimal performance.

---

## Algorithm

1. Initialize two pointers:
   - `low = 0`
   - `high = n - 1`
2. Check whether the target lies within the range `arr[low]` and `arr[high]`.
3. Estimate the probable position (`pos`) of the target using the interpolation formula.
4. Compare the target element with `arr[pos]`.
5. If they are equal, return the index.
6. If the target is greater than `arr[pos]`, search the right subarray.
7. If the target is smaller than `arr[pos]`, search the left subarray.
8. Repeat until the element is found or the search interval becomes invalid.

---

## Formula Used

The estimated position is calculated using the following formula:

```text
pos = low + ((key - arr[low]) × (high - low))
             -----------------------------------
              (arr[high] - arr[low])
```

This formula predicts where the target is likely to be located based on its value.

---

## Pseudocode

```text
InterpolationSearch(arr, key)

low = 0
high = length(arr) - 1

while low <= high AND
      key >= arr[low] AND
      key <= arr[high]

    if low == high

        if arr[low] == key
            return low

        return -1

    pos = low +
          ((key - arr[low]) * (high - low)) /
          (arr[high] - arr[low])

    if arr[pos] == key
        return pos

    if arr[pos] < key
        low = pos + 1

    else
        high = pos - 1

return -1
```

---

## Time Complexity

| Case | Complexity |
|------|------------|
| Best Case | O(1) |
| Average Case | O(log log n) |
| Worst Case | O(n) |

---

## Space Complexity

| Implementation | Complexity |
|---------------|------------|
| Iterative | O(1) |
| Recursive | O(log log n) (if implemented recursively) |

---

## Advantages

- Faster than Binary Search for uniformly distributed data.
- Requires only constant extra memory.
- Efficient for large sorted datasets with evenly spaced values.
- Predicts the likely location of the target, reducing the number of comparisons.

---

## Disadvantages

- Requires the array to be sorted.
- Performance degrades significantly when data is not uniformly distributed.
- Worst-case complexity is linear.
- Not suitable for datasets with irregular spacing between elements.

---

## Applications

- Searching in large sorted numerical datasets.
- Database indexing with uniformly distributed keys.
- Telephone directories and similar ordered records.
- Scientific and statistical datasets.
- Memory indexing and lookup tables.

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

- low = 0
- high = 8
- Estimated position = 6
- arr[6] = 70
- Element found immediately at index **6**.

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

| Feature | Binary Search | Interpolation Search |
|---------|---------------|----------------------|
| Search Strategy | Middle Element | Estimated Position |
| Sorted Array Required | Yes | Yes |
| Uniform Distribution Required | No | Yes (Recommended) |
| Best Case | O(1) | O(1) |
| Average Case | O(log n) | O(log log n) |
| Worst Case | O(log n) | O(n) |
| Practical Performance | Consistent | Excellent for Uniform Data |

---

## Conclusion

Interpolation Search improves upon Binary Search by estimating the most probable position of the target element instead of always selecting the middle element. When the array contains uniformly distributed values, it achieves an average time complexity of **O(log log n)**, making it one of the fastest searching algorithms for such datasets.

However, if the data is unevenly distributed, its performance may degrade to **O(n)**. Therefore, Interpolation Search is most effective when used on **large, sorted, and uniformly distributed arrays**.