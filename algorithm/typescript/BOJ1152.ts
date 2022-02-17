// problem : https://www.acmicpc.net/problem/1152

import fs = require("fs");

const input: string[] = fs.readFileSync("/dev/stdin").toString().trim().split(" ");
let answer: number = 0;

console.log(input);
for (let i = 0, size = input.length; i < size; i++) {
  if (input[i] === "") {
    continue;
  }
  answer++;
}

console.log(answer);
