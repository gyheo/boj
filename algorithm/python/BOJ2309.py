#  problem : https://www.acmicpc.net/problem/2309

import sys

TOTAL = 9
OUTPUT_LENGTH = 7
HEIGHT_SUM = 100

dwarf_height = [0] * TOTAL
output = [0] * OUTPUT_LENGTH
is_answer = False  # 여러 정답 중 한 번만 출력할 수 있도록 조건 추가


def select(cnt: int, start: int):
    if cnt == OUTPUT_LENGTH:
        height_sum = 0

        for i in range(0, OUTPUT_LENGTH):
            height_sum += output[i]

        global is_answer
        if height_sum == 100 and not is_answer:
            is_answer = True
            output.sort()
            for height in output:
                print(height)

        return

    for i in range(start, TOTAL):
        output[cnt] = dwarf_height[i]
        select(cnt + 1, i + 1)


for i in range(0, TOTAL):
    height = int(sys.stdin.readline().rstrip())
    dwarf_height[i] = height

select(0, 0)
