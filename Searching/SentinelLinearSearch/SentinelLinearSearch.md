# Sentinel Linear Search

## Overview

Sentinel Linear Search is an optimized version of Linear Search that eliminates the need to check array boundaries during every iteration.

It works by temporarily placing the target element (called the **sentinel**) at the last position of the array. This guarantees that the search will eventually terminate without repeatedly checking whether the index has reached the end of the array.

Although the time complexity remains the same as Linear Search, Sentinel Linear Search performs fewer comparisons, making it slightly faster in practice.

---

## Algorithm

1. Save the last element of the array.
2. Replace the last element with the target value (sentinel).
3. Start searching from the beginning.
4. Stop when the target is found.
5. Restore the original last element.
6. Determine whether the target was originally present.

---

## Pseudocode

```
SentinelLinearSearch(arr, key)

last ← arr[n−1]

arr[n−1] ← key

i ← 0

while arr[i] ≠ key
      i ← i + 1

arr[n−1] ← last

if i < n−1 OR last = key
      return i

return -1
```

---

## Time Complexity

| Case | Complexity |
|------|------------|
| Best | O(1) |
| Average | O(n) |
| Worst | O(n) |

---

## Space Complexity

O(1)

---

## Advantages

- Fewer comparisons than Linear Search
- No boundary checking inside the loop
- Easy to implement
- Slightly faster than standard Linear Search

---

## Disadvantages

- Modifies the last element temporarily
- Works only when the array is mutable
- Still has linear time complexity

---

## Applications

- Searching in unsorted arrays
- Small datasets
- Embedded systems
- Compiler optimization examples
- Educational purposes

---

## Example

Input

```
Array = [10, 20, 30, 40, 50]
Key = 40
```

Output

```
Element found at index 3
```

---

## Java Implementation

See:

```
Iterative/SLS.java
Recursive/SLS.java
```

---

## Python Implementation

See:

```
Iterative/SLS.py
Recursive/SLS.py
```