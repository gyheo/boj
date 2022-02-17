# problem : https://www.acmicpc.net/problem/1152

import sys

string_list = sys.stdin.readline().rstrip().split()

answer = 0

for string in string_list:
    if string == "":
        continue

    answer += 1

print(answer)
