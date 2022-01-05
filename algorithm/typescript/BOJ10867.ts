// problem : https://www.acmicpc.net/problem/10867

import fs = require("fs");
const input: string[] = fs.readFileSync("/dev/stdin").toString().split("\n");
// const N: number = Number(input[0]);
const set = new Set(input[1].split(" ").map(Number));
const array = Array.from(set);

array.sort((a, b) => {
  return a - b;
});

console.log(array.join(" "));
