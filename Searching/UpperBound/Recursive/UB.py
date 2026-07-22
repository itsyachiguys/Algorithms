def upper_bound(arr, left, right, target, ans):

    if left > right:
        return ans

    mid = left + (right - left) // 2

    if arr[mid] > target:
        return upper_bound(arr, left, mid - 1, target, mid)

    return upper_bound(arr, mid + 1, right, target, ans)


arr = [2, 4, 6, 6, 8, 10]
target = 6

index = upper_bound(arr, 0, len(arr) - 1, target, len(arr))

if index == len(arr):
    print("No Upper Bound Found")
else:
    print("Upper Bound Index:", index)