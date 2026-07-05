def linear_search(arr, target, index):
    # reached end of the array
    if index == len(arr):
        return -1
    # target found
    if arr[index] == target:
        return index
    # recursive call
    return linear_search(arr, target, index + 1)

arr = [10, 43, 68, 77, 23]

target = 77
index = linear_search(arr, target, 0)
if index != -1:
    print(f"Element {target} found at index {index}.")
else:
    print(f"Element {target} not found.")

target = 40
index = linear_search(arr, target, 0)
if index != -1:
    print(f"Element {target} found at index {index}.")
else:
    print(f"Element {target} not found.")