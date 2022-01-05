# problem : https://www.acmicpc.net/problem/10867

import sys

N = int(sys.stdin.readline())
s = set(map(int, sys.stdin.readline().split()))

l = list(s)
l.sort()

for num in l:
    print(num, end=" ")
