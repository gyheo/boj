# problem : https://www.acmicpc.net/problem/10951

import sys

answer_list = list()

while True:
    try:
        A, B = map(int, sys.stdin.readline().rstrip().split())
        answer_list.append(A + B)
    except:
        break

for value in answer_list:
    print(value)
