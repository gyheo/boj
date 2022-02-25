// problem : https://www.acmicpc.net/problem/2908

import fs = require("fs");

const input: string[] = fs.readFileSync("/dev/stdin").toString().split(" ");
const A: number = Number(input[0].split("").reverse().join(""));
const B: number = Number(input[1].split("").reverse().join(""));

if (A > B) {
  console.log(A);
} else {
  console.log(B);
}
