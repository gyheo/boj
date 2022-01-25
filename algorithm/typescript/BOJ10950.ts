// problem : https://www.acmicpc.net/problem/10950

import fs = require("fs");

const input: string[] = fs.readFileSync("/dev/stdin").toString().split("\n");
const result: number[] = [];
const T: number = Number(input[0]);

for (let i = 1; i <= T; i++) {
  const data: number[] = input[i].split(" ").map(Number);

  const A: number = data[0];
  const B: number = data[1];

  result.push(A + B);
}

console.log(result.join("\n"));
