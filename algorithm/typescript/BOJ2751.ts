// problem : https://www.acmicpc.net/problem/2751

import fs = require("fs");

const input: string[] = fs.readFileSync("/dev/stdin").toString().split("\n");
const N: number = Number(input[0]);
const result: number[] = [];

for (let i = 1; i <= N; i++) {
  result.push(Number(input[i]));
}

result.sort((a, b) => {
  return a - b;
});

console.log(result.join("\n"));
