// problem : https://www.acmicpc.net/problem/11047

import fs = require("fs");

const input: string[] = fs.readFileSync("/dev/stdin").toString().split("\n");
const inputData: number[] = input[0].split(" ").map(Number);
const N: number = inputData[0];
let K: number = inputData[1];

let answer: number = 0;

for (let i = N; i >= 1; i--) {
  answer += Math.floor(K / Number(input[i]));
  K %= Number(input[i]);
}

console.log(answer);
