def sentinel_linear_search(arr, key):
    n = len(arr)
    last = arr[-1]
    arr[-1] = key
    i = 0
    while arr[i] != key:
        i += 1
    arr[-1] = last
    if i < n - 1 or last == key:
        return i
    return -1


arr = [10, 20, 30, 40, 50]

key = 40

index = sentinel_linear_search(arr, key)

if index != -1:
    print("Element found at index", index)
else:
    print("Element not found")