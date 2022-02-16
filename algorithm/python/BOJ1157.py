# problem : https://www.acmicpc.net/problem/1157

import sys

alphabet_list = [0] * 27
sentence = sys.stdin.readline().rstrip()

for i in range(0, len(sentence)):
    index = ord(sentence[i].upper())
    alphabet_list[index - 65] += 1

max_value = -sys.maxsize
max_index = -1

for i in range(0, len(alphabet_list)):
    if max_value < alphabet_list[i]:
        max_index = i
        max_value = alphabet_list[i]

answer = (chr(max_index + 65))

for i in range(0, len(alphabet_list)):
    if i != max_index and max_value <= alphabet_list[i]:
        answer = "?"
        break

print(answer)
