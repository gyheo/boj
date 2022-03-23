# problem : https://www.acmicpc.net/problem/2798

import sys

BLACKJACK_COUNT = 3
answer = -sys.maxsize
selected = [0] * 3

N, M = map(int, sys.stdin.readline().rstrip().split())
cards = list(map(int, sys.stdin.readline().rstrip().split()))


def select(count: int, start: int):
    if count == BLACKJACK_COUNT:
        sum = 0
        for i in range(0, BLACKJACK_COUNT):
            sum += selected[i]

        global answer
        if sum <= M and sum > answer:
            answer = sum
        return

    for i in range(start, N):
        selected[count] = cards[i]
        select(count + 1, i + 1)


select(0, 0)
print(answer)
