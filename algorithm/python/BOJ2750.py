# problem : https://www.acmicpc.net/problem/2750

import sys

N = int(sys.stdin.readline().rstrip())
arr = list()

for i in range(0, N):
    num = int(sys.stdin.readline().rstrip())
    arr.append(num)

arr.sort()

for num in arr:
    print(num)
