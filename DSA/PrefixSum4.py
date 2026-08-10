# Subarray Sum Equals K

# Example:
# arr = [1, 2, 3]
# K = 3
# Valid subarrays:

# [1, 2] = 3
# [3]    = 3
# Answer:
# 2



# Input
# 3 3
# 1 2 3
# Output
# 2



def subarray_sum(arr, k):

    frequency = {0: 1}

    prefix_sum = 0
    count = 0

    for num in arr:

        prefix_sum += num

        required = prefix_sum - k

        if required in frequency:
            count += frequency[required]

        if prefix_sum in frequency:
            frequency[prefix_sum] += 1
        else:
            frequency[prefix_sum] = 1

    return count


n, k = map(int, input().split())

arr = list(map(int, input().split()))

print(subarray_sum(arr, k))