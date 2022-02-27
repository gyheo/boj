# problem : https://www.acmicpc.net/problem/2164

import sys
from collections import deque

N = int(sys.stdin.readline().rstrip())

deq = deque()

for i in range(1, N + 1):
    deq.append(i)

while len(deq) != 1:
    deq.popleft()
    first = deq.popleft()
    deq.append(first)

print(deq.popleft())
