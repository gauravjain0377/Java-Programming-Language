"""
Given an array and Q queries, find the sum between L and R.

Example:

Array:
2 4 6 8 10

Query:

1 3

Means:

arr[1] + arr[2] + arr[3]

= 4 + 6 + 8

= 18
Prefix array
Index:   0   1   2   3   4
Array:   2   4   6   8  10
Prefix:  2   6  12  20  30

For L = 1, R = 3:

sum = prefix[R] - prefix[L - 1]

sum = prefix[3] - prefix[0]

sum = 20 - 2

sum = 18


"""

"""
Another Example
Input:
5
2 4 6 8 10      -> 2 6 12 20 30
3
1 3
0 2
2 4

Output:

18
12
24

"""


n = int(input())
arr = list(map(int, input().split()))

prefix = [0] * n

prefix[0] = arr[0]

for i in range(1, n):
    prefix[i] = prefix[i - 1] + arr[i]

q = int(input())

for _ in range(q):

    l, r = map(int, input().split())

    if l == 0:
        print(prefix[r])
    else:
        print(prefix[r] - prefix[l - 1])