n = int(input())

arr = list(map(int, input().split()))

q = int(input())

for _ in range(q):

    target = int(input())

    seen = set()
    found = False

    for num in arr:

        required = target - num

        if required in seen:
            found = True
            break

        seen.add(num)

    if found:
        print("YES")
    else:
        print("NO")


"""
Input
5
2 7 11 15 2
4
9
20
4
100
Output
YES
NO
YES
NO
     """



# n = int(input())

# arr = list(map(int, input().split()))

# q = int(input())

# for _ in range(q):

#     target = int(input())

#     frequency = {}

#     count = 0

#     for num in arr:

#         required = target - num

#         count += frequency.get(required, 0)

#         frequency[num] = frequency.get(num, 0) + 1

#     print(count)


"""
Input:

4
2 2 2 7
1
4

Output:

3

This version is NOT asking whether a pair exists.

It is asking HOW MANY pairs exist.
"""




n = int(input())

arr = list(map(int, input().split()))

target = int(input())

seen = {}

found = False

for i in range(n):

    required = target - arr[i]

    if required in seen:
        print(seen[required], i)
        found = True
        break

    if arr[i] not in seen:
        seen[arr[i]] = i

if not found:
    print(-1, -1)


"""
The question says:

Find the indices of two distinct elements whose sum equals the target.

Example:

Array = [2, 7, 11, 15]

Target = 9

Answer:

0 1

Because:

arr[0] + arr[1]
= 2 + 7
= 9
 """