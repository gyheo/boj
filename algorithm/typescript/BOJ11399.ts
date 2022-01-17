// problem : https://www.acmicpc.net/problem/11399

import fs = require("fs");

const input: string[] = fs.readFileSync("/dev/stdin").toString().split("\n");
const N: number = Number(input[0]);
const list: number[] = input[1].split(" ").map(Number);

list.sort((a, b) => {
  return a - b;
});

let answer: number = 0;
for (let i = 0; i < N; i++) {
  for (let j = 0; j <= i; j++) {
    answer += list[j];
  }
}

console.log(answer);
