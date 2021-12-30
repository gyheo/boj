# from https://www.acmicpc.net/problem/17471

import sys

N = int(sys.stdin.readline())
people = list(map(int, sys.stdin.readline().split()))
people.insert(0, 0)
is_selected = [False] * (N + 1)
adj_matrix = []
result = sys.maxsize

for i in range(0, N + 1):
    adj_matrix.append([0] * (N + 1))

for i in range(1, N + 1):
    arr = list(map(int, sys.stdin.readline().split()))
    for j in range(1, arr[0] + 1):
        adj_matrix[i][arr[j]] = 1


def DFS(start, visited):
    # 선거구 지역별 연결 여부 확인
    visited[start] = True

    for i in range(1, N + 1):
        if not visited[i] and is_selected[start] == is_selected[i] and adj_matrix[start][i] == 1:
            DFS(i, visited)


def divide(cnt):
    # 선거구 나누기
    if cnt == N:
        flag = True
        for i in range(1, N):
            if is_selected[i] != is_selected[i + 1]:
                flag = False

        # 선거구를 한쪽으로만 나눴을 때 가지치기
        if flag:
            return

        for i in range(1, N + 1):
            if is_selected[i]:
                start_red = i
                break

        for i in range(1, N + 1):
            if not is_selected[i]:
                start_blue = i
                break

        visited = [False] * (N + 1)

        DFS(start_red, visited)
        DFS(start_blue, visited)

        for i in range(1, N + 1):
            if not visited[i]:
                return

        red_total = blue_total = 0

        for i in range(1, N + 1):
            if is_selected[i]:
                red_total += people[i]
            else:
                blue_total += people[i]

        global result
        if result > abs(red_total - blue_total):
            result = abs(red_total - blue_total)

        return

    is_selected[cnt] = True
    divide(cnt + 1)
    is_selected[cnt] = False
    divide(cnt + 1)


divide(1)
if result == sys.maxsize:
    print(-1)
else:
    print(result)
