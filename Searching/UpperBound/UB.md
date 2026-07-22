# Upper Bound

## Overview

Upper Bound is a variation of Binary Search used to find the **first position in a sorted array where the element is strictly greater than the target value**.

If no such element exists, it returns the size of the array (or indicates that no valid upper bound exists).

---

## Prerequisites

- The array must be sorted in ascending order.

---

## Algorithm

1. Initialize `left = 0` and `right = n - 1`.
2. Initialize `answer = n`.
3. Find the middle index `mid`.
4. If `arr[mid] > target`:
   - Store `mid` as the current answer.
   - Search the left half.
5. Otherwise, search the right half.
6. Repeat until `left > right`.
7. Return the stored answer.

---

## Pseudocode

```text
UpperBound(arr, target)

left = 0
right = n - 1
answer = n

while left <= right

    mid = left + (right-left)/2

    if arr[mid] > target
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
- Finds the first element greater than the target.
- Useful for insertion operations and range queries.
- Runs in logarithmic time.

---

## Disadvantages

- Requires the array to be sorted.
- Cannot be used efficiently on unsorted data.
- Slightly more complex than standard Binary Search.

---

## Applications

- Finding the insertion position after duplicate elements.
- Determining the upper limit of a range.
- Frequency counting in sorted arrays.
- Competitive programming and STL `upper_bound()` implementation.

---

## Example

### Input Array

```text
[2, 4, 6, 6, 8, 10]
```

### Target Element

```text
6
```

### Working

- mid = 6
- Since 6 is not greater than the target, search the right half.
- The first element greater than 6 is 8.
- Upper Bound found at index **4**.

---

## Sample Input

```text
Enter target element: 6
```

## Sample Output

```text
Upper Bound Index = 4
```

---

## Comparison with Lower Bound

| Feature | Lower Bound | Upper Bound |
|---------|-------------|-------------|
| Condition | First element ≥ target | First element > target |
| Duplicate Elements | Returns first occurrence | Returns first greater element |
| Sorted Array Required | Yes | Yes |
| Worst Case | O(log n) | O(log n) |

---

## Conclusion

Upper Bound is a Binary Search variation that efficiently finds the first position where an element is strictly greater than the target. It is commonly used in range queries, insertion operations, and searching problems involving sorted data.