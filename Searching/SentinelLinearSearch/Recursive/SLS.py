def recursive_search(arr, key, index):
    if arr[index] == key:
        return index
    return recursive_search(arr, key, index + 1)

def sentinel_linear_search(arr, key):
    n = len(arr)
    last = arr[-1]
    arr[-1] = key
    index = recursive_search(arr, key, 0)
    arr[-1] = last
    if index < n - 1 or arr[-1] == key:
        return index
    return -1

arr = [15, 22, 18, 35, 40]
key = 35
index = sentinel_linear_search(arr, key)

if index != -1:
    print("Element found at index", index)
else:
    print("Element not found.")