# https://www.acmicpc.net/problem/10952

import sys

answer_list = list()

while True:
    A, B = map(int, sys.stdin.readline().rstrip().split())

    if A == 0 and B == 0:
        break

    answer_list.append(A + B)

for value in answer_list:
    print(value)
