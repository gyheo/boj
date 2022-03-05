// problem : https://www.acmicpc.net/problem/11866

import fs = require("fs");

const input: number[] = fs.readFileSync("/dev/stdin").toString().split(" ").map(Number);

const N: number = input[0];
const K: number = input[1];

const array: number[] = new Array(N).fill(0);
const answer: number[] = new Array();

for (let i = 0; i < N; i++) {
  array[i] = i + 1;
}

while (array.length != 0) {
  for (let i = 1; i < K; i++) {
    const num: number = array.shift();
    array.push(num);
  }
  const josephusNum: number = array.shift();
  answer.push(josephusNum);
}

console.log(`<${answer.join(", ")}>`);
