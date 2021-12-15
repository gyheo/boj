# from https://www.acmicpc.net/problem/15654

import sys
N, M = map(int, sys.stdin.readline().split())
input_list = list(map(int, sys.stdin.readline().split()))
input_list.sort()
output_list = [0] * N
is_selected = [False] * N


def permutation(cnt):
    if cnt == M:
        for i in range(0, M):
            print(output_list[i], end=" ")
        print()
        return

    for i in range(0, N):
        if is_selected[i]:
            continue
        is_selected[i] = True
        output_list[cnt] = input_list[i]
        permutation(cnt + 1)
        is_selected[i] = False


permutation(0)
