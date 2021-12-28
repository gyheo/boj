// from https://www.acmicpc.net/problem/15655

import fs = require("fs");

const input: string[] = fs.readFileSync("/dev/stdin").toString().split("\n");
const data: string[] = input[0].split(" ");

const N: number = Number(data[0]);
const M: number = Number(data[1]);

const inputData = input[1]
  .split(" ")
  .map(Number)
  .sort((a, b) => {
    return a - b;
  });
const result = [];
const output = [];

function combination(cnt: number, start: number): void {
  if (cnt == M) {
    for (let i = 0; i < M; i++) {
      result.push(`${output[i]} `);
    }
    result.push(`\n`);
    return;
  }
  for (let i = start; i < N; i++) {
    output[cnt] = inputData[i];
    combination(cnt + 1, i + 1);
  }
}

combination(0, 0);
console.log(result.join(""));
