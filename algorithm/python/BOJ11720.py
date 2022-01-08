# problem : https://www.acmicpc.net/problem/11720

import sys

N = int(sys.stdin.readline())
s = sys.stdin.readline().rstrip()

sum = 0
for i in range(0, len(s)):
    sum += int(s[i])

print(sum)
