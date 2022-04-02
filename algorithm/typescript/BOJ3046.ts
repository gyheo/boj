// https://www.acmicpc.net/problem/3046

import fs = require("fs");

const input: number[] = fs.readFileSync("/dev/stdin").toString().trim().split(" ").map(Number);

const R1: number = input[0];
const S: number = input[1];

console.log(2 * S - R1);
