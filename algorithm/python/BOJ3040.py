select_list = [0] * 7
dwarf_list = [0] * 9


def combination(start, cnt):
    if cnt == 7:
        sum = 0
        for i in range(0, 7):
            sum += select_list[i]

        if sum == 100:
            for i in range(0, 7):
                print(select_list[i])

        return

    for i in range(start, 9):
        select_list[cnt] = dwarf_list[i]
        combination(i + 1, cnt + 1)


for i in range(0, 9):
    height = int(input())
    dwarf_list[i] = height

combination(0, 0)
