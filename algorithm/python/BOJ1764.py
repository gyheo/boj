# problem : https://www.acmicpc.net/problem/1764

import sys

N, M = map(int, sys.stdin.readline().split())
name_dict = dict()
result = list()

for i in range(0, N):
    name = sys.stdin.readline().rstrip()
    name_dict[name] = 1

for i in range(0, M):
    name = sys.stdin.readline().rstrip()
    if name_dict.get(name) != None:
        result.append(name)

result.sort()
print(len(result))
for name in result:
    print(name)
