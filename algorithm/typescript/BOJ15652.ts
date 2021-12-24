// from https://www.acmicpc.net/problem/15652

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

function combination(cnt: number, start: number): void { 
  if (cnt == M) {
    for (let i = 0; i < M; i++) {
      result.push(`${outputList[i]} `);
    }
    result.push(`\n`);
    return;
  }

  for (let i = start; i < N; i++) {
    outputList[cnt] = inputList[i];
    combination(cnt + 1, i);
  }
}

combination(0, 0);
console.log(result.join(""));