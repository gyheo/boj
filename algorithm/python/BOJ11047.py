# problem : https://www.acmicpc.net/problem/11047

import sys

coin = []
N, K = map(int, sys.stdin.readline().rstrip().split())
for i in range(0, N):
    money = int(sys.stdin.readline().rstrip())
    coin.append(money)

answer = 0
for i in range(N - 1, -1, -1):
    answer += K // coin[i]
    K %= coin[i]

print(answer)
