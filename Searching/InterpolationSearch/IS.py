def interpolation_search(arr, key):

    low = 0
    high = len(arr) - 1

    while low <= high and key >= arr[low] and key <= arr[high]:

        if low == high:
            if arr[low] == key:
                return low
            return -1

        pos = low + ((key - arr[low]) * (high - low)) // (arr[high] - arr[low])

        if arr[pos] == key:
            return pos

        if arr[pos] < key:
            low = pos + 1
        else:
            high = pos - 1

    return -1


arr = [10, 20, 30, 40, 50, 60, 70, 80, 90]

print("Array:", *arr)

key = int(input("Enter element to search: "))

result = interpolation_search(arr, key)

if result == -1:
    print("Element not found.")
else:
    print("Element found at index", result)