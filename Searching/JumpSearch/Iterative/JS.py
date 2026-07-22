import math


def jump_search(arr, target):
    n = len(arr)
    step = int(math.sqrt(n))
    prev = 0

    while prev < n and arr[min(step, n) - 1] < target:
        prev = step
        step += int(math.sqrt(n))

        if prev >= n:
            return -1

    while prev < min(step, n):
        if arr[prev] == target:
            return prev
        prev += 1

    return -1


arr = [2, 4, 6, 8, 10, 12, 14, 16, 18]
target = 12

index = jump_search(arr, target)

if index != -1:
    print("Element found at index", index)
else:
    print("Element not found.")