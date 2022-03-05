# problem : https://www.acmicpc.net/problem/11866

import sys
from collections import deque

N, K = map(int, sys.stdin.readline().rstrip().split())
deq = deque()
for i in range(1, N + 1):
    deq.append(i)

answer = list()

while len(deq) != 0:
    for i in range(1, K):
        num = deq.popleft()
        deq.append(num)
    josephus_num = deq.popleft()
    answer.append(josephus_num)

print("<", end='')
for i in range(0, len(answer) - 1):
    print("{}".format(answer[i]), end=", ")
print("{}>".format(answer[len(answer) - 1]))
