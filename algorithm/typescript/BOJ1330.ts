// problem : https://www.acmicpc.net/problem/1330

import fs = require("fs");

const input: string[] = fs.readFileSync("/dev/stdin").toString().split(" ");

const A: number = Number(input[0]);
const B: number = Number(input[1]);

if (A > B) {
  console.log(">");
} else if (A < B) {
  console.log("<");
} else {
  console.log("==");
}
