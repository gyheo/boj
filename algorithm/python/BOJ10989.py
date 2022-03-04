# problem : https://www.acmicpc.net/problem/10989

import sys

N = int(sys.stdin.readline().rstrip())
array_list = [0] * 10001
for i in range(1, N + 1):
    index = int(sys.stdin.readline().rstrip())
    array_list[index] += 1

for i in range(1, 10001):
    for j in range(0, array_list[i]):
        print(i)
