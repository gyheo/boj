// problem : https://www.acmicpc.net/problem/1026

import fs = require("fs");
const input: string[] = fs.readFileSync("/dev/stdin").toString().split("\n");
const N: number = Number(input[0]);
const A: number[] = input[1].split(" ").map(Number);
const B: number[] = input[2].split(" ").map(Number);

A.sort((a, b) => {
  // 오름차순
  return a - b;
});

B.sort((a, b) => {
  // 내림차순
  return b - a;
});

let result: number = 0;

for (let i = 0; i < N; i++) {
  result += A[i] * B[i];
}

console.log(result);
