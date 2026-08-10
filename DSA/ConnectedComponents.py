# Connected Components in an Undirected Graph

# Sample Input:
# 5
# 3
# 1 2
# 2 3
# 4 5

# (Line 1: N = 5 cities, Line 2: M = 3 roads. Next M lines: connected pairs)

# Sample Output:
# 2

# Explanation:

# Cities {1, 2, 3} form Region 1. Cities {4, 5} form Region 2. Total disjoint regions = 2.


def dfs(node, graph, visited):

    visited[node] = True

    for neighbor in graph[node]:

        if not visited[neighbor]:
            dfs(neighbor, graph, visited)


n = int(input())
m = int(input())

graph = [[] for _ in range(n + 1)]
visited = [False] * (n + 1)

for _ in range(m):

    u, v = map(int, input().split())

    graph[u].append(v)
    graph[v].append(u)

components = 0

for i in range(1, n + 1):

    if not visited[i]:

        components += 1

        dfs(i, graph, visited)

print(components)