# problem : https://www.acmicpc.net/problem/2562

import sys

max = -sys.maxsize
max_index = -1

for i in range(0, 9):
    num = int(sys.stdin.readline().rstrip())

    if num > max:
        max = num
        max_index = i

print(max)
print(max_index + 1)
