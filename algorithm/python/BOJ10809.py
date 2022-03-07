# problem : https://www.acmicpc.net/problem/10809

import sys

string = sys.stdin.readline().rstrip()
alphabet = [-1] * 26

for i in range(0, len(string)):
    if alphabet[ord(string[i]) - ord("a")] == -1:
        alphabet[ord(string[i]) - ord("a")] = i

for char in alphabet:
    print(char, end=" ")
