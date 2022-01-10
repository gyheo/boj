// problem : https://www.acmicpc.net/problem/10818

import fs = require("fs");
const input: string[] = fs.readFileSync("/dev/stdin").toString().split("\n");
const N: number = Number(input[0]);
const arr: number[] = input[1].split(" ").map(Number);

let min: number = Number.MAX_SAFE_INTEGER,
  max: number = Number.MIN_SAFE_INTEGER;

arr.forEach((num) => {
  if (num < min) {
    min = num;
  }
  if (num > max) {
    max = num;
  }
});

console.log(`${min} ${max}`);
