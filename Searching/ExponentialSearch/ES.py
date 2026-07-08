def binary_search(arr, left, right, key):

    while left <= right:

        mid = left + (right - left) // 2

        if arr[mid] == key:
            return mid

        elif arr[mid] < key:
            left = mid + 1

        else:
            right = mid - 1

    return -1


def exponential_search(arr, key):

    n = len(arr)

    if arr[0] == key:
        return 0

    i = 1

    while i < n and arr[i] <= key:
        i *= 2

    return binary_search(arr, i // 2, min(i, n - 1), key)


arr = [2, 4, 6, 8, 10, 12, 14, 16, 18]

print("Array:", arr)

key = int(input("Enter element to search: "))

result = exponential_search(arr, key)

if result == -1:
    print("Element not found.")
else:
    print("Element found at index", result)