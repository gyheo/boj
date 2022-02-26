# problem : https://www.acmicpc.net/problem/2920

import sys

arr_list = list(map(int, sys.stdin.readline().rstrip().split()))

if arr_list == [1, 2, 3, 4, 5, 6, 7, 8]:
    print("ascending")
elif arr_list == [8, 7, 6, 5, 4, 3, 2, 1]:
    print("descending")
else:
    print("mixed")
