// https://www.acmicpc.net/problem/2438

import fs = require("fs");

const N: number = Number(fs.readFileSync("/dev/stdin").toString());
const result: string[] = [];

for (let i = 0; i < N; i++) {
  for (let j = 0; j <= i; j++) {
    result.push("*");
  }
  result.push("\n");
}

result.pop();
console.log(result.join(""));
