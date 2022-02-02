# problem : https://www.acmicpc.net/problem/8958

import sys

N = int(sys.stdin.readline())
answer = list()

for i in range(0, N):
    input_data = sys.stdin.readline()
    sum = 0
    total = 0

    for j in range(0, len(input_data)):
        if input_data[j] == 'O':
            sum += 1
            total += sum
        else:
            sum = 0

    answer.append(total)

for item in answer:
    print(item)
