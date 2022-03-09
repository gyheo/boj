# problem : https://www.acmicpc.net/problem/1082

import sys

N = int(sys.stdin.readline())
stack = list()
answer = list()

for i in range(0, N):
    cmd = sys.stdin.readline()

    if cmd.startswith("push"):
        num = int(cmd[5:])
        stack.append(num)
    elif cmd.startswith("pop"):
        if len(stack) == 0:
            answer.append(-1)
        else:
            answer.append(stack.pop())
    elif cmd.startswith("size"):
        answer.append(len(stack))
    elif cmd.startswith("empty"):
        if len(stack) == 0:
            answer.append(1)
        else:
            answer.append(0)
    else:
        if len(stack) == 0:
            answer.append(-1)
        else:
            answer.append(stack[len(stack) - 1])

for item in answer:
    print(item)
