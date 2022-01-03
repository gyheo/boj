# problem : https://www.acmicpc.net/problem/10815

import sys

N = int(sys.stdin.readline())
l1 = list(map(int, sys.stdin.readline().split()))
d1 = dict()
for value in l1:
    d1[value] = 1

M = int(sys.stdin.readline())
l2 = list(map(int, sys.stdin.readline().split()))
for key in l2:
    if d1.get(key) != None:
        print(1, end=" ")
    else:
        print(0, end=" ")
