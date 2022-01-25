# problem : https://www.acmicpc.net/problem/10950

import sys

T = int(sys.stdin.readline().rstrip())

answer = []
for i in range(0, T):
    A, B = map(int, sys.stdin.readline().rstrip().split())
    answer.append(A + B)

for ans in answer:
    print(ans)
