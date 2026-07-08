def fibonacci_search(arr, key):
    n = len(arr)
    fibMMm2 = 0
    fibMMm1 = 1
    fibM = fibMMm1 + fibMMm2

    while fibM < n:
        fibMMm2 = fibMMm1
        fibMMm1 = fibM
        fibM = fibMMm1 + fibMMm2
    offset = -1

    while fibM > 1:
        i = min(offset + fibMMm2, n - 1)
        if arr[i] < key:
            fibM = fibMMm1
            fibMMm1 = fibMMm2
            fibMMm2 = fibM - fibMMm1
            offset = i
        elif arr[i] > key:
            fibM = fibMMm2
            fibMMm1 = fibMMm1 - fibMMm2
            fibMMm2 = fibM - fibMMm1
        else:
            return i

    if fibMMm1 and offset + 1 < n and arr[offset + 1] == key:
        return offset + 1
    return -1


arr = [10, 20, 30, 40, 50, 60, 70, 80, 90]

print("Array:", arr)

key = int(input("Enter element to search: "))

result = fibonacci_search(arr, key)

if result == -1:
    print("Element not found.")
else:
    print("Element found at index", result)