// problem : https://www.acmicpc.net/problem/2739

import fs = require("fs");

const N: number = Number(fs.readFileSync("/dev/stdin").toString());
const SIZE: number = 9;
const result: string[] = new Array();

for (let i = 1; i <= SIZE; i++) {
  result.push(`${N} * ${i} = ${N * i}`);
}

console.log(result.join("\n"));
