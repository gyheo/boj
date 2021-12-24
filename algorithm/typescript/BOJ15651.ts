// from https://www.acmicpc.net/problem/15651

import fs = require("fs");

const input = fs.readFileSync("/dev/stdin").toString().split(" ");
const N: number = parseInt(input[0]);
const M: number = parseInt(input[1]);

const inputList = [];
const outputList = [];
const result = [];

for (let i = 0; i < N; i++) {
  inputList.push(i + 1);
}

function permutation(cnt: number): void { 
  if (cnt == M) {
    for (let i = 0; i < M; i++) {
      result.push(`${outputList[i]} `);
    }
    result.push(`\n`);
    return;
  }

  for (let i = 0; i < N; i++) {
    outputList[cnt] = inputList[i];
    permutation(cnt + 1);
  }
}

permutation(0);
console.log(result.join(""));