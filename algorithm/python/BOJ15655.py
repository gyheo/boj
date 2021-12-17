# from https://www.acmicpc.net/problem/15655

import sys

N, M = map(int, sys.stdin.readline().split())
input_list = list(map(int, sys.stdin.readline().split()))
input_list.sort()
output_list = [0] * N


def combination(cnt, start):
    if cnt == M:
        for i in range(0, M):
            print(output_list[i], end=" ")
        print()

        return

    for i in range(start, N):
        output_list[cnt] = input_list[i]
        combination(cnt + 1, i + 1)


combination(0, 0)
