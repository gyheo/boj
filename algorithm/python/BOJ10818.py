# problem : https://www.acmicpc.net/problem/10818
import sys

N = int(sys.stdin.readline().rstrip())
arr = list(map(int, sys.stdin.readline().rstrip().split()))
min_value, max_value = sys.maxsize, -sys.maxsize
for num in arr:
    if num < min_value:
        min_value = num
    if num > max_value:
        max_value = num

print(min_value, max_value)
