# from https://www.acmicpc.net/problem/1260

import sys
from collections import deque

N, M, V = map(int, sys.stdin.readline().split(" "))
adj_matrix = []
visited = [False] * (N + 1)

for i in range(0, N + 1):
    adj_matrix.append([0] * (N + 1))

for i in range(0, M):
    start, end = map(int, sys.stdin.readline().split(" "))
    adj_matrix[start][end] = adj_matrix[end][start] = 1


def DFS(start):
    visited[start] = True
    print(start, end=" ")

    for i in range(1, N + 1):
        if adj_matrix[start][i] == 1 and not visited[i]:
            DFS(i)


def BFS(start):
    deq = deque()
    deq.append(start)
    visited[start] = True

    while len(deq) != 0:
        vertex = deq.popleft()
        print(vertex, end=" ")

        for i in range(1, N + 1):
            if adj_matrix[vertex][i] == 1 and not visited[i]:
                visited[i] = True
                deq.append(i)


DFS(V)
print()
visited = [False] * (N + 1)
BFS(V)
