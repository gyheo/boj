// problem : https://www.acmicpc.net/problem/10816

import fs = require("fs");

const input: string[] = fs.readFileSync("/dev/stdin").toString().split("\n");
const result: number[] = [];

const N: number = Number(input[0]);
const card1: number[] = input[1].split(" ").map(Number);
const M: number = Number(input[2]);
const card2: number[] = input[3].split(" ").map(Number);
const map = new Map();

card1.forEach((num) => {
  if (!map.has(num)) {
    map.set(num, 1);
  } else {
    map.set(num, map.get(num) + 1);
  }
});

card2.forEach((num) => result.push(map.get(num) > 0 ? map.get(num) : 0));

console.log(result.join(" "));
