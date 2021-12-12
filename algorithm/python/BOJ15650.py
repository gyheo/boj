# from https://www.acmicpc.net/problem/15650

import sys
N, M = map(int, sys.stdin.readline().split())


def combination(cnt, start):
    if cnt == M:
        for i in range(0, M):
            print(result_list[i], end=" ")
        print()
        return
    for i in range(start, N):
        result_list[cnt] = input_list[i]
        combination(cnt + 1, i + 1)


input_list = list(map(lambda x: x, range(1, N + 1)))
result_list = [0] * N

combination(0, 0)
