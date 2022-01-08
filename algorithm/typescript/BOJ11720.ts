// problem : https://www.acmicpc.net/problem/11720

import fs = require("fs");

const input: string[] = fs.readFileSync("/dev/stdin").toString().split("\n");
const N: number = Number(input[0]);
const str: string = input[1];

let result: number = 0;

for (let i = 0; i < N; i++) {
  result += Number(str.charAt(i));
}

console.log(result);
