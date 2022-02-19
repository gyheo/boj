# problem : https://www.acmicpc.net/problem/3052

import sys

mod_set = set()

for i in range(0, 10):
    mod_set.add(int(sys.stdin.readline().rstrip()) % 42)

print(len(mod_set))
