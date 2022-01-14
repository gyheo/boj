// problem : https://www.acmicpc.net/problem/2562

import fs = require("fs");

const input: number[] = fs.readFileSync("/dev/stdin").toString().split("\n").map(Number);
let max: number = Number.MIN_SAFE_INTEGER;
let maxIndex: number = -1;

for (const index in input) {
  if (input[index] > max) {
    max = input[index];
    maxIndex = Number(index);
  }
}

console.log(max);
console.log(maxIndex + 1);
