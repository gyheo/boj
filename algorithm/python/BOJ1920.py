#  problem: https: // www.acmicpc.net/problem/1920

dic = dict()
N = int(input())
list1 = list(map(int, input().split()))
for key in list1:
    dic[key] = 1

M = int(input())
list2 = list(map(int, input().split()))
for key in list2:
    if (dic.get(key) != None):
        print(1)
    else:
        print(0)
