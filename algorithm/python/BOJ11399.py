# problem : https://www.acmicpc.net/problem/11399

import sys

N = int(sys.stdin.readline().rstrip())
time_list = list(map(int, sys.stdin.readline().rstrip().split()))

time_list.sort()

answer = 0
for i in range(0, N):
    for j in range(0, i + 1):
        answer += time_list[j]

print(answer)
