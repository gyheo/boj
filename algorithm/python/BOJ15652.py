# from https://www.acmicpc.net/problem/15652

import sys

N, M = map(int, sys.stdin.readline().split())
input_list = list(map(lambda x: x, range(1, N + 1)))
output_list = [0] * N


def combination(cnt, start):
    if cnt == M:
        for i in range(0, M):
            print(output_list[i], end=" ")
        print()

        return

    for i in range(start, N):
        output_list[cnt] = input_list[i]
        combination(cnt + 1, i)


combination(0, 0)
