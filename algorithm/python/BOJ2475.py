# problem : https://www.acmicpc.net/problem/2475

import sys

koi_id = list(map(int, sys.stdin.readline().rstrip().split()))

total = 0
for id in koi_id:
    total += pow(id, 2)

answer = total % 10
print(answer)
