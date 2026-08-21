# Equilibrium Index / Middle Index

# Input
# 7
# -7 1 5 2 -4 3 0
# Output
# 3



# For:

# arr = [-7, 1, 5, 2, -4, 3, 0]
# At index 3:
# Left:
# -7 + 1 + 5 = -1
# Right:
# -4 + 3 + 0 = -1
# Therefore:
# Answer = 3



defx(arr equilibrium_inde):

    total_sum = 0

    # Calculate total sum
    for num in arr:
        total_sum += num

    left_sum = 0

    for i in range(len(arr)):

        right_sum = total_sum - left_sum - arr[i]

        if left_sum == right_sum:
            return i

        left_sum += arr[i]

    return -1


n = int(input())

arr = list(map(int, input().split()))

print(equilibrium_index(arr))