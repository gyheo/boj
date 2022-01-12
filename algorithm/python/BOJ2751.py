# problem : https://www.acmicpc.net/problem/2751

import sys

N = int(sys.stdin.readline().rstrip())
arr = list()

for i in range(0, N):
    arr.append(int(sys.stdin.readline().rstrip()))

arr.sort()

for i in range(0, N):
    print(arr[i])
