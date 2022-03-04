// problem : https://www.acmicpc.net/submit/10989

import fs = require("fs");

const input: number[] = fs.readFileSync("/dev/stdin").toString().split("\n").map(Number);
const array: number[] = new Array(10001).fill(0);
const answer: number[] = new Array();

for (let i = 1; i < input[0] + 1; i++) {
  const index: number = input[i];
  array[index]++;
}

for (let i = 0; i < 10001; i++) {
  for (let j = 0; j < array[i]; j++) {
    answer.push(i);
  }
}

console.log(answer.join("\n"));
