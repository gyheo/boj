// https://www.acmicpc.net/problem/9498

import fs = require("fs");

const score: number = Number(fs.readFileSync("/dev/stdin").toString());
let answer: string = "";

if (score >= 90) {
  answer = "A";
} else if (score >= 80) {
  answer = "B";
} else if (score >= 70) {
  answer = "C";
} else if (score >= 60) {
  answer = "D";
} else {
  answer = "F";
}

console.log(answer);
