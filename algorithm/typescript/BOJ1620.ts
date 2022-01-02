// from https://www.acmicpc.net/problem/1620

import fs = require("fs");

const input: string[] = fs.readFileSync("/dev/stdin").toString().split("\n");
const result: string[] = [];
const NM: string[] = input[0].split(" ");

const N: number = Number(NM[0]);
const M: number = Number(NM[1]);

const pokemonToNumMap = new Map();
const numToPokemonMap = new Map();

for (let i = 1; i <= N; i++) {
  const pokemon = input[i];
  pokemonToNumMap.set(pokemon, i);
  numToPokemonMap.set(i, pokemon);
}

for (let i = 1; i <= M; i++) {
  const pokemon = input[N + i];

  if (Number.isInteger(Number(pokemon))) {
    result.push(numToPokemonMap.get(Number(pokemon)));
  } else {
    result.push(pokemonToNumMap.get(pokemon));
  }
}

console.log(result.join("\n"));
