# from https://www.acmicpc.net/problem/15649
import sys

N, M = map(int, sys.stdin.readline().split())

is_used = [False] * N
l = list(map(lambda x: x, range(1, N + 1)))
result = [0] * M


def permutation(cnt):
    if cnt == M:
        for num in result:
            print(num, end=" ")
        print()

        return

    for i in range(0, len(l)):
        if is_used[i]:
            continue
        is_used[i] = True
        result[cnt] = l[i]
        permutation(cnt + 1)
        is_used[i] = False


permutation(0)
