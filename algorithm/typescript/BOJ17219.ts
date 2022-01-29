// https://www.acmicpc.net/problem/17219

import fs = require("fs");

const input: string[] = fs.readFileSync("/dev/stdin").toString().split("\n");
const inputData: number[] = input[0].split(" ").map(Number);
const N: number = inputData[0];
const M: number = inputData[1];
const map = new Map();
const answer: string[] = [];

for (let i = 1; i <= N; i++) {
  const str: string[] = input[i].split(" ");

  const address: string = str[0];
  const password: string = str[1];

  map.set(address, password);
}

for (let i = N + 1; i <= N + M; i++) {
  answer.push(map.get(input[i]));
}

console.log(answer.join("\n"));
