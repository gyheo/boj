// problem : # https://www.acmicpc.net/problem/2741

import fs = require("fs");

const N: number = Number(fs.readFileSync("/dev/stdin").toString());
const answer: number[] = new Array();

for (let i = 1; i <= N; i++) {
  answer.push(i);
}

console.log(answer.join("\n"));
