# problem : https://www.acmicpc.net/problem/2667

import sys

N = int(sys.stdin.readline().rstrip())
grid = list()
answer = list()
visited = list()
count = 1
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

for i in range(0, N):
    grid_row = list(map(int, sys.stdin.readline().rstrip()))
    visit_row = [False] * N
    grid.append(grid_row)
    visited.append(visit_row)


def dfs(x: int, y: int):
    global count
    visited[x][y] = True

    for i in range(0, 4):
        new_x = x + dx[i]
        new_y = y + dy[i]

        if new_x < 0 or new_x >= N or new_y < 0 or new_y >= N or visited[new_x][new_y] or grid[new_x][new_y] == 0:
            continue

        count += 1
        dfs(new_x, new_y)


for i in range(0, N):
    for j in range(0, N):
        if grid[i][j] == 1 and not visited[i][j]:
            count = 1
            dfs(i, j)
            answer.append(count)

print(len(answer))
answer.sort()
for item in answer:
    print(item)
