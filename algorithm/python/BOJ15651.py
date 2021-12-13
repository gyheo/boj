# from https://www.acmicpc.net/problem/15651

import sys

N, M = map(int, sys.stdin.readline().split())

l = list(map(lambda x: x, range(1, N + 1)))
result = [0] * M


def permutation(cnt):
    if cnt == M:
        for num in result:
            print(num, end=" ")
        print()

        return

    for i in range(0, len(l)):
        result[cnt] = l[i]
        permutation(cnt + 1)


permutation(0)
