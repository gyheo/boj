// from https://www.acmicpc.net/problem/2577

import fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().split("\n");

const A = Number(input[0]);
const B = Number(input[1]);
const C = Number(input[2]);
const result = String(A * B * C);
const digit = Array(10).fill(0);

for (let i = 0; i < result.length; i++) {
	const idx = Number(result.charAt(i));
	digit[idx]++;
}

console.log(digit.join("\n"));