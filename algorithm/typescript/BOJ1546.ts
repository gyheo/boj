// problem : https://www.acmicpc.net/problem/1546

import fs = require("fs");

const input: string[] = fs.readFileSync("/dev/stdin").toString().split("\n");
const N: number = Number(input[0]);
const score: number[] = input[1].split(" ").map(Number);
let max = Number.MIN_SAFE_INTEGER;

for (let i = 0; i < N; i++) {
  if (max < score[i]) {
    max = score[i];
  }
}

let sum: number = 0;
for (let i = 0; i < N; i++) {
  score[i] = (score[i] / max) * 100;

  sum += score[i];
}

console.log(sum / N);
