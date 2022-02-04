# https://www.acmicpc.net/problem/2439

import sys

N = int(sys.stdin.readline().rstrip())
answer = ""

for i in range(N, 0, -1):
    for j in range(0, i - 1):
        answer += " "

    for k in range(N, i - 1, -1):
        answer += "*"

    answer += "\n"

print(answer)
