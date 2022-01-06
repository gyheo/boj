// problem : https://www.acmicpc.net/problem/1764

import fs = require("fs");

const input: string[] = fs.readFileSync("/dev/stdin").toString().split("\n");
const NM: number[] = input[0].split(" ").map(Number);
const N: number = NM[0];
const M: number = NM[1];
const result: string[] = [];
const map = new Map();

for (let i = 1; i <= N; i++) {
  map.set(input[i], 1);
}

for (let i = N + 1; i <= N + M; i++) {
  if (map.has(input[i])) {
    map.set(input[i], map.get(input[i]) + 1);

    if (map.get(input[i]) >= 2) {
      result.push(input[i]);
    }
  } else {
    map.set(input[i], 1);
  }
}

result.sort();
console.log(result.length);
console.log(result.join("\n"));
