// problem : https://www.acmicpc.net/problem/2750

import fs = require("fs");

const input: number[] = fs.readFileSync("/dev/stdin").toString().split("\n").map(Number);
const arr: number[] = [];
const N: number = input[0];

for (let i = 1; i <= N; i++) {
  let num: number = input[i];
  arr.push(num);
}

arr.sort((a, b) => {
  return a - b;
});

console.log(arr.join("\n"));
