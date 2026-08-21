n = int(input())
arr = list(map(int, input().split()))

prefix = [0] * n

prefix[0] = arr[0]

for i in range(1, n):
    prefix[i] = prefix[i - 1] + arr[i]

print(*prefix)


"""
Given an array, calculate the sum from the beginning up to every index.
Input
5
2 4 6 8 10
Output
2 6 12 20 30
Complexity
Time:  O(N)
Space: O(N)
"""