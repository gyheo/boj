# problem : https://www.acmicpc.net/submit/10845

import sys

N = int(sys.stdin.readline().rstrip())
queue = list()
answer = list()

for i in range(0, N):
    cmd = sys.stdin.readline().rstrip()

    if cmd.startswith("push"):
        num = int(cmd[5:])
        queue.append(num)
    elif cmd.startswith("pop"):
        if len(queue) == 0:
            answer.append(-1)
        else:
            answer.append(queue[0])
            queue = queue[1:len(queue)]
    elif cmd.startswith("size"):
        answer.append(len(queue))
    elif cmd.startswith("empty"):
        if len(queue) == 0:
            answer.append(1)
        else:
            answer.append(0)
    elif cmd.startswith("front"):
        if len(queue) == 0:
            answer.append(-1)
        else:
            answer.append(queue[0])
    else:
        if len(queue) == 0:
            answer.append(-1)
        else:
            answer.append(queue[len(queue) - 1])

for item in answer:
    print(item)
