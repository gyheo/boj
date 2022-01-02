# from https://www.acmicpc.net/problem/1620

import sys

N, M = map(int, sys.stdin.readline().split())
num_pokemon_dict = dict()
pokemon_num_dict = dict()

for i in range(1, N + 1):
    pokemon = sys.stdin.readline().rstrip()
    num_pokemon_dict[i] = pokemon
    pokemon_num_dict[pokemon] = i

for i in range(0, M):
    pokemon = sys.stdin.readline().rstrip()

    if pokemon.isdigit():
        print(num_pokemon_dict.get(int(pokemon)))
    else:
        print(pokemon_num_dict.get(pokemon))
