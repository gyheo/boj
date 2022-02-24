# problem : https://www.acmicpc.net/problem/2908

import sys

A_list, B_list = map(list, sys.stdin.readline().split())

A_list.reverse()
B_list.reverse()

A = ''.join(A_list)
B = ''.join(B_list)

if int(A) > int(B):
    print(A)
else:
    print(B)
