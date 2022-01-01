// from https://www.acmicpc.net/problem/2742

import fs = require("fs");

const input: number = Number(fs.readFileSync("/dev/stdin").toString());
const result: number[] = [];

for (let i = input; i >= 1; i--) {
  result.push(i);
}

console.log(result.join("\n"));
