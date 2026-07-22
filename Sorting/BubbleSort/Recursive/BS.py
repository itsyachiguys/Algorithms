def bubble_sort(arr, n):

    if n == 1:
        return

    for i in range(n - 1):

        if arr[i] > arr[i + 1]:
            arr[i], arr[i + 1] = arr[i + 1], arr[i]

    bubble_sort(arr, n - 1)


arr = [64, 34, 25, 12, 22, 11, 90]

print("Original Array:")
print(arr)

bubble_sort(arr, len(arr))

print("Sorted Array:")
print(arr)