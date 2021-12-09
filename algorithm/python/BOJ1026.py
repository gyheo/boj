N = int(input())
A = list(map(int, input().split()))
B = list(map(int, input().split()))

A.sort()
B.sort()

sum = 0
for i in range(0, N):
    sum += A[N - i - 1] * B[i]
print(sum)
