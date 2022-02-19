// problem : https://www.acmicpc.net/problem/3052

import fs = require("fs");

const input: number[] = fs.readFileSync("/dev/stdin").toString().trim().split("\n").map(Number);

const set = new Set();
input.forEach((num) => {
  set.add(num % 42);
});

console.log(set.size);
