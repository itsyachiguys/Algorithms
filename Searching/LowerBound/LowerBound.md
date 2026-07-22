# Lower Bound

## Overview

Lower Bound is a variation of Binary Search used to find the **first position in a sorted array where the element is greater than or equal to the target value**.

If the target exists multiple times, Lower Bound returns the index of its first occurrence. If no element satisfies the condition, it returns the size of the array (or indicates that no valid lower bound exists).

---

## Prerequisites

- The array must be sorted in ascending order.

---

## Algorithm

1. Initialize `left = 0` and `right = n - 1`.
2. Initialize `answer = n`.
3. Find the middle index `mid`.
4. If `arr[mid] >= target`:
   - Store `mid` as the current answer.
   - Search the left half.
5. Otherwise, search the right half.
6. Repeat until `left > right`.
7. Return the stored answer.

---

## Pseudocode

```text
LowerBound(arr, target)

left = 0
right = n - 1
answer = n

while left <= right

    mid = left + (right-left)/2

    if arr[mid] >= target
        answer = mid
        right = mid - 1

    else
        left = mid + 1

return answer
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
| Recursive | O(log n) |

---

## Advantages

- Efficient for searching sorted arrays.
- Finds the first occurrence satisfying the condition.
- Useful for insertion operations in sorted arrays.
- Runs in logarithmic time.

---

## Disadvantages

- Requires the array to be sorted.
- Cannot be used efficiently on unsorted data.
- Slightly more complex than standard Binary Search.

---

## Applications

- Finding the insertion position in a sorted array.
- Finding the first occurrence of an element.
- Frequency counting in sorted arrays.
- Competitive programming and STL `lower_bound()` implementation.

---

## Example

### Input Array

```text
[2, 4, 6, 8, 10]
```

### Target Element

```text
5
```

### Working

- mid = 6
- Since 6 ≥ 5, store index 2.
- Continue searching in the left half.
- No smaller valid index exists.
- Lower Bound found at index **2**.

---

## Sample Input

```text
Enter target element: 5
```

## Sample Output

```text
Lower Bound Index = 2
```

---

## Comparison with Binary Search

| Feature | Binary Search | Lower Bound |
|---------|---------------|-------------|
| Purpose | Find an exact element | Find the first element ≥ target |
| Sorted Array Required | Yes | Yes |
| Best Case | O(1) | O(1) |
| Worst Case | O(log n) | O(log n) |
| Returns | Index of target or -1 | First valid index or n |

---

## Conclusion

Lower Bound is a Binary Search variation that efficiently finds the first position where an element is greater than or equal to the target. It is widely used in searching, insertion operations, range queries, and forms the basis of the `lower_bound()` function available in many standard libraries.