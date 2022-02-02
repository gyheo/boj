// problem : https://www.acmicpc.net/problem/8958

import fs = require("fs");

const input: string[] = fs.readFileSync("/dev/stdin").toString().split("\n");
const N: number = Number(input[0]);
const answer: number[] = [];

for (let i = 1; i <= N; i++) {
  const data: string = input[i];
  let total: number = 0,
    sum: number = 0;

  for (let j = 0, length = data.length; j < length; j++) {
    const ch = data.charAt(j);

    if (ch === "O") {
      sum++;
      total += sum;
    } else {
      sum = 0;
    }
  }

  answer.push(total);
}

console.log(answer.join("\n"));
