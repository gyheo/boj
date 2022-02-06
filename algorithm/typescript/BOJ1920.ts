// problem : https://www.acmicpc.net/problem/1920

import fs = require("fs");

const input: string[] = fs.readFileSync("/dev/stdin").toString().split("\n");
const N: number = Number(input[0]);
const A = new Map();
input[1]
  .split(" ")
  .map(Number)
  .forEach((data) => {
    A.set(data, 1);
  });
const M: number = Number(input[2]);
const data: number[] = input[3].split(" ").map(Number);
const result: number[] = new Array();

data.forEach((num) => {
  if (A.has(num)) {
    result.push(1);
  } else {
    result.push(0);
  }
});

console.log(result.join("\n"));
