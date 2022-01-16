# problem : https://www.acmicpc.net/problem/2675

import sys

result = list()

T = int(sys.stdin.readline().rstrip())

for i in range(0, T):
    cnt, data = sys.stdin.readline().rstrip().split()
    output = ""

    for j in range(0, len(data)):
        for k in range(0, int(cnt)):
            output += data[j]

    result.append(output)

for item in result:
    print(item)
