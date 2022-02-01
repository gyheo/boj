// problem : https://www.acmicpc.net/problem/10952

import fs = require("fs");

const input: string[] = fs.readFileSync("/dev/stdin").toString().split("\n");
const answer: number[] = [];

for (let i = 0; i < input.length; i++) {
  const numbers: number[] = input[i].split(" ").map(Number);

  const A: number = numbers[0];
  const B: number = numbers[1];

  if (A == 0 && B == 0) {
    break;
  }

  answer.push(A + B);
}

console.log(answer.join("\n"));
