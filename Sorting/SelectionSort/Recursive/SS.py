def selection_sort(arr, start):

    if start >= len(arr) - 1:
        return

    min_index = start

    for i in range(start + 1, len(arr)):

        if arr[i] < arr[min_index]:
            min_index = i

    arr[start], arr[min_index] = arr[min_index], arr[start]

    selection_sort(arr, start + 1)


arr = [64, 25, 12, 22, 11]

print("Original Array:")
print(arr)

selection_sort(arr, 0)

print("Sorted Array:")
print(arr)