// from https://www.acmicpc.net/problem/15654

import fs = require("fs")

const str: string[] = fs.readFileSync("/dev/stdin").toString().split("\n");
const NM = str[0].split(" ");
const N: number = parseInt(NM[0]);
const M: number = parseInt(NM[1]);

const input = str[1].split(" ").map(Number);
input.sort(function(a, b) { return a - b });
const output = [];
const result = [];
const isSelected = Array(N).fill(false);

function permutation(cnt: number): void {
  if (cnt == M) {
    for (let i = 0; i < M; i++) {
      result.push(`${output[i]} `);
    }
    result.push(`\n`);
    return;
  }

  for (let i = 0; i < N; i++) {
    if (isSelected[i]) continue;
    isSelected[i] = true;
    output[cnt] = input[i];
    permutation(cnt + 1);
    isSelected[i] = false;
  }
}

permutation(0);
console.log(result.join(''));
