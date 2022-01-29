# problem : https://www.acmicpc.net/problem/17219

import sys

N, M = map(int, sys.stdin.readline().rstrip().split())
address_password_dict = dict()
password_list = list()

for i in range(0, N):
    address, password = sys.stdin.readline().rstrip().split()
    address_password_dict[address] = password

for i in range(0, M):
    address = sys.stdin.readline().rstrip()
    password_list.append(address_password_dict[address])

for password in password_list:
    print(password)
