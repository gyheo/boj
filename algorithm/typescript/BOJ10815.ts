// problem : https://www.acmicpc.net/problem/10815

import fs = require("fs");

const input: string[] = fs.readFileSync("/dev/stdin").toString().split("\n");
const result: number[] = [];
const N: number = Number(input[0]);
const nCard: number[] = input[1].split(" ").map(Number);
const M: number = Number(input[2]);
const mCard: number[] = input[3].split(" ").map(Number);
const map = new Map();

nCard.forEach((number) => {
  map.set(number, 1);
});

mCard.forEach((number) => {
  const value = map.get(number) == 1 ? 1 : 0;
  result.push(value);
});

console.log(result.join(" "));
