# from : https://www.acmicpc.net/problem/10816

import sys

card_dict = dict()

N = int(sys.stdin.readline().rstrip())
card_list1 = list(map(int, sys.stdin.readline().rstrip().split()))

for num in card_list1:
    if card_dict.get(num) == None:
        card_dict[num] = 1
    else:
        card_dict[num] += 1

M = int(sys.stdin.readline().rstrip())
card_list2 = list(map(int, sys.stdin.readline().rstrip().split()))

for num in card_list2:
    if card_dict.get(num) != None:
        print(card_dict[num], end=" ")
    else:
        print(0, end=" ")
