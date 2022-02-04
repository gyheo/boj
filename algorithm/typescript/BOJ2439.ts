// problem : https://www.acmicpc.net/problem/2439

import fs = require("fs");

const N: number = Number(fs.readFileSync("/dev/stdin").toString());
const answer: string[] = new Array();

for (let i = N; i > 0; i--) {
  for (let j = 0; j < i - 1; j++) {
    answer.push(" ");
  }

  for (let k = N; k >= i; k--) {
    answer.push("*");
  }

  answer.push("\n");
}

answer.pop();
console.log(answer.join(""));
