T = int(input())

answer = []
for i in range(0, T):
    A, B = map(int, input().split())
    answer.append(A + B)

for ans in answer:
    print(ans)
