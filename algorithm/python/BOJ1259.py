# problem : https://www.acmicpc.net/problem/1259

import sys

answer = list()
input_number = sys.stdin.readline().rstrip()
while input_number != "0":
    reverse_number = input_number[::-1]

    if reverse_number == input_number:
        answer.append("yes")
    else:
        answer.append("no")

    input_number = sys.stdin.readline().rstrip()

for item in answer:
    print(item)
