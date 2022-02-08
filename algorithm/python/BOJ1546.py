# problem : https://www.acmicpc.net/problem/1546

import sys

N = int(sys.stdin.readline().rstrip())
score = list(map(int, sys.stdin.readline().rstrip().split()))
score.sort()
sum = 0
for i in range(0, N):
    score[i] = score[i] / score[N-1] * 100
    sum += score[i]

print(sum / N)
