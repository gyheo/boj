// # problem : https://www.acmicpc.net/problem/10998

import fs = require("fs");

const input: number[] = fs.readFileSync("/dev/stdin").toString().split(" ").map(Number);
const A: number = input[0];
const B: number = input[1];

console.log(A * B);
