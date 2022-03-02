// problem : https://www.acmicpc.net/problem/10871

import fs = require("fs");

const input: string[] = fs.readFileSync("/dev/stdin").toString().split("\n");
const range: number[] = input[0].split(" ").map(Number);
const N: number = range[0];
const X: number = range[1];
const answer: number[] = new Array();

input[1].split(" ").forEach((num) => {
  if (Number(num) < X) {
    answer.push(Number(num));
  }
});

console.log(answer.join(" "));
