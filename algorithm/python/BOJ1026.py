# problem : https://www.acmicpc.net/problem/1026

import sys

N = int(sys.stdin.readline())
A = list(map(int, sys.stdin.readline().split()))
B = list(map(int, sys.stdin.readline().split()))

A.sort()
B.sort(reverse=True)

sum = 0
for i in range(0, N):
    sum += A[i] * B[i]

print(sum)
