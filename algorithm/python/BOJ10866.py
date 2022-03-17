# problem : https://www.acmicpc.net/problem/10866

import sys
from collections import deque
N = int(sys.stdin.readline().rstrip())
deque = deque()
answer = list()

for i in range(0, N):
    cmd = sys.stdin.readline().rstrip()

    if cmd.startswith("push_front"):
        num = int(cmd[cmd.index(" ") + 1:])
        deque.appendleft(num)
    elif cmd.startswith("push_back"):
        num = int(cmd[cmd.index(" ") + 1:])
        deque.append(num)
    elif cmd.startswith("pop_front"):
        if len(deque) == 0:
            answer.append(-1)
        else:
            answer.append(deque.popleft())
    elif cmd.startswith("pop_back"):
        if len(deque) == 0:
            answer.append(-1)
        else:
            answer.append(deque.pop())
    elif cmd.startswith("size"):
        answer.append(len(deque))
    elif cmd.startswith("empty"):
        if len(deque) == 0:
            answer.append(1)
        else:
            answer.append(0)
    elif cmd.startswith("front"):
        if len(deque) == 0:
            answer.append(-1)
        else:
            answer.append(deque[0])
    else:
        if len(deque) == 0:
            answer.append(-1)
        else:
            answer.append(deque[-1])

for item in answer:
    print(item)
