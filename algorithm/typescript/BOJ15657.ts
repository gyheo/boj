// problem : https://www.acmicpc.net/problem/15657

import fs = require("fs");
const input: string[] = fs.readFileSync("/dev/stdin").toString().split("\n");
const NM: number[] = input[0].split(" ").map(Number);
const N: number = NM[0];
const M: number = NM[1];
const output: number[] = Array(N).fill(0);
const result: string[] = [];
const inputData: number[] = input[1].split(" ").map(Number);

inputData.sort((a, b) => {
  return a - b;
});

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
    combination(cnt + 1, i);
  }
}

combination(0, 0);
console.log(result.join(""));
