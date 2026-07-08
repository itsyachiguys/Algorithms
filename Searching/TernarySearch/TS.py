def ternary_search(arr, left, right, key):

    while left <= right:
        mid1 = left + (right - left) // 3
        mid2 = right - (right - left) // 3
        if arr[mid1] == key:
            return mid1
        if arr[mid2] == key:
            return mid2
        if key < arr[mid1]:
            right = mid1 - 1
        elif key > arr[mid2]:
            left = mid2 + 1
        else:
            left = mid1 + 1
            right = mid2 - 1
    return -1


arr = [5, 10, 15, 20, 25, 30, 35, 40, 45]
print("Array:", arr)

key = int(input("Enter element to search: "))

result = ternary_search(arr, 0, len(arr) - 1, key)

if result == -1:
    print("Element not found.")
else:
    print("Element found at index", result)