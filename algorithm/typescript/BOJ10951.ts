// problem : https://www.acmicpc.net/problem/10951

import fs = require("fs");

const input: string[] = fs.readFileSync("/dev/stdin").toString().split("\n");
const result: number[] = [];

for (let i = 0; i < input.length - 1; i++) {
  const inputData: number[] = input[i].split(" ").map(Number);

  const A: number = inputData[0];
  const B: number = inputData[1];

  result.push(A + B);
}

console.log(result.join("\n"));
