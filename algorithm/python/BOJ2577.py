# from https://www.acmicpc.net/problem/2577

A = int(input())
B = int(input())
C = int(input())

digit_count = [0] * 10
result = str(A * B * C)
for i in range(0, len(result)):
    digit_count[int(result[i])] += 1

for i in range(0, 10):
    print(digit_count[i])
