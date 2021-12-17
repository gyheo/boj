# from https://www.acmicpc.net/problem/15656

import sys

N, M = map(int, sys.stdin.readline().split())
input_list = list(map(int, sys.stdin.readline().split()))
input_list.sort()
output_list = [0] * N


def permutation(cnt):
    if cnt == M:
        for i in range(0, M):
            print(output_list[i], end=" ")
        print()

        return

    for i in range(0, N):
        output_list[cnt] = input_list[i]
        permutation(cnt + 1)


permutation(0)
