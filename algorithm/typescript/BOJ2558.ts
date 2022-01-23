// https://www.acmicpc.net/problem/2558

import fs = require("fs");

const input: number[] = fs.readFileSync("/dev/stdin").toString().split("\n").map(Number);

const A: number = input[0];
const B: number = input[1];

console.log(A + B);
