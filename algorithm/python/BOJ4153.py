# problem : https://www.acmicpc.net/problem/4153

import sys

side_list = list(map(int, sys.stdin.readline().rstrip().split()))

while side_list[0] != 0 and side_list[1] != 0 and side_list[2] != 0:
    side_list.sort()
    if side_list[2] ** 2 == side_list[0] ** 2 + side_list[1] ** 2:
        print("right")
    else:
        print("wrong")

    side_list = list(map(int, sys.stdin.readline().rstrip().split()))

