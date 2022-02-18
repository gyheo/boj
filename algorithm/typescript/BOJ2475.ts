// problem : https://www.acmicpc.net/problem/2475

import fs = require("fs");

const koiId: number[] = fs.readFileSync("/dev/stdin").toString().split(" ").map(Number);

let sum: number = 0;
koiId.forEach((num) => {
  sum += Math.pow(num, 2);
});

let answer: number = sum % 10;
console.log(answer);
