# problem : https://www.acmicpc.net/problem/11650

import sys


N = int(sys.stdin.readline().rstrip())
point_list = list()

for i in range(0, N):
    x, y = map(int, sys.stdin.readline().rstrip().split())
    point_list.append([x, y])

point_list.sort(key=lambda p: (p[0], p[1]))

for point in point_list:
    print(point[0], point[1])
